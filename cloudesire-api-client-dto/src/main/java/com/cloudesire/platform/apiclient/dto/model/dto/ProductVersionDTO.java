package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CouponConfiguration;
import com.cloudesire.platform.apiclient.dto.model.enums.IaasBilling;
import com.cloudesire.platform.apiclient.dto.model.enums.PaymentGateway;
import com.cloudesire.platform.apiclient.dto.model.enums.Trial;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_MIN;
import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;

public class ProductVersionDTO extends NamedEntityDTO implements ProductVersionL10nDTO
{
    public static final String COUPON_CONFIGURATION_FIELD = "couponConfiguration";
    public static final String DESCRIPTION_FIELD = "description";
    public static final String PRICE_FIELD = "price";
    public static final String PUBLISHED_FIELD = "published";
    public static final String SETUP_FEE_FIELD = "setupFee";

    @ApiModelProperty( "Configurations of the virtual machines for the product version" )
    @Valid
    private Set<UrlEntityDTO> virtualMachineConfiguration;

    @Valid
    private UrlEntityDTO product;

    @ApiModelProperty( "Unique identifier" )
    private String identifier;

    @ApiModelProperty( "Suggested bandwidth to be payed in advance, decided by vendor" )
    private BigDecimal bandwidthInGB;

    @ApiModelProperty( "Price for the product version, can be null for a catalog-only product plan" )
    private BigDecimal price;

    @ApiModelProperty( "Price set by the vendor. Visible to admin only" )
    private BigDecimal vendorPrice;

    @ApiModelProperty( "How often to bill the customer, in months" )
    private Integer billingPeriod;

    @ApiModelProperty( "Minimum duration for a subscription, in months" )
    private Integer minimumDuration = 1;

    private Trial trial;

    @ApiModelProperty( "If the emission and payment of the version's invoices must be handled by the vendor" )
    private boolean selfBilling = false;

    @ApiModelProperty( "If the version is published on the marketplace" )
    private Boolean published = false;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private List<Integer> availableOrderPeriods;

    @ApiModelProperty( "Lifespan of the product version, in hours" )
    private Integer lifespan;

    @ApiModelProperty( "Adds webdav support for the product version deployed instances" )
    private Boolean webdavSupport = false;

    @ApiModelProperty( "Adds a post-configuration status in the deployment procedure" )
    private boolean postConfiguration;

    @ApiModelProperty( "Billing item values for the product version" )
    @Valid
    private List<BillingItemValueDTO> billingItemValues = new ArrayList<>();

    @ApiModelProperty( "A one-time price for the setup of the product" )
    private BigDecimal setupFee;

    @ApiModelProperty( "A one-time price for the setup of the product billed to the vendor. Visible to admin only" )
    private BigDecimal vendorSetupFee;

    private Set<ApplicationFileEnvironmentDTO> editableEnvironment = new HashSet<>();

    @ApiModelProperty( "Description of the product version" )
    private String description;

    @ApiModelProperty( "If the product version is in a draft state" )
    @JsonInclude( JsonInclude.Include.NON_DEFAULT )
    private boolean drafted;

    @ApiModelProperty( "The configuration parameters for the product version" )
    @Valid
    private List<UrlEntityDTO> configurationParameters;

    @ApiModelProperty( "An optional ID for integration purposes" )
    private String externalId;

    @ApiModelProperty( "The duration (in days) for a trial of the product version" )
    @Min( value = 1, message = INVALID_MIN )
    private Integer trialLength = 1;

    @ApiModelProperty( "Trials of this version automatically convert to normal" )
    private boolean autoRenewable;

    @ApiModelProperty( "If the product version will be selected by default in the marketplace" )
    private boolean recommended;

    @ApiModelProperty( value = "Bundle discount configuration", example = "{\"productVersion/123\":10}")
    private Map<UrlEntityDTO, BigDecimal> bundle;

    /**
     * @deprecated by {@link com.cloudesire.platform.apiclient.api.ProductVersionApi#getMetadata(int)}
     */
    @Deprecated
    @ApiModelProperty( value = "Metadata for the product version", example = "{\"key\":\"value\"}" )
    private Map<String, Object> metadata;

    @ApiModelProperty( "Weight order for displaying on the marketplace" )
    private int weight;

    private CouponConfiguration couponConfiguration;

    /**
     * @deprecated by {@link #couponConfiguration}
     */
    @ApiModelProperty( value = "True if the product version can be purchased only with a coupon", hidden = true )
    @Deprecated
    private Boolean unlockable;

    @ApiModelProperty( "The number of markups set for the product version" )
    private long markedUp;

    @ApiModelProperty( "The number of sell-outs set for the product version" )
    private long soldOut;

    @ApiModelProperty( value = "Descriptive label of the product version", readOnly = true )
    private String label;

