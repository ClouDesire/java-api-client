package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.CloudCredentialsSupport;
import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.SubscriptionsPerProduct;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

public class ProductDTO extends NamedEntityDTO implements ProductL10nDTO, Comparable<ProductDTO>
{
    @ApiModelProperty( "Identifier of the product, cannot be changed after creation" )
    private String SKU;

    @Valid
    private UrlEntityDTO company;

    @Valid
    private UrlEntityDTO resellerCatalog;

    @NotNull
    @Valid
    private UrlEntityDTO category;

    private ProductType type;

    @ApiModelProperty( "The versions of the product" )
    @Valid
    private List<UrlEntityDTO> productVersion;

    @ApiModelProperty( "URLs where events of syndicated applications are dispatched" )
    @FieldAPI( sinceVersion = ApiVersion.V20190916 )
    private Set<String> syndicationEndpoints;

    @ApiModelProperty( value = "URL where events of syndicated applications are dispatched", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20190916 )
    private String syndicatedEndpoint;

    @ApiModelProperty( "Base URL for the product's API" )
    private String apiUrl;

    @ApiModelProperty( "The files linked to the product" )
    @Valid
    private List<UrlEntityDTO> files;

    @ApiModelProperty( "Short description of the product" )
    @Size( max = 4000, message = INVALID_SIZE )
    private String shortDescription;

    @ApiModelProperty( "Long description of the product" )
    @Size( max = 8192, message = INVALID_SIZE )
    private String longDescription;

    @ApiModelProperty( value = "Average rating received for the product", readOnly = true )
    private BigDecimal averageRating;

    @ApiModelProperty( value = "Number of ratings received for the product", readOnly = true )
    private Long numberOfRatings;

    @ApiModelProperty( hidden = true )
    private Boolean isFeatured = false;

    @ApiModelProperty( hidden = true )
    private String attributes;

    @Size( max = 65536, message = INVALID_SIZE )
    @ApiModelProperty( "Instructions shown to the customer that buys a subscription" )
    private String endUserInstructions;

    @ApiModelProperty( "Terms of service" )
    @Size( max = 65536, message = INVALID_SIZE )
    private String termsOfService;

    @ApiModelProperty( "Privacy policy" )
    @Size( max = 65536, message = INVALID_SIZE )
    private String privacy;

    @ApiModelProperty( "Service level agreement" )
    @Size( max = 65536, message = INVALID_SIZE )
    private String serviceLevelAgreement;

    @ApiModelProperty( "Tags associated to the product" )
    private Set<ProductTagDTO> tags;

    @ApiModelProperty( "Cloud providers associated to the product" )
    @Valid
    private List<UrlEntityDTO> cloudProviders;

    @ApiModelProperty( value = "If the product is an API", readOnly = true )
    @JsonProperty( "isApi" )
    private Boolean api;

    @ApiModelProperty( value = "If the product is a bundle of other products", readOnly = true )
    @JsonProperty( "isBundle" )
    private Boolean bundle;

    @ApiModelProperty( value = "If the product is a deployable", readOnly = true )
    @JsonProperty( "isManaged" )
    private Boolean managed;

    @ApiModelProperty( value = "If the product is a cloud service", readOnly = true )
    @JsonProperty( "isCloudService" )
    private Boolean cloudService;

    @ApiModelProperty( value = "If the product is imported from CSP", readOnly = true )
    @JsonProperty( "isCsp" )
    private Boolean csp;

    @ApiModelProperty( value = "If the product is a service", readOnly = true )
    @JsonProperty( "isService" )
    private Boolean service;

    @ApiModelProperty( value = "If the product is syndicated", readOnly = true )
    @JsonProperty( "isSyndicated" )
    private Boolean syndicated;

    @ApiModelProperty( value = "If the product is a bare VM", readOnly = true )
    @JsonProperty( "isVm" )
    private Boolean vm;

    @ApiModelProperty( "HTTPS certificate for the product's deployed VMs" )
    private String certificate;

    @ApiModelProperty( "HTTPS certificate private key" )
    private String privateKey;

    @ApiModelProperty( value = "If HTTPS certificate and private key have been uploaded", readOnly = true )
    private boolean keyPairPresent;

    @ApiModelProperty( value = "Wildcard hostname from provided certificate", readOnly = true )
    private String certificateHostname;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    @ApiModelProperty( hidden = true )
    private Set<String> environments;

