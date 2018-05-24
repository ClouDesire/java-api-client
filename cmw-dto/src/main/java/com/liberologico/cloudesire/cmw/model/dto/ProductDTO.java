package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liberologico.cloudesire.cmw.model.enums.CspProduct;
import com.liberologico.cloudesire.cmw.model.enums.ProductDestination;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys.INVALID_SIZE;

public class ProductDTO extends NamedEntityDTO implements ProductL10nDTO
{
    @ApiModelProperty("Identifier for the product, cannot be changed after creation")
    private String SKU;

    @Valid
    private UrlEntityDTO company;

    @Valid
    private UrlEntityDTO reseller;

    @Valid
    private UrlEntityDTO category;

    private ProductType type;

    @Valid
    private List<UrlEntityDTO> productVersion;

    @ApiModelProperty("URL where events of syndicated applications are dispatched")
    private String syndicatedEndpoint;

    @ApiModelProperty( "Base URL for this product's API" )
    private String apiUrl;

    @Valid
    private List<UrlEntityDTO> files;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private Integer trialLengthDays;

    @Size( max = 4000, message = INVALID_SIZE )
    private String shortDescription;

    @Size( max = 8192, message = INVALID_SIZE )
    private String longDescription;

    @ApiModelProperty( readOnly = true )
    private BigDecimal averageRating;

    @ApiModelProperty( readOnly = true )
    private Long numberOfRatings;

    @ApiModelProperty( hidden = true )
    private Boolean isFeatured = false;

    @ApiModelProperty( hidden = true )
    private String attributes;

    @Size( max = 65536, message = INVALID_SIZE )
    @ApiModelProperty( "Instructions shown to the customer that buys a subscription" )
    private String endUserInstructions;

    @Size( max = 65536, message = INVALID_SIZE )
    private String termsOfService;

    @Size( max = 65536, message = INVALID_SIZE )
    private String privacy;

    @Size( max = 65536, message = INVALID_SIZE )
    private String serviceLevelAgreement;

    private Set<ProductTagDTO> tags;

    @Valid
    private List<UrlEntityDTO> metrics;

    @Valid
    private List<UrlEntityDTO> cloudProviders;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isApi" )
    private Boolean api;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isBundle" )
    private Boolean bundle;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isManaged" )
    private Boolean managed;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isCsp" )
    private Boolean csp;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isService" )
    private Boolean service;

    @ApiModelProperty( readOnly = true )
    @JsonProperty( "isSyndicated" )
    private Boolean syndicated;

    private String certificate;

    private String privateKey;

    @ApiModelProperty( readOnly = true )
    private boolean keyPairPresent;

    @ApiModelProperty( readOnly = true )
    private String certificateHostname;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    @ApiModelProperty( hidden = true )
    private Set<String> environments;

    @JsonInclude( JsonInclude.Include.NON_DEFAULT )
    private boolean drafted;

    @ApiModelProperty( hidden = true )
    private MinimumCostDTO minimumCost;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    @ApiModelProperty( "Localized product metadata" )
    private Map<String, Object> extraData;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, String> faq;

    @Valid
    private List<ConfigurationParameterDTO> configurationParameters;

    @ApiModelProperty( "Pre-shared secret to sign event notifications" )
    private String notificationSecretToken;

    private ProductDestination destination = ProductDestination.B2C;

    private Boolean frameable;

    private Date published;

    /**
     * This version will be selected by default in the marketplace
     */
    private UrlEntityDTO recommendedVersion;

    private int weight;

    @ApiModelProperty( "Whether to silent emails to customer regarding product delivery" )
    private boolean silent;

    @ApiModelProperty( "The cost for the vendor to be present in the marketplace catalog" )
    private BigDecimal listingPrice;

    @ApiModelProperty( "Request approval of this product" )
    private boolean requestedForApproval;

    private CspProduct cspProductType;

    public ProductDTO( String name, String identifier, ProductType type )
    {
        super( name );
        this.SKU = identifier;
        this.type = type;
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

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
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

    public String getSyndicatedEndpoint()
    {
        return syndicatedEndpoint;
    }

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

    public List<UrlEntityDTO> getMetrics()
    {
        return metrics;
    }

    public void setMetrics( List<UrlEntityDTO> metrics )
    {
        this.metrics = metrics;
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

    public MinimumCostDTO getMinimumCost()
    {
        return minimumCost;
    }

    public ProductDTO setMinimumCost( MinimumCostDTO minimumCost )
    {
        this.minimumCost = minimumCost;
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

    public CspProduct getCspProductType()
    {
        return cspProductType;
    }

    public void setCspProductType( CspProduct cspProductType )
    {
        this.cspProductType = cspProductType;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals( SKU, that.SKU );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), SKU );
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
    //endregion
}
