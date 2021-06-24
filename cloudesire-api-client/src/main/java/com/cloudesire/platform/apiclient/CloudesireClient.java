package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.api.*;
import com.cloudesire.platform.apiclient.baseclient.BasicAuthCloudesireClient;
import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.interceptors.HeaderInterceptor;
import com.cloudesire.platform.apiclient.interceptors.ParameterInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Cache;
import okhttp3.Interceptor;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.VERSION;
import static com.cloudesire.platform.apiclient.response.Headers.AUTH_TOKEN;
import static com.cloudesire.platform.apiclient.response.Headers.MISTICA;
import static com.cloudesire.platform.apiclient.response.Headers.MODE;
import static com.cloudesire.platform.apiclient.response.Headers.SSO_AUTH_PROVIDER;
import static com.cloudesire.platform.apiclient.response.Headers.SSO_AUTH_TOKEN;
import static com.cloudesire.platform.apiclient.response.Headers.SSO_AUTH_USER;

public class CloudesireClient extends BasicAuthCloudesireClient
{
    private static final Logger log = LoggerFactory.getLogger( CloudesireClient.class );

    private final String token;
    private final String ssoToken;
    private final String ssoUser;
    private final String ssoProvider;
    private final String impersonate;
    private final String environment;
    private final Interceptor interceptor;
    private final Cache cache;
    private final long version;