    @ApiModelProperty( "If the product is in a draft state" )
    @JsonInclude( JsonInclude.Include.NON_DEFAULT )
    private boolean drafted;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    @ApiModelProperty( "Localized product metadata" )
    private Map<String, Object> extraData;

    @ApiModelProperty( "Frequently asked questions" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, String> faq;

    @ApiModelProperty( "The configuration parameters for the product" )
    @Valid
    private List<ConfigurationParameterDTO> configurationParameters;

    @ApiModelProperty( "Pre-shared secret to sign event notifications" )
    private String notificationSecretToken;

    private ProductDestination destination = ProductDestination.B2C;

    @ApiModelProperty( "If the product will be displayed in an iframe" )
    private Boolean frameable;

    @ApiModelProperty( "Date of first publishing on the marketplace" )
    private Date published;

    @ApiModelProperty( "The version that will be selected by default in the marketplace" )
    private UrlEntityDTO recommendedVersion;

    @ApiModelProperty( "Weight order for displaying on the marketplace" )
    private int weight;

    @ApiModelProperty( "Whether to silent emails to customer regarding product delivery" )
    private boolean silent;

    @ApiModelProperty( "The cost for the vendor to be present in the marketplace catalog" )
    private BigDecimal listingPrice;

    @ApiModelProperty( "Request approval of the product" )
    private boolean requestedForApproval;

    @ApiModelProperty( "Whether the CSP product is license-based or Azure marketplace" )
    private CspProductType cspProductType;

    @ApiModelProperty( "Authentication header name for the upstream API" )
    private String apiHeaderName;

    @ApiModelProperty( "Authentication header value for the upstream API" )
    private String apiHeaderValue;

    private SubscriptionsPerProduct subscriptionsPerProduct;

    @ApiModelProperty( "Require approvation for customer subscriptions" )
    private Boolean subscriptionApproval;

    @ApiModelProperty( "Message to display to the user on subscription termination" )
    @Size( max = 65536, message = INVALID_SIZE )
    private String terminationMessage;

    @ApiModelProperty( "Message to display to the user for Terms of Service acceptance" )
    @Size( max = 65536, message = INVALID_SIZE )
    private String tosAcceptance;

    @ApiModelProperty( "URLs to call for order validation" )
    @FieldAPI( sinceVersion = ApiVersion.V20210215 )
    private Set<@Size( max = 2000 ) @URL String> orderValidationUrls;

    @ApiModelProperty( hidden = true )
    @Size( max = 2000 )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20210215 )
    @URL
    private String orderValidationUrl;

    private CloudCredentialsSupport cloudCredentialsSupport;

    public ProductDTO( String name, String identifier, ProductType type, UrlEntityDTO company )
    {
        this( name, identifier, type );
        this.company = company;
    }

    public ProductDTO( String name, String identifier, ProductType type )
    {
        super( name );
        this.SKU = identifier;
        this.type = type;
    }

    @Override
    public int compareTo( ProductDTO o )
    {
        return getSKU().compareTo( o.getSKU() );
    }

    //region Auto-generated code
    public ProductDTO()
    {
    }

    public String getSKU()
    {
        return SKU;
    }

