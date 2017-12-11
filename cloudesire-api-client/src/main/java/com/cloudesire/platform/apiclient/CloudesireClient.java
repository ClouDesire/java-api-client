package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.api.AdminApi;
import com.cloudesire.platform.apiclient.api.ApplicationFileApi;
import com.cloudesire.platform.apiclient.api.BillingItemApi;
import com.cloudesire.platform.apiclient.api.BudgetEstimateApi;
import com.cloudesire.platform.apiclient.api.CompanyApi;
import com.cloudesire.platform.apiclient.api.CouponApi;
import com.cloudesire.platform.apiclient.api.InvoiceApi;
import com.cloudesire.platform.apiclient.api.LoginApi;
import com.cloudesire.platform.apiclient.api.MessageApi;
import com.cloudesire.platform.apiclient.api.OrderApi;
import com.cloudesire.platform.apiclient.api.ProductApi;
import com.cloudesire.platform.apiclient.api.ProductImageFileApi;
import com.cloudesire.platform.apiclient.api.ProductVersionApi;
import com.cloudesire.platform.apiclient.api.PublicUserFileApi;
import com.cloudesire.platform.apiclient.api.ResellerPricingApi;
import com.cloudesire.platform.apiclient.api.ResellingReportApi;
import com.cloudesire.platform.apiclient.api.RiskProfileApi;
import com.cloudesire.platform.apiclient.api.StackParameterValueApi;
import com.cloudesire.platform.apiclient.api.SubscriptionApi;
import com.cloudesire.platform.apiclient.api.UserApi;
import com.cloudesire.platform.apiclient.api.UserCompanyApi;
import com.cloudesire.platform.apiclient.api.VMConfigurationApi;
import com.cloudesire.platform.apiclient.api.VMInstanceApi;
import com.cloudesire.platform.apiclient.api.VendorReportApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.Validate;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class CloudesireClient
{
    private final Retrofit retrofit;
    private final String username;
    private final String password;
    private final String token;
    private final String impersonate;
    private final String baseUrl;
    private final ObjectMapper mapper;
    private final Interceptor interceptor;

    CloudesireClient( final String username, final String password, final String token, final String impersonate,
            String baseUrl, final ObjectMapper mapper, final Interceptor interceptor )
    {
        this.username = username;
        this.password = password;
        this.token = token;
        this.impersonate = impersonate;
        this.baseUrl = baseUrl;
        this.mapper = mapper;
        this.interceptor = interceptor;

        if ( ! baseUrl.endsWith( "/" ) ) baseUrl += "/";

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout( 30, TimeUnit.SECONDS )     // connect timeout
                .readTimeout( 60, TimeUnit.SECONDS );       // socket timeout

        if ( username != null && password != null )
        {
            builder.addInterceptor( new BasicAuthInterceptor( username, password ) );
        }
        else if ( token != null )
        {
            builder.addInterceptor( getHeaderInterceptor( "CMW-Auth-Token", token ) );
        }

        if ( impersonate != null )
        {
            builder.addInterceptor( getHeaderInterceptor( "CMW-As-User", impersonate ) );
        }

        if ( interceptor != null ) builder.addInterceptor( interceptor );

        retrofit = new Retrofit.Builder()
                .addConverterFactory( JacksonConverterFactory.create( mapper ) )
                .baseUrl( baseUrl )
                .client( builder.build() )
                .validateEagerly( true )
                .build();
    }


    private Interceptor getHeaderInterceptor( final String headerName, final String headerValue )
    {
        return new Interceptor()
        {
            @Override
            public Response intercept( Chain chain ) throws IOException
            {
                Request request = chain.request().newBuilder()
                        .addHeader( headerName, headerValue ).build();
                return chain.proceed( request );
            }
        };
    }

    public Builder newBuilder()
    {
        return new Builder( this );
    }

    public static class Builder
    {
        private String username;
        private String password;
        private String token;
        private String impersonate;
        private String baseUrl;
        private ObjectMapper mapper;
        private Interceptor interceptor;

        public Builder()
        {
        }

        public Builder( CloudesireClient cloudesireClient )
        {
            this.username = cloudesireClient.username;
            this.password = cloudesireClient.password;
            this.token = cloudesireClient.token;
            this.impersonate = cloudesireClient.impersonate;
            this.baseUrl = cloudesireClient.baseUrl;
            this.mapper = cloudesireClient.mapper;
            this.interceptor = cloudesireClient.interceptor;
        }

        public Builder setUsername( String username )
        {
            this.username = username;
            return this;
        }

        public Builder setPassword( String password )
        {
            this.password = password;
            return this;
        }

        public Builder setToken( String token )
        {
            this.token = token;
            return this;
        }

        public Builder setImpersonate( String impersonate )
        {
            this.impersonate = impersonate;
            return this;
        }

        public Builder setBaseUrl( String baseUrl )
        {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder setMapper( ObjectMapper mapper )
        {
            this.mapper = mapper;
            return this;
        }

        public Builder setInterceptor( Interceptor interceptor )
        {
            this.interceptor = interceptor;
            return this;
        }

        public CloudesireClient build()
        {
            Validate.notBlank( baseUrl );
            Validate.notNull( mapper );
            return new CloudesireClient( username, password, token, impersonate, baseUrl, mapper, interceptor );
        }

        @Override
        public boolean equals( Object o )
        {
            if ( this == o ) return true;
            if ( !( o instanceof Builder ) ) return false;
            Builder builder = (Builder) o;
            return Objects.equals( username, builder.username ) && Objects.equals( password, builder.password )
                    && Objects.equals( token, builder.token ) && Objects.equals( impersonate, builder.impersonate )
                    && Objects.equals( baseUrl, builder.baseUrl ) && Objects.equals( mapper, builder.mapper ) && Objects
                    .equals( interceptor, builder.interceptor );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( username, password, token, impersonate, baseUrl, mapper, interceptor );
        }
    }

    public MultipartBody.Part getUploadPayload( String fileName, byte[] payload )
    {
        RequestBody file = RequestBody.create(
                MediaType.parse("application/octet-stream"), payload );
        return MultipartBody.Part.createFormData( "file", fileName, file );
    }

    // region retrofit factories
    public AdminApi getAdminApi()
    {
        return retrofit.create( AdminApi.class );
    }

    public BudgetEstimateApi getBudgetEstimateApi()
    {
        return retrofit.create( BudgetEstimateApi.class );
    }

    public MessageApi getMessageApi()
    {
        return retrofit.create( MessageApi.class );
    }

    public ProductApi getProductApi()
    {
        return retrofit.create( ProductApi.class );
    }

    public ProductImageFileApi getProductImageFileApi()
    {
        return retrofit.create( ProductImageFileApi.class );
    }

    public ProductVersionApi getProductVersionApi()
    {
        return retrofit.create( ProductVersionApi.class );
    }

    public RiskProfileApi getRiskProfileApi()
    {
        return retrofit.create( RiskProfileApi.class );
    }

    public SubscriptionApi getSubscriptionApi()
    {
        return retrofit.create( SubscriptionApi.class );
    }

    public UserApi getUserApi()
    {
        return retrofit.create( UserApi.class );
    }

    public BillingItemApi getBillingItemApi()
    {
        return retrofit.create( BillingItemApi.class );
    }

    public PublicUserFileApi getPublicUserFileApi()
    {
        return retrofit.create( PublicUserFileApi.class );
    }

    public LoginApi getLoginApi()
    {
        return retrofit.create( LoginApi.class );
    }

    public CouponApi getCouponApi()
    {
        return retrofit.create( CouponApi.class );
    }

    public InvoiceApi getInvoiceApi()
    {
        return retrofit.create( InvoiceApi.class );
    }

    public ResellerPricingApi getResellerPricingApi()
    {
        return retrofit.create( ResellerPricingApi.class );
    }

    public ResellingReportApi getResellingReportApi()
    {
        return retrofit.create( ResellingReportApi.class );
    }

    public VendorReportApi getVendorReportApi()
    {
        return retrofit.create( VendorReportApi.class );
    }

    public CompanyApi getCompanyApi()
    {
        return retrofit.create( CompanyApi.class );
    }

    public UserCompanyApi getUserCompanyApi()
    {
        return retrofit.create( UserCompanyApi.class );
    }

    public OrderApi getOrderApi()
    {
        return retrofit.create( OrderApi.class );
    }

    public VMInstanceApi getVMInstanceApi()
    {
        return retrofit.create( VMInstanceApi.class );
    }

    public ApplicationFileApi getApplicationFileApi()
    {
        return retrofit.create( ApplicationFileApi.class );
    }

    public StackParameterValueApi getStackParameterValueApi()
    {
        return retrofit.create( StackParameterValueApi.class );
    }

    public VMConfigurationApi getVMConfigurationApi()
    {
        return retrofit.create( VMConfigurationApi.class );
    }
    // endregion

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof CloudesireClient ) ) return false;
        CloudesireClient that = (CloudesireClient) o;
        return Objects.equals( username, that.username ) && Objects.equals( password, that.password ) && Objects
                .equals( token, that.token ) && Objects.equals( impersonate, that.impersonate ) && Objects
                .equals( baseUrl, that.baseUrl ) && Objects.equals( mapper, that.mapper ) && Objects
                .equals( interceptor, that.interceptor );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( username, password, token, impersonate, baseUrl, mapper, interceptor );
    }
}