    private CloudesireClient( Builder builder )
    {
        super( builder.mapper, builder.baseUrl, "Cloudesire API Client " + builder.version, builder.username, builder.password );
        this.token = builder.token;
        this.ssoToken = builder.ssoToken;
        this.ssoUser = builder.ssoUser;
        this.ssoProvider = builder.ssoProvider;
        this.impersonate = builder.impersonate;
        this.environment = builder.environment;
        this.interceptor = builder.interceptor;
        this.version = builder.version;
        this.cache = builder.cache;

        if ( token != null )
        {
            addInterceptor( new HeaderInterceptor( AUTH_TOKEN, token ) );
        }

        if ( ssoToken != null && ssoUser != null && ssoProvider != null )
        {
            addInterceptor( new HeaderInterceptor( SSO_AUTH_TOKEN, ssoToken ) );
            addInterceptor( new HeaderInterceptor( SSO_AUTH_USER, ssoUser ) );
            addInterceptor( new HeaderInterceptor( SSO_AUTH_PROVIDER, ssoProvider ) );
        }

        if ( impersonate != null )
        {
            addInterceptor( new HeaderInterceptor( MISTICA, impersonate ) );
        }

        if ( environment != null )
        {
            addInterceptor( new HeaderInterceptor( MODE, environment ) );
        }

        if ( interceptor != null ) addInterceptor( interceptor );

        addInterceptor( new ParameterInterceptor( VERSION, String.valueOf( version ) ) );

        if ( cache != null ) addCache( cache );

        initialize();
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
        private String ssoToken;
        private String ssoUser;
        private String ssoProvider;
        private String impersonate;
        private String baseUrl;
        private String environment;
        private Long version;
        private Cache cache;

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
            this.ssoToken = cloudesireClient.ssoToken;
            this.ssoUser = cloudesireClient.ssoUser;
            this.ssoProvider = cloudesireClient.ssoProvider;
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

        public Builder withSsoAuthentication( String ssoToken, String ssoUser, String ssoProvider ) {
            this.ssoToken = ssoToken;
            this.ssoUser = ssoUser;
            this.ssoProvider = ssoProvider;
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

        public Builder setCache( Cache cache )
        {
            this.cache = cache;
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
                    && Objects.equals( token, builder.token ) && Objects.equals( ssoToken, builder.ssoToken )
                    && Objects.equals( ssoProvider, builder.ssoProvider ) && Objects.equals( ssoUser, builder.ssoUser )
                    && Objects.equals( impersonate, builder.impersonate ) && Objects.equals( baseUrl, builder.baseUrl )
                    && Objects.equals( mapper, builder.mapper ) && Objects.equals( interceptor, builder.interceptor )
                    && Objects.equals( version, builder.version );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( username, password, token, ssoToken, ssoUser, ssoProvider, impersonate, baseUrl, mapper, interceptor, version );
        }
    }

    // region retrofit factories
    public AdminApi getAdminApi()
    {
        return getApi( AdminApi.class );
    }

    public BudgetEstimateApi getBudgetEstimateApi()
    {
        return getApi( BudgetEstimateApi.class );
    }

    public CommentApi getCommentApi()
    {
        return getApi( CommentApi.class );
    }

    public CloudProviderApi getCloudProviderApi()
    {
        return getApi( CloudProviderApi.class );
    }

    public CloudCredentialApi getCloudCredentialApi()
    {
        return getApi( CloudCredentialApi.class );
    }

    public EnvironmentApi getEnvironmentApi()
    {
        return getApi( EnvironmentApi.class );
    }

    public InstancePricingApi getInstancePricingApi()
    {
        return getApi( InstancePricingApi.class );
    }

    public InstanceTypeApi getInstanceTypeApi()
    {
        return getApi( InstanceTypeApi.class );
    }

    public ProductApi getProductApi()
    {
        return getApi( ProductApi.class );
    }

    public ProductCategoryApi getProductCategoryApi()
    {
        return getApi( ProductCategoryApi.class );
    }

    public ProductFileApi getProductFileApi()
    {
        return getApi( ProductFileApi.class );
    }

    /**
     * @deprecated by {@link #getProductFileApi()}
     */
    @Deprecated
    public ProductImageFileApi getProductImageFileApi()
    {
        return getApi( ProductImageFileApi.class );
    }

    public ProductVersionApi getProductVersionApi()
    {
        return getApi( ProductVersionApi.class );
    }

    public RiskProfileApi getRiskProfileApi()
    {
        return getApi( RiskProfileApi.class );
    }

    public SubscriptionApi getSubscriptionApi()
    {
        return getApi( SubscriptionApi.class );
    }

    public UserApi getUserApi()
    {
        return getApi( UserApi.class );
    }

    public BillingItemApi getBillingItemApi()
    {
        return getApi( BillingItemApi.class );
    }

    public PublicUserFileApi getPublicUserFileApi()
    {
        return getApi( PublicUserFileApi.class );
    }

    public LoginApi getLoginApi()
    {
        return getApi( LoginApi.class );
    }

    public CouponApi getCouponApi()
    {
        return getApi( CouponApi.class );
    }

    public InvoiceApi getInvoiceApi()
    {
        return getApi( InvoiceApi.class );
    }

    public DistributorCatalogApi getDistributorCatalogApi()
    {
        return getApi( DistributorCatalogApi.class );
    }

    public DistributorPricingApi getDistributorPricingApi()
    {
        return getApi( DistributorPricingApi.class );
    }

    public ResellerCatalogApi getResellerCatalogApi()
    {
        return getApi( ResellerCatalogApi.class );
    }

    public ResellerPricingApi getResellerPricingApi()
    {
        return getApi( ResellerPricingApi.class );
    }

    public ProceedsReportApi getProceedsReportApi()
    {
        return getApi( ProceedsReportApi.class );
    }

    /**
     * @deprecated by {@link #getProceedsReportApi()}
     */
    @Deprecated
    public ResellingReportApi getResellingReportApi()
    {
        return getApi( ResellingReportApi.class );
    }

    /**
     * @deprecated by {@link #getProceedsReportApi()}
     */
    @Deprecated
    public VendorReportApi getVendorReportApi()
    {
        return getApi( VendorReportApi.class );
    }

    public CompanyApi getCompanyApi()
    {
        return getApi( CompanyApi.class );
    }

    public UserCompanyApi getUserCompanyApi()
    {
        return getApi( UserCompanyApi.class );
    }

    public DistributorApi getDistributorApi()
    {
        return getApi( DistributorApi.class );
    }

    public ResellerApi getResellerApi()
    {
        return getApi( ResellerApi.class );
    }

    public OrderApi getOrderApi()
    {
        return getApi( OrderApi.class );
    }

    public VirtualMachineInstanceApi getVirtualMachineInstanceApi()
    {
        return getApi( VirtualMachineInstanceApi.class );
    }

    public ApplicationFileApi getApplicationFileApi()
    {
        return getApi( ApplicationFileApi.class );
    }

    public ApplicationMetricApi getApplicationMetricApi()
    {
        return getApi( ApplicationMetricApi.class );
    }

    public StackParameterApi getStackParameterApi()
    {
        return getApi( StackParameterApi.class );
    }

    public StackParameterValueApi getStackParameterValueApi()
    {
        return getApi( StackParameterValueApi.class );
    }

    public StatisticsApi getStatisticsApi()
    {
        return getApi( StatisticsApi.class );
    }

    public VirtualMachineConfigurationApi getVirtualMachineConfigurationApi()
    {
        return getApi( VirtualMachineConfigurationApi.class );
    }

    public EventApi getEventApi()
    {
        return getApi( EventApi.class );
    }

    public CompanyLogoApi getCompanyLogoApi()
    {
        return getApi( CompanyLogoApi.class );
    }

    public MailEnvironmentApi getMailEnvironmentApi()
    {
        return getApi( MailEnvironmentApi.class );
    }

    public BackupApi getBackupApi()
    {
        return getApi( BackupApi.class );
    }

    public NodeRoleApi getNodeRoleApi()
    {
        return getApi( NodeRoleApi.class );
    }

    public EventTestApi getEventTestApi()
    {
        return getApi( EventTestApi.class );
    }

    public DependencyApi getDependencyApi()
    {
        return getApi( DependencyApi.class );
    }

    public NotifyApi getNotifyApi()
    {
        return getApi( NotifyApi.class );
    }

    public EnumApi getEnumApi()
    {
        return getApi( EnumApi.class );
    }

    public BackupPricingApi getBackupPricingApi()
    {
        return getApi( BackupPricingApi.class );
    }

    public BandwidthPricingApi getBandwidthPricingApi()
    {
        return getApi( BandwidthPricingApi.class );
    }

    public ConfigurationParameterApi getConfigurationParameterApi()
    {
        return getApi( ConfigurationParameterApi.class );
    }

    public CountryCodeApi getCountryCodeApi()
    {
        return getApi( CountryCodeApi.class );
    }

    public DiskSpacePricingApi getDiskSpacePricingApi()
    {
        return getApi( DiskSpacePricingApi.class );
    }

    public PaymentMethodApi getPaymentMethodApi()
    {
        return getApi( PaymentMethodApi.class );
    }

    public CompanyGroupApi getCompanyGroupApi()
    {
        return getApi( CompanyGroupApi.class );
    }

    public BulkApi getBulkApi()
    {
        return getApi( BulkApi.class );
    }

    public CartApi getCartApi()
    {
        return getApi( CartApi.class );
    }

    public CostsApi getCostsApi()
    {
        return getApi( CostsApi.class );
    }
    // endregion

    @Override
    protected Logger getLogger()
    {
        return log;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CloudesireClient that = (CloudesireClient) o;
        return version == that.version && Objects.equals( username, that.username ) && Objects
                .equals( password, that.password ) && Objects.equals( token, that.token ) && Objects
                .equals( ssoToken, that.ssoToken ) && Objects.equals( ssoProvider, that.ssoProvider ) && Objects
                .equals( ssoUser, that.ssoUser ) && Objects.equals( impersonate, that.impersonate ) && Objects
                .equals( environment, that.environment );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), username, password, token, ssoToken, ssoProvider, ssoUser, impersonate, environment, version );
    }
}