    public void setSKU( String SKU )
    {
        this.SKU = SKU;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public ProductType getType()
    {
        return type;
    }

    public void setType( ProductType type )
    {
        this.type = type;
    }

    public List<UrlEntityDTO> getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( List<UrlEntityDTO> productVersion )
    {
        this.productVersion = productVersion;
    }

    public String getLongDescription()
    {
        return longDescription;
    }

    public void setLongDescription( String longDescription )
    {
        this.longDescription = longDescription;
    }

    public UrlEntityDTO getCategory()
    {
        return category;
    }

    public void setCategory( UrlEntityDTO category )
    {
        this.category = category;
    }

    public Boolean getIsFeatured()
    {
        return isFeatured;
    }

    public void setIsFeatured( Boolean isFeatured )
    {
        this.isFeatured = isFeatured;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription( String shortDescription )
    {
        this.shortDescription = shortDescription;
    }

    public List<UrlEntityDTO> getFiles()
    {
        return files;
    }

    public void setFiles( List<UrlEntityDTO> files )
    {
        this.files = files;
    }

    public List<UrlEntityDTO> getCloudProviders()
    {
        return cloudProviders;
    }

    public void setCloudProviders( List<UrlEntityDTO> cloudProviders )
    {
        this.cloudProviders = cloudProviders;
    }

    public BigDecimal getAverageRating()
    {
        return averageRating;
    }

    public void setAverageRating( BigDecimal averageRating )
    {
        this.averageRating = averageRating;
    }

    public String getAttributes()
    {
        return attributes;
    }

    public void setAttributes( String attributes )
    {
        this.attributes = attributes;
    }

    public String getEndUserInstructions()
    {
        return endUserInstructions;
    }

    public void setEndUserInstructions( String endUserInstructions )
    {
        this.endUserInstructions = endUserInstructions;
    }

    public String getTermsOfService()
    {
        return termsOfService;
    }

    public void setTermsOfService( String termsOfService )
    {
        this.termsOfService = termsOfService;
    }

    public String getPrivacy()
    {
        return privacy;
    }

    public void setPrivacy( String privacy )
    {
        this.privacy = privacy;
    }

    public String getServiceLevelAgreement()
    {
        return serviceLevelAgreement;
    }

    public void setServiceLevelAgreement( String serviceLevelAgreement )
    {
        this.serviceLevelAgreement = serviceLevelAgreement;
    }

    @Override
    public Map<String, Object> getExtraData()
    {
        return extraData;
    }

    public void setExtraData( Map<String, Object> extraData )
    {
        this.extraData = extraData;
    }

    public Set<ProductTagDTO> getTags()
    {
        return tags;
    }

    public void setTags( Set<ProductTagDTO> tags )
    {
        this.tags = tags;
    }

    public Set<String> getSyndicationEndpoints()
    {
        return syndicationEndpoints;
    }

    public void setSyndicationEndpoints( Set<String> syndicationEndpoints )
    {
        this.syndicationEndpoints = syndicationEndpoints;
    }

    /**
     * @deprecated by {@link #getSyndicationEndpoints()}
     */
    @Deprecated
    public String getSyndicatedEndpoint()
    {
        return syndicatedEndpoint;
    }

    /**
     * @deprecated by {@link #setSyndicationEndpoints(Set)}
     */
    @Deprecated
    public void setSyndicatedEndpoint( String syndicatedEndpoint )
    {
        this.syndicatedEndpoint = syndicatedEndpoint;
    }

    public String getApiUrl()
    {
        return apiUrl;
    }

    public void setApiUrl( String apiUrl )
    {
        this.apiUrl = apiUrl;
    }

    public Boolean isApi()
    {
        return api;
    }

    public void setApi( Boolean api )
    {
        this.api = api;
    }

    public Boolean isBundle()
    {
        return bundle;
    }

    public void setBundle( Boolean bundle )
    {
        this.bundle = bundle;
    }

    public Boolean isManaged()
    {
        return managed;
    }

    public void setManaged( Boolean managed )
    {
        this.managed = managed;
    }

    public Boolean isCloudService()
    {
        return cloudService;
    }

    public void setCloudService( Boolean cloudService )
    {
        this.cloudService = cloudService;
    }

    public Boolean isCsp()
    {
        return csp;
    }

    public void setCsp( Boolean csp )
    {
        this.csp = csp;
    }

    public Boolean isService()
    {
        return service;
    }

    public void setService( Boolean service )
    {
        this.service = service;
    }

    public Boolean isSyndicated()
    {
        return syndicated;
    }

    public void setSyndicated( Boolean syndicated )
    {
        this.syndicated = syndicated;
    }

    public Boolean isVm()
    {
        return vm;
    }

    public void setVm( Boolean vm )
    {
        this.vm = vm;
    }

    public String getPrivateKey()
    {
        return privateKey;
    }

    public void setPrivateKey( String privateKey )
    {
        this.privateKey = privateKey;
    }

    public String getCertificate()
    {
        return certificate;
    }

    public void setCertificate( String certificate )
    {
        this.certificate = certificate;
    }

    public boolean isKeyPairPresent()
    {
        return keyPairPresent;
    }

    public void setKeyPairPresent( boolean keyPairPresent )
    {
        this.keyPairPresent = keyPairPresent;
    }

    public String getCertificateHostname()
    {
        return certificateHostname;
    }

    public void setCertificateHostname( String certificateHostname )
    {
        this.certificateHostname = certificateHostname;
    }

    public Long getNumberOfRatings()
    {
        return numberOfRatings;
    }

    public void setNumberOfRatings( Long numberOfRatings )
    {
        this.numberOfRatings = numberOfRatings;
    }

    public Set<String> getEnvironments()
    {
        return environments;
    }

    public ProductDTO setEnvironments( Set<String> environments )
    {
        this.environments = environments;
        return this;
    }

    public boolean isDrafted()
    {
        return drafted;
    }

    public ProductDTO setDrafted( boolean drafted )
    {
        this.drafted = drafted;
        return this;
    }

    @Override
    public Map<String, String> getFaq()
    {
        return faq;
    }

    @Override
    public void setFaq( Map<String, String> faq )
    {
        this.faq = faq;
    }

    public List<ConfigurationParameterDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public ProductDTO setConfigurationParameters( List<ConfigurationParameterDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public String getNotificationSecretToken()
    {
        return notificationSecretToken;
    }

    public ProductDTO setNotificationSecretToken( String notificationSecretToken )
    {
        this.notificationSecretToken = notificationSecretToken;
        return this;
    }

    public ProductDestination getDestination()
    {
        return destination;
    }

    public ProductDTO setDestination( ProductDestination destination )
    {
        this.destination = destination;
        return this;
    }

    public Boolean isFrameable()
    {
        return frameable;
    }

    public ProductDTO setFrameable( Boolean frameable )
    {
        this.frameable = frameable;
        return this;
    }

    public Date getPublished()
    {
        return published;
    }

    public ProductDTO setPublished( Date published )
    {
        this.published = published;
        return this;
    }

    public UrlEntityDTO getRecommendedVersion()
    {
        return recommendedVersion;
    }

    public void setRecommendedVersion( UrlEntityDTO recommendedVersion )
    {
        this.recommendedVersion = recommendedVersion;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight( int weight )
    {
        this.weight = weight;
    }

    public boolean isSilent()
    {
        return silent;
    }

    public void setSilent( boolean silent )
    {
        this.silent = silent;
    }

    public CspProductType getCspProductType()
    {
        return cspProductType;
    }

    public void setCspProductType( CspProductType cspProductType )
    {
        this.cspProductType = cspProductType;
    }

    public String getApiHeaderName()
    {
        return apiHeaderName;
    }

    public void setApiHeaderName( String apiHeaderName )
    {
        this.apiHeaderName = apiHeaderName;
    }

    public String getApiHeaderValue()
    {
        return apiHeaderValue;
    }

    public void setApiHeaderValue( String apiHeaderValue )
    {
        this.apiHeaderValue = apiHeaderValue;
    }

    public SubscriptionsPerProduct getSubscriptionsPerProduct()
    {
        return subscriptionsPerProduct;
    }

    public void setSubscriptionsPerProduct( SubscriptionsPerProduct subscriptionsPerProduct )
    {
        this.subscriptionsPerProduct = subscriptionsPerProduct;
    }

    public Boolean getSubscriptionApproval()
    {
        return subscriptionApproval;
    }

    public void setSubscriptionApproval( Boolean subscriptionApproval )
    {
        this.subscriptionApproval = subscriptionApproval;
    }

    public Set<String> getOrderValidationUrls()
    {
        return orderValidationUrls;
    }

    public void setOrderValidationUrls( Set<String> orderValidationUrls )
    {
        this.orderValidationUrls = orderValidationUrls;
    }

    @Deprecated
    public String getOrderValidationUrl()
    {
        return orderValidationUrl;
    }

    @Deprecated
    public void setOrderValidationUrl( String orderValidationUrl )
    {
        this.orderValidationUrl = orderValidationUrl;
    }

    @Override
    public String getTerminationMessage()
    {
        return terminationMessage;
    }

    @Override
    public void setTerminationMessage( String terminationMessage )
    {
        this.terminationMessage = terminationMessage;
    }

    @Override
    public String getTosAcceptance()
    {
        return tosAcceptance;
    }

    @Override
    public void setTosAcceptance( String tosAcceptance )
    {
        this.tosAcceptance = tosAcceptance;
    }

    public BigDecimal getListingPrice()
    {
        return listingPrice;
    }

    public void setListingPrice( BigDecimal listingPrice )
    {
        this.listingPrice = listingPrice;
    }

    public boolean isRequestedForApproval()
    {
        return requestedForApproval;
    }

    public void setRequestedForApproval( boolean requestedForApproval )
    {
        this.requestedForApproval = requestedForApproval;
    }

    public CloudCredentialsSupport getCloudCredentialsSupport()
    {
        return cloudCredentialsSupport;
    }

    public void setCloudCredentialsSupport( CloudCredentialsSupport cloudCredentialsSupport )
    {
        this.cloudCredentialsSupport = cloudCredentialsSupport;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ProductDTO ) ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals( SKU, that.SKU );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), SKU );
    }
    //endregion

    public static class Fields
    {
        public static final String CATEGORY = "category";

        private Fields()
        {
        }
    }
}
