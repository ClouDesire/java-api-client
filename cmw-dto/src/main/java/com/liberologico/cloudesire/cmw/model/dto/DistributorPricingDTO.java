package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@ApiModel( "Defines a pricing for a product version" )
public class DistributorPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO distributorCatalog;

    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @ApiModelProperty( "The price defined by the distributor" )
    @Valid
    private ResellingPriceDTO price;

    @ApiModelProperty( "The setup fee defined by the distributor" )
    @Valid
    private ResellingPriceDTO setup;

    @ApiModelProperty( "Sell-in prices for the billing items" )
    @Valid
    private Set<BillingItemSellinPriceDTO> billingItemSellinPrices;

    @ApiModelProperty( "Sell-in prices for the cloud pricings" )
    @Valid
    private Set<CloudPricingSellinPriceDTO> cloudPricingSellinPrices;

    @ApiModelProperty( "Whether the pricing will not be altered by a mass update" )
    private Boolean locked;

    @ApiModelProperty( value = "Whether the pricing is not associated to the reseller anymore", readOnly = true )
    private Boolean deprecated;

    public DistributorPricingDTO( UrlEntityDTO distributorCatalog, UrlEntityDTO productVersion, BigDecimal markup )
    {
        this( distributorCatalog, productVersion );
        this.price = new ResellingPriceDTO( markup );
    }

    public DistributorPricingDTO( UrlEntityDTO distributorCatalog, UrlEntityDTO productVersion )
    {
        this( productVersion );
        this.distributorCatalog = distributorCatalog;
    }

    public DistributorPricingDTO( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    // region Auto-generated code
    public DistributorPricingDTO()
    {
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public UrlEntityDTO getDistributorCatalog()
    {
        return distributorCatalog;
    }

    public void setDistributorCatalog( UrlEntityDTO distributorCatalog )
    {
        this.distributorCatalog = distributorCatalog;
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }

    public ResellingPriceDTO getSetup()
    {
        return setup;
    }

    public void setSetup( ResellingPriceDTO setup )
    {
        this.setup = setup;
    }

    public Set<BillingItemSellinPriceDTO> getBillingItemSellinPrices()
    {
        return billingItemSellinPrices;
    }

    public void setBillingItemSellinPrices( Set<BillingItemSellinPriceDTO> billingItemSellinPrices )
    {
        this.billingItemSellinPrices = billingItemSellinPrices;
    }

    public Set<CloudPricingSellinPriceDTO> getCloudPricingSellinPrices()
    {
        return cloudPricingSellinPrices;
    }

    public void setCloudPricingSellinPrices( Set<CloudPricingSellinPriceDTO> cloudPricingSellinPrices )
    {
        this.cloudPricingSellinPrices = cloudPricingSellinPrices;
    }

    public Boolean getLocked()
    {
        return locked;
    }

    public void setLocked( Boolean locked )
    {
        this.locked = locked;
    }

    public Boolean getDeprecated()
    {
        return deprecated;
    }

    public void setDeprecated( Boolean deprecated )
    {
        this.deprecated = deprecated;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        DistributorPricingDTO that = (DistributorPricingDTO) o;
        return Objects.equals( productVersion, that.productVersion ) && Objects
                .equals( distributorCatalog, that.distributorCatalog ) && Objects.equals( price, that.price );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, distributorCatalog, price );
    }
    // endregion
}
