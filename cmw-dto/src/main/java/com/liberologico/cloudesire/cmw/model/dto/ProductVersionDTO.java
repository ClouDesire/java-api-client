package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.cmw.model.enums.Trial;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys.INVALID_MIN;

public class ProductVersionDTO extends NamedEntityDTO implements ProductVersionL10nDTO
{
    public static final String DESCRIPTION_FIELD = "description";
    public static final String PRICE_FIELD = "price";
    public static final String PUBLISHED_FIELD = "published";
    public static final String SETUP_FEE_FIELD = "setupFee";

    @Valid
    private Set<UrlEntityDTO> virtualMachineConfiguration;

    @Valid
    private UrlEntityDTO product;

    private String identifier;

    /**
     * Suggested bandwidth to be payed in advance, decided by vendor
     */
    private BigDecimal bandwidthInGB;

    @ApiModelProperty( "Can be null for a catalog-only product plan" )
    private BigDecimal price;

    private BigDecimal vendorPrice;

    private Integer billingPeriod;

    private Integer minimumDuration = 1;

    private Trial trial;

    private boolean cloudesireFeeActivated = true;

    private boolean selfBilling = false;

    private Boolean published = false;

    @Deprecated
    private List<Integer> availableOrderPeriods;

    private Integer lifespan;

    private Boolean webdavSupport = false;

    private boolean postConfiguration;

    @Valid
    private List<BillingItemValueDTO> billingItemValues = new ArrayList<>();

    private BigDecimal setupFee;

    private BigDecimal vendorSetupFee;

    private Set<ApplicationFileEnvironmentDTO> editableEnvironment = new HashSet<>();

    private String description;

    @JsonInclude( JsonInclude.Include.NON_DEFAULT )
    private boolean drafted;

    @Valid
    private Set<UrlEntityDTO> configurationParameters = new HashSet<>();

    private String externalId;

    /**
     * The duration (in days) for a trial of this product version
     */
    @Min( value = 1, message = INVALID_MIN )
    private Integer trialLength = 1;

    private BigDecimal revenueSharingQuota;

    /**
     * Trials of this version automatically convert to normal
     */
    private boolean autoRenewable;

    /**
     * This version will be selected by default in the marketplace
     */
    private boolean recommended;

    private Map<UrlEntityDTO, BigDecimal> bundle;

    private Map<String, Object> metadata;

    private int weight;

    @ApiModelProperty( "True if this plan can be purchased only with a coupon" )
    private boolean unlockable;

    @ApiModelProperty( "The number of markups set for this plan" )
    private long markedUp;

    @ApiModelProperty( "True if a subscription from this plan will be automatically set to DEPLOYED on payment" )
    private boolean autodeploy;

    @ApiModelProperty( value = "Descriptive label of this product version", readOnly = true )
    private String label;

    public ProductVersionDTO( String name, UrlEntityDTO product )
    {
        super( name );
        this.product = product;
    }

    public void addBillingItemValue( BillingItemValueDTO billingItemValueDTO )
    {
        this.billingItemValues.add( billingItemValueDTO );
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

    public boolean isCloudesireFeeActivated()
    {
        return cloudesireFeeActivated;
    }

    public void setCloudesireFeeActivated( boolean cloudesireFeeActivated )
    {
        this.cloudesireFeeActivated = cloudesireFeeActivated;
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

    public Set<UrlEntityDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public ProductVersionDTO setConfigurationParameters( Set<UrlEntityDTO> configurationParameters )
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

    public BigDecimal getRevenueSharingQuota()
    {
        return revenueSharingQuota;
    }

    public void setRevenueSharingQuota( BigDecimal revenueSharingQuota )
    {
        this.revenueSharingQuota = revenueSharingQuota;
    }

    @Deprecated
    public BigDecimal getCloudesireQuota()
    {
        return revenueSharingQuota;
    }

    @Deprecated
    public void setCloudesireQuota( BigDecimal cloudesireQuota )
    {
        if ( revenueSharingQuota == null ) revenueSharingQuota = cloudesireQuota;
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

    public Map<String, Object> getMetadata()
    {
        return metadata;
    }

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

    public boolean isUnlockable()
    {
        return unlockable;
    }

    public void setUnlockable( boolean unlockable )
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

    public boolean isAutodeploy()
    {
        return autodeploy;
    }

    public void setAutodeploy( boolean autodeploy )
    {
        this.autodeploy = autodeploy;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        ProductVersionDTO that = (ProductVersionDTO) o;

        if ( cloudesireFeeActivated != that.cloudesireFeeActivated ) return false;
        if ( selfBilling != that.selfBilling ) return false;
        if ( postConfiguration != that.postConfiguration ) return false;
        if ( virtualMachineConfiguration != null ?
                !virtualMachineConfiguration.equals( that.virtualMachineConfiguration ) :
                that.virtualMachineConfiguration != null ) return false;
        if ( product != null ? !product.equals( that.product ) : that.product != null ) return false;
        if ( bandwidthInGB != null ? !bandwidthInGB.equals( that.bandwidthInGB ) : that.bandwidthInGB != null )
            return false;
        if ( price != null ? !price.equals( that.price ) : that.price != null ) return false;
        if ( billingPeriod != null ? !billingPeriod.equals( that.billingPeriod ) : that.billingPeriod != null )
            return false;
        if ( trial != null ? !trial.equals( that.trial ) : that.trial != null ) return false;
        if ( published != null ? !published.equals( that.published ) : that.published != null ) return false;
        if ( lifespan != null ? !lifespan.equals( that.lifespan ) : that.lifespan != null ) return false;
        if ( webdavSupport != null ? !webdavSupport.equals( that.webdavSupport ) : that.webdavSupport != null )
            return false;
        if ( setupFee != null ? ! setupFee.equals( that.setupFee ) : that.setupFee != null ) return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = virtualMachineConfiguration != null ? virtualMachineConfiguration.hashCode() : 0;
        result = 31 * result + ( product != null ? product.hashCode() : 0 );
        result = 31 * result + ( bandwidthInGB != null ? bandwidthInGB.hashCode() : 0 );
        result = 31 * result + ( price != null ? price.hashCode() : 0 );
        result = 31 * result + ( billingPeriod != null ? billingPeriod.hashCode() : 0 );
        result = 31 * result + ( trial != null ? trial.hashCode() : 0 );
        result = 31 * result + ( cloudesireFeeActivated ? 1 : 0 );
        result = 31 * result + ( selfBilling ? 1 : 0 );
        result = 31 * result + ( published != null ? published.hashCode() : 0 );
        result = 31 * result + ( lifespan != null ? lifespan.hashCode() : 0 );
        result = 31 * result + ( webdavSupport != null ? webdavSupport.hashCode() : 0 );
        result = 31 * result + ( setupFee != null ? setupFee.hashCode() : 0 );
        result = 31 * result + ( postConfiguration ? 1 : 0 );
        return result;
    }
    //endregion
}
