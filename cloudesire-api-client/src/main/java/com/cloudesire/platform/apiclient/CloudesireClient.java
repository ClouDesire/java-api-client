package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.api.*;
import com.cloudesire.platform.apiclient.baseclient.BasicAuthCloudesireClient;
import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.interceptors.HeaderInterceptor;
import com.cloudesire.platform.apiclient.interceptors.ParameterInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.Validate;

import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.VERSION;

public class CloudesireClient extends BasicAuthCloudesireClient
{
    private final String token;
    private final String impersonate;
    private final String environment;
    private final Interceptor interceptor;
    private final long version;

    private CloudesireClient( Builder builder )
    {
        super( builder.mapper, builder.baseUrl, "Cloudesire API Client " + builder.version, builder.username, builder.password );
        this.token = builder.token;
        this.impersonate = builder.impersonate;
        this.environment = builder.environment;
        this.interceptor = builder.interceptor;
        this.version = builder.version;

        OkHttpClient.Builder okhttpClientBuilder = okHttpClient.newBuilder();

        if ( token != null )
        {
            okhttpClientBuilder.addInterceptor( new HeaderInterceptor( "CMW-Auth-Token", token ) );
        }

        if ( impersonate != null )
        {
            okhttpClientBuilder.addInterceptor( new HeaderInterceptor( "CMW-As-User", impersonate ) );
        }

        if ( environment != null )
        {
            okhttpClientBuilder.addInterceptor( new HeaderInterceptor( "MODE", environment ) );
        }

        if ( interceptor != null ) okhttpClientBuilder.addInterceptor( interceptor );

        okhttpClientBuilder.addInterceptor( new ParameterInterceptor( VERSION, String.valueOf( version ) ) );

        generateClients( okhttpClientBuilder );
    }

    public Builder newBuilder()
    {
        return new Builder( this );
    }

    public static class Builder
    {
        private ObjectMapper mapper;
        private Interceptor interceptor;
        private String username;
        private String password;
        private String token;
        private String impersonate;
        private String baseUrl;
        private String environment;
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
            this.environment = cloudesireClient.environment;
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

        public Builder setEnvironment( String environment )
        {
            this.environment = environment;
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
            if ( version == null ) version = ApiVersion.LATEST_API_VERSION;

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

    public CommentApi getCommentApi()
    {
        return retrofit.create( CommentApi.class );
    }

    public CloudProviderApi getCloudProviderApi()
    {
        return retrofit.create( CloudProviderApi.class );
    }

    public EnvironmentApi getEnvironmentApi()
    {
        return retrofit.create( EnvironmentApi.class );
    }

    public InstancePricingApi getInstancePricingApi()
    {
        return retrofit.create( InstancePricingApi.class );
    }

    public InstanceTypeApi getInstanceTypeApi()
    {
        return retrofit.create( InstanceTypeApi.class );
    }

    public ProductApi getProductApi()
    {
        return retrofit.create( ProductApi.class );
    }

    public ProductCategoryApi getProductCategoryApi()
    {
        return retrofit.create( ProductCategoryApi.class );
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

    public DistributorCatalogApi getDistributorCatalogApi()
    {
        return retrofit.create( DistributorCatalogApi.class );
    }

    public DistributorPricingApi getDistributorPricingApi()
    {
        return retrofit.create( DistributorPricingApi.class );
    }

    public ResellerCatalogApi getResellerCatalogApi()
    {
        return retrofit.create( ResellerCatalogApi.class );
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

    public VirtualMachineInstanceApi getVirtualMachineInstanceApi()
    {
        return retrofit.create( VirtualMachineInstanceApi.class );
    }

    public ApplicationFileApi getApplicationFileApi()
    {
        return retrofit.create( ApplicationFileApi.class );
    }

    public ApplicationMetricApi getApplicationMetricApi()
    {
        return retrofit.create( ApplicationMetricApi.class );
    }

    public StackParameterApi getStackParameterApi()
    {
        return retrofit.create( StackParameterApi.class );
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

    public MailEnvironmentApi getMailEnvironmentApi()
    {
        return retrofit.create( MailEnvironmentApi.class );
    }

    public BackupApi getBackupApi()
    {
        return retrofit.create( BackupApi.class );
    }

    public NodeRoleApi getNodeRoleApi()
    {
        return retrofit.create( NodeRoleApi.class );
    }

    public EventTestApi getEventTestApi()
    {
        return retrofit.create( EventTestApi.class );
    }

    public DependencyApi getDependencyApi()
    {
        return retrofit.create( DependencyApi.class );
    }

    public NotifyApi getNotifyApi()
    {
        return retrofit.create( NotifyApi.class );
    }

    public EnumApi getEnumApi()
    {
        return retrofit.create( EnumApi.class );
    }

    public BandwidthPricingApi getBandwidthPricingApi()
    {
        return retrofit.create( BandwidthPricingApi.class );
    }

    public ConfigurationParameterApi getConfigurationParameterApi()
    {
        return retrofit.create( ConfigurationParameterApi.class );
    }

    public CountryCodeApi getCountryCodeApi()
    {
        return retrofit.create( CountryCodeApi.class );
    }

    public DiskSpacePricingApi getDiskSpacePricingApi()
    {
        return retrofit.create( DiskSpacePricingApi.class );
    }
    // endregion

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CloudesireClient that = (CloudesireClient) o;
        return version == that.version && Objects.equals( username, that.username ) && Objects
                .equals( password, that.password ) && Objects.equals( token, that.token ) && Objects
                .equals( impersonate, that.impersonate ) && Objects.equals( environment, that.environment );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), username, password, token, impersonate, environment, version );
    }
}
