package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.api.AdminApi;
import com.cloudesire.platform.apiclient.api.ApplicationFileApi;
import com.cloudesire.platform.apiclient.api.ApplicationMetricApi;
import com.cloudesire.platform.apiclient.api.BillingItemApi;
import com.cloudesire.platform.apiclient.api.BudgetEstimateApi;
import com.cloudesire.platform.apiclient.api.CloudProviderApi;
import com.cloudesire.platform.apiclient.api.CompanyApi;
import com.cloudesire.platform.apiclient.api.CompanyLogoApi;
import com.cloudesire.platform.apiclient.api.CouponApi;
import com.cloudesire.platform.apiclient.api.DistributorApi;
import com.cloudesire.platform.apiclient.api.EventApi;
import com.cloudesire.platform.apiclient.api.InstancePricingApi;
import com.cloudesire.platform.apiclient.api.InvoiceApi;
import com.cloudesire.platform.apiclient.api.LoginApi;
import com.cloudesire.platform.apiclient.api.OrderApi;
import com.cloudesire.platform.apiclient.api.ProductApi;
import com.cloudesire.platform.apiclient.api.ProductFileApi;
import com.cloudesire.platform.apiclient.api.ProductImageFileApi;
import com.cloudesire.platform.apiclient.api.ProductVersionApi;
import com.cloudesire.platform.apiclient.api.PublicUserFileApi;
import com.cloudesire.platform.apiclient.api.ResellerApi;
import com.cloudesire.platform.apiclient.api.ResellerPricingApi;
import com.cloudesire.platform.apiclient.api.ResellingReportApi;
import com.cloudesire.platform.apiclient.api.RiskProfileApi;
import com.cloudesire.platform.apiclient.api.StackParameterValueApi;
import com.cloudesire.platform.apiclient.api.StatisticsApi;
import com.cloudesire.platform.apiclient.api.SubscriptionApi;
import com.cloudesire.platform.apiclient.api.UserApi;
import com.cloudesire.platform.apiclient.api.UserCompanyApi;
import com.cloudesire.platform.apiclient.api.VirtualMachineConfigurationApi;
import com.cloudesire.platform.apiclient.api.VMInstanceApi;
import com.cloudesire.platform.apiclient.api.VendorReportApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liberologico.cloudesire.cmw.ApiVersion;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.Validate;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.liberologico.cloudesire.cmw.model.constants.Parameters.VERSION;

public class CloudesireClient
{
    public static final Long LATEST_API_VERSION = ApiVersion.V20180504;

    private final Retrofit retrofit;
    private final String username;
    private final String password;
    private final String token;
    private final String impersonate;
    private final String baseUrl;
    private final ObjectMapper mapper;
    private final Interceptor interceptor;
    private final long version;

    private CloudesireClient( Builder builder )
    {
        this.username = builder.username;
        this.password = builder.password;
        this.token = builder.token;
        this.impersonate = builder.impersonate;
        this.baseUrl = builder.baseUrl;
        this.mapper = builder.mapper;
        this.interceptor = builder.interceptor;
        this.version = builder.version;

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout( 30, TimeUnit.SECONDS )     // connect timeout
                .readTimeout( 60, TimeUnit.SECONDS );       // socket timeout

        if ( username != null && password != null )
        {
            clientBuilder.addInterceptor( new BasicAuthInterceptor( username, password ) );
        }
        else if ( token != null )
        {
            clientBuilder.addInterceptor( getHeaderInterceptor( "CMW-Auth-Token", token ) );
        }

        if ( impersonate != null )
        {
            clientBuilder.addInterceptor( getHeaderInterceptor( "CMW-As-User", impersonate ) );
        }

        if ( interceptor != null ) clientBuilder.addInterceptor( interceptor );

        clientBuilder.addInterceptor( getParameterInterceptor( VERSION, String.valueOf( version ) ) );

        retrofit = new Retrofit.Builder()
                .addConverterFactory( JacksonConverterFactory.create( mapper ) )
                .baseUrl( baseUrl )
                .client( clientBuilder.build() )
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

    private Interceptor getParameterInterceptor( final String parameterName, final String parameterValue )
    {
        return new Interceptor()
        {
            @Override
            public Response intercept( Chain chain ) throws IOException
            {
                Request original = chain.request();
                HttpUrl originalHttpUrl = original.url();

                HttpUrl url = originalHttpUrl.newBuilder()
                        .addQueryParameter( parameterName, parameterValue )
                        .build();

                Request.Builder requestBuilder = original.newBuilder().url( url );
                Request request = requestBuilder.build();
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
        private Long version;

        public Builder()
        {
        }

        public Builder( String baseUrl, ObjectMapper mapper )
        {
            this.baseUrl = baseUrl;
            this.mapper = mapper;
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
            this.version = cloudesireClient.version;
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

        public Builder setApiVersion( long version )
        {
            this.version = version;
            return this;
        }

        public CloudesireClient build()
        {
            Validate.notBlank( baseUrl, "A baseUrl must be set" );
            Validate.notNull( mapper, "An ObjectMapper instance is required" );

            if ( ! baseUrl.endsWith( "/" ) ) baseUrl += "/";
            if ( version == null ) version = LATEST_API_VERSION;

            return new CloudesireClient( this );
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
                    .equals( interceptor, builder.interceptor ) && Objects.equals( version, builder.version );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( username, password, token, impersonate, baseUrl, mapper, interceptor, version );
        }
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

    public CloudProviderApi getCloudProviderApi()
    {
        return retrofit.create( CloudProviderApi.class );
    }

    public InstancePricingApi getInstancePricingApi()
    {
        return retrofit.create( InstancePricingApi.class );
    }

    public MessageApi getMessageApi()
    {
        return retrofit.create( MessageApi.class );
    }

    public ProductApi getProductApi()
    {
        return retrofit.create( ProductApi.class );
    }

    public ProductFileApi getProductFileApi()
    {
        return retrofit.create( ProductFileApi.class );
    }

    /**
     * @deprecated by {@link #getProductFileApi()}
     */
    @Deprecated
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

    public DistributorApi getDistributorApi()
    {
        return retrofit.create( DistributorApi.class );
    }

    public ResellerApi getResellerApi()
    {
        return retrofit.create( ResellerApi.class );
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

    public ApplicationMetricApi getApplicationMetricApi()
    {
        return retrofit.create( ApplicationMetricApi.class );
    }

    public StackParameterValueApi getStackParameterValueApi()
    {
        return retrofit.create( StackParameterValueApi.class );
    }

    public StatisticsApi getStatisticsApi()
    {
        return retrofit.create( StatisticsApi.class );
    }

    public VirtualMachineConfigurationApi getVirtualMachineConfigurationApi()
    {
        return retrofit.create( VirtualMachineConfigurationApi.class );
    }

    public EventApi getEventApi()
    {
        return retrofit.create( EventApi.class );
    }

    public CompanyLogoApi getCompanyLogoApi()
    {
        return retrofit.create( CompanyLogoApi.class );
    }
    // endregion

    public <T> T getApi( Class<T> api )
    {
        return retrofit.create( api );
    }

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
