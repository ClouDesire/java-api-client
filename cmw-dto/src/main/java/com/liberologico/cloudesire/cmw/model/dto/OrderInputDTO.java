package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.cmw.model.enums.OrderType;
import com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OrderInputDTO extends BaseEntityDTO
{
    @NotNull
    @ApiModelProperty( "Which type of order" )
    private OrderType type;

    @Valid
    private UrlEntityDTO cloudProvider;

    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO bandwidthPricing;

    @Valid
    private UrlEntityDTO buyer;

    @ApiModelProperty( "Optional discount coupon" )
    private String hashCoupon;

    @Deprecated
    @Min ( 1 )
    @ApiModelProperty( value = "How many periods to buy", hidden = true )
    private Integer billingPeriods;

    @Valid
    @ApiModelProperty( "Quantities for eventual billingItems available" )
    private Map<UrlEntityDTO, Integer> billingItems;

    @Valid
    @ApiModelProperty( "ConfigurationParameters values" )
    private Map<UrlEntityDTO, String> configurationParameters;

    @ApiModelProperty( "Environment variables values" )
    private List<ApplicationFileEnvironmentDTO> environment;

    @ApiModelProperty( "An external id of your choice" )
    @Pattern( regexp = "[A-Za-z0-9-_]+", message = ConstraintKeys.ALPHANUMERIC_UNDERSCORE )
    private String externalReference;

    @ApiModelProperty( "When in reseller mode, specify the reseller username" )
    private String reseller;

    @ApiModelProperty( "TODO document me" )
    private OSType operatingSystem;

    public OrderInputDTO( UrlEntityDTO productVersion )
    {
        this.type = OrderType.NORMAL;
        this.productVersion = productVersion;
    }

    public OrderInputDTO()
    {
    }

    @Deprecated
    public void setBillingPeriods( Integer billingPeriods )
    {
        this.billingPeriods = billingPeriods;
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public String getHashCoupon()
    {
        return hashCoupon;
    }

    public void setHashCoupon( String hashCoupon )
    {
        this.hashCoupon = hashCoupon;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    @JsonIgnore
    public UrlEntityDTO getConfiguration()
    {
        return productVersion;
    }

    public void setConfiguration( UrlEntityDTO configuration )
    {
        this.productVersion = configuration;
    }

    public UrlEntityDTO getBandwidthPricing()
    {
        return bandwidthPricing;
    }

    public void setBandwidthPricing( UrlEntityDTO bandwidthPricing )
    {
        this.bandwidthPricing = bandwidthPricing;
    }

    @Deprecated
    public Integer getBillingPeriods()
    {
        return billingPeriods;
    }

    public UrlEntityDTO getBuyer()
    {
        return buyer;
    }

    public void setBuyer( UrlEntityDTO buyer )
    {
        this.buyer = buyer;
    }

    public Map<String, Integer> getBillingItems()
    {
        if ( this.billingItems == null ) return null;

        Map<String, Integer> currentBillingItems = new HashMap<>();

        for ( Map.Entry<UrlEntityDTO, Integer> entry : this.billingItems.entrySet() )
        {
            currentBillingItems.put( entry.getKey().getUrl(), entry.getValue() );
        }

        return currentBillingItems;
    }

    public void setBillingItems( Map<UrlEntityDTO, Integer> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public List<ApplicationFileEnvironmentDTO> getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( List<ApplicationFileEnvironmentDTO> environment )
    {
        this.environment = environment;
    }

    public String getExternalReference()
    {
        return externalReference;
    }

    public void setExternalReference( String externalReference )
    {
        this.externalReference = externalReference;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof OrderInputDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        OrderInputDTO that = (OrderInputDTO) o;
        return type == that.type && Objects.equals( cloudProvider, that.cloudProvider ) && Objects
                .equals( productVersion, that.productVersion ) && Objects
                .equals( bandwidthPricing, that.bandwidthPricing ) && Objects.equals( buyer, that.buyer ) && Objects
                .equals( hashCoupon, that.hashCoupon ) && Objects.equals( billingPeriods, that.billingPeriods )
                && Objects.equals( reseller, that.reseller );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), type, cloudProvider, productVersion, bandwidthPricing, buyer, hashCoupon,
                billingPeriods, reseller );
    }
}