    @ApiModelProperty( "Whether a subscription from the product version can be upgraded to another one" )
    private Boolean upgradable;

    private IaasBilling iaasBilling;

    private UrlEntityDTO comparableVersion;

    private Set<PaymentGateway> paymentGateways = new HashSet<>();

    @ApiModelProperty( value = "Cloud Providers enabled for the Product Version", accessMode = READ_ONLY )
    private List<UrlEntityDTO> cloudProviders;

    @ApiModelProperty( "Whether a Subscription of the Product Version can be terminated before the natural expiration by its customer" )
    private Boolean unkillable;

    public ProductVersionDTO( String name, UrlEntityDTO product )
    {
        super( name );
        this.product = product;
    }

    public void addBillingItemValue( BillingItemValueDTO billingItemValueDTO )
    {
        this.billingItemValues.add( billingItemValueDTO );
    }

    public void replaceBillingItemValues( List<? extends BillingItemValueDTO> billingItemValues )
    {
        this.billingItemValues = new ArrayList<>();

        for ( BillingItemValueDTO billingItemValue : billingItemValues )
        {
            addBillingItemValue( billingItemValue );
        }
    }

    //region Auto-generated code
    public ProductVersionDTO()
    {
    }

    public Set<UrlEntityDTO> getVirtualMachineConfiguration()
    {
        return virtualMachineConfiguration;
    }

    public void setVirtualMachineConfiguration( Set<UrlEntityDTO> virtualMachineConfiguration )
    {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    public Boolean isPublished()
    {
        return published;
    }

    public void setPublished( Boolean published )
    {
        this.published = published;
    }

    /**
     * @deprecated replaced by {@link #getTrial()}
     */
    @ApiModelProperty( hidden = true )
    @Deprecated
    public Boolean getTriable()
    {
        return getTrial() != Trial.NOT_ALLOWED;
    }

    /**
     * @deprecated replaced by {@link #setTrial(Trial)}
     */
    @Deprecated
    public void setTriable( Boolean triable )
    {
        if ( this.trial != null ) return;

        if ( Boolean.TRUE.equals( triable ) ) setTrial( Trial.ALLOWED );
        else setTrial( Trial.NOT_ALLOWED );
    }

    public Trial getTrial()
    {
        return trial;
    }

    public void setTrial( Trial trial )
    {
        this.trial = trial;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getVendorPrice()
    {
        return vendorPrice;
    }

    public void setVendorPrice( BigDecimal vendorPrice )
    {
        this.vendorPrice = vendorPrice;
    }

    public Integer getBillingPeriod()
    {
        return billingPeriod;
    }

    public void setBillingPeriod( Integer billingPeriod )
    {
        this.billingPeriod = billingPeriod;
    }

    public Integer getMinimumDuration()
    {
        return minimumDuration;
    }

    public void setMinimumDuration( Integer minimumDuration )
    {
        this.minimumDuration = minimumDuration;
    }

    public BigDecimal getBandwidthInGB()
    {
        return bandwidthInGB;
    }

    public void setBandwidthInGB( BigDecimal bandwidthInGB )
    {
        this.bandwidthInGB = bandwidthInGB;
    }

    public boolean isSelfBilling()
    {
        return selfBilling;
    }

    public void setSelfBilling( boolean selfBilling )
    {
        this.selfBilling = selfBilling;
    }

    @Deprecated
    public List<Integer> getAvailableOrderPeriods()
    {
        return availableOrderPeriods;
    }

    @Deprecated
    public void setAvailableOrderPeriods( List<Integer> availableOrderPeriods )
    {
        this.availableOrderPeriods = availableOrderPeriods;
    }

    public Integer getLifespan()
    {
        return lifespan;
    }

    public void setLifespan( Integer lifespan )
    {
        this.lifespan = lifespan;
    }

    public Boolean getWebdavSupport()
    {
        return webdavSupport;
    }

    public void setWebdavSupport( Boolean webdavSupport )
    {
        this.webdavSupport = webdavSupport;
    }

    public List<BillingItemValueDTO> getBillingItemValues()
    {
        return billingItemValues;
    }

    public ProductVersionDTO setBillingItemValues( List<BillingItemValueDTO> billingItemValues )
    {
        this.billingItemValues = billingItemValues;
        return this;
    }

    public BigDecimal getSetupFee()
    {
        return setupFee;
    }

    public ProductVersionDTO setSetupFee( BigDecimal setupFee )
    {
        this.setupFee = setupFee;
        return this;
    }

    public BigDecimal getVendorSetupFee()
    {
        return vendorSetupFee;
    }

    public void setVendorSetupFee( BigDecimal vendorSetupFee )
    {
        this.vendorSetupFee = vendorSetupFee;
    }

    public boolean isPostConfiguration()
    {
        return postConfiguration;
    }

    public void setPostConfiguration( boolean postConfiguration )
    {
        this.postConfiguration = postConfiguration;
    }

    public Set<ApplicationFileEnvironmentDTO> getEditableEnvironment()
    {
        return editableEnvironment;
    }

    public ProductVersionDTO setEditableEnvironment( Set<ApplicationFileEnvironmentDTO> editableEnvironment )
    {
        this.editableEnvironment = editableEnvironment;
        return this;
    }

    public List<UrlEntityDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public ProductVersionDTO setConfigurationParameters( List<UrlEntityDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void setDescription( String description )
    {
        this.description = description;
    }

    public boolean isDrafted()
    {
        return drafted;
    }

    public void setDrafted( boolean drafted )
    {
        this.drafted = drafted;
    }

    public String getExternalId()
    {
        return externalId;
    }

    public void setExternalId( String externalId )
    {
        this.externalId = externalId;
    }

    public Integer getTrialLength()
    {
        return trialLength;
    }

    public void setTrialLength( Integer trialLength )
    {
        this.trialLength = trialLength;
    }

    public boolean isAutoRenewable()
    {
        return autoRenewable;
    }

    public void setAutoRenewable( boolean autoRenewable )
    {
        this.autoRenewable = autoRenewable;
    }

    public Boolean isRecommended()
    {
        return recommended;
    }

    public void setRecommended( Boolean recommended )
    {
        this.recommended = recommended;
    }

    public Map<UrlEntityDTO, BigDecimal> getBundle()
    {
        return bundle;
    }

    public void setBundle( Map<UrlEntityDTO, BigDecimal> bundle )
    {
        this.bundle = bundle;
    }

    /**
     * @deprecated by {@link com.cloudesire.platform.apiclient.api.ProductVersionApi#getMetadata(int)}
     */
    @Deprecated
    public Map<String, Object> getMetadata()
    {
        return metadata;
    }

    /**
     * @deprecated by {@link com.cloudesire.platform.apiclient.api.ProductVersionApi#updateMetadata(Integer, Map)}
     */
    @Deprecated
    public void setMetadata( Map<String, Object> metadata )
    {
        this.metadata = metadata;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight( int weight )
    {
        this.weight = weight;
    }

    public CouponConfiguration getCouponConfiguration()
    {
        return couponConfiguration;
    }

    public void setCouponConfiguration( CouponConfiguration configuration )
    {
        this.couponConfiguration = configuration;
    }

    /**
     * @deprecated by {@link #getCouponConfiguration()}
     */
    @Deprecated
    public Boolean isUnlockable()
    {
        return unlockable;
    }

    /**
     * @deprecated by {@link #setCouponConfiguration(CouponConfiguration)}
     */
    @Deprecated
    public void setUnlockable( Boolean unlockable )
    {
        this.unlockable = unlockable;
    }

    public long getMarkedUp()
    {
        return markedUp;
    }

    public void setMarkedUp( long markedUp )
    {
        this.markedUp = markedUp;
    }

    public long getSoldOut()
    {
        return soldOut;
    }

    public void setSoldOut( long soldOut )
    {
        this.soldOut = soldOut;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    public Boolean isUpgradable()
    {
        return upgradable;
    }

    public void setUpgradable( Boolean upgradable )
    {
        this.upgradable = upgradable;
    }

    public IaasBilling getIaasBilling()
    {
        return iaasBilling;
    }

    public void setIaasBilling( IaasBilling iaasBilling )
    {
        this.iaasBilling = iaasBilling;
    }

    public UrlEntityDTO getComparableVersion()
    {
        return comparableVersion;
    }

    public void setComparableVersion( UrlEntityDTO comparableVersion )
    {
        this.comparableVersion = comparableVersion;
    }

    public Set<PaymentGateway> getPaymentGateways()
    {
        return paymentGateways;
    }

    public void setPaymentGateways( Set<PaymentGateway> paymentGateways )
    {
        this.paymentGateways = paymentGateways;
    }

    public List<UrlEntityDTO> getCloudProviders()
    {
        return cloudProviders;
    }

    public void setCloudProviders( List<UrlEntityDTO> cloudProviders )
    {
        this.cloudProviders = cloudProviders;
    }

    public Boolean isUnkillable()
    {
        return unkillable;
    }

    public void setUnkillable( Boolean unkillable )
    {
        this.unkillable = unkillable;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductVersionDTO that = (ProductVersionDTO) o;
        return drafted == that.drafted && recommended == that.recommended && weight == that.weight && Objects
                .equals( product, that.product ) && Objects.equals( identifier, that.identifier ) && Objects
                .equals( published, that.published );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), product, identifier, published, drafted, recommended, weight );
    }
    //endregion
}
