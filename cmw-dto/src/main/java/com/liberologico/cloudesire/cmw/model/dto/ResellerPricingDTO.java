package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.ApiVersion;
import com.liberologico.cloudesire.cmw.annotations.UnsupportedAPI;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ApiModel( "Defines a pricing for a product version and a reseller" )
public class ResellerPricingDTO extends BaseEntityDTO
{
    @Valid
    private UrlEntityDTO productVersion;

    @ApiModelProperty( "If the invoices for this resold product are self billed" )
    private boolean selfBilled;

    @NotNull
    @Valid
    private UrlEntityDTO resellerCatalog;

    @NotNull
    @Valid
    private UrlEntityDTO distributorPricing;

    @ApiModelProperty( "The price defined by the reseller" )
    @Valid
    private ResellingPriceDTO price;

    @ApiModelProperty( "The setup fee defined by the reseller" )
    @Valid
    private ResellingPriceDTO setup;

    @ApiModelProperty( "Reselling prices for the billing items" )
    @Valid
    private Set<BillingItemResellingPriceDTO> billingItemResellingPrices;

    @ApiModelProperty( hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20180312 )
    @Valid
    private Set<BillingItemResellingPriceDTO> billingItems;

    @ApiModelProperty( "Reselling prices for the cloud pricings" )
    @Valid
    private Set<CloudPricingResellingPriceDTO> cloudPricingResellingPrices;

    @ApiModelProperty( hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20180312 )
    @Valid
    private Set<CloudPricingResellingPriceDTO> cloudPricings;

    @ApiModelProperty( "Whether the pricing will not be altered by a mass update" )
    private Boolean locked;

    @ApiModelProperty( "Billing item ranges defined by the reseller" )
    @Valid
    private List<BillingItemValueDTO> billingItemValues;

    public ResellerPricingDTO( UrlEntityDTO resellerCatalog, UrlEntityDTO distributorPricing )
    {
        this.resellerCatalog = resellerCatalog;
        this.distributorPricing = distributorPricing;
    }

    // region Auto-generated code
    public ResellerPricingDTO()
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

    public boolean isSelfBilled()
    {
        return selfBilled;
    }

    public void setSelfBilled( boolean selfBilled )
    {
        this.selfBilled = selfBilled;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public UrlEntityDTO getDistributorPricing()
    {
        return distributorPricing;
    }

    public void setDistributorPricing( UrlEntityDTO distributorPricing )
    {
        this.distributorPricing = distributorPricing;
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

    public Set<BillingItemResellingPriceDTO> getBillingItemResellingPrices()
    {
        return billingItemResellingPrices;
    }

    public void setBillingItemResellingPrices( Set<BillingItemResellingPriceDTO> billingItemResellingPrices )
    {
        this.billingItemResellingPrices = billingItemResellingPrices;
    }

    public Set<CloudPricingResellingPriceDTO> getCloudPricingResellingPrices()
    {
        return cloudPricingResellingPrices;
    }

    public void setCloudPricingResellingPrices( Set<CloudPricingResellingPriceDTO> cloudPricingResellingPrices )
    {
        this.cloudPricingResellingPrices = cloudPricingResellingPrices;
    }

    /**
     * @deprecated by {@link #getBillingItemResellingPrices()}
     */
    @Deprecated
    public Set<BillingItemResellingPriceDTO> getBillingItems()
    {
        return billingItems;
    }

    /**
     * @deprecated by {@link #setBillingItemResellingPrices(Set)}
     */
    @Deprecated
    public void setBillingItems( Set<BillingItemResellingPriceDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    /**
     * @deprecated by {@link #getCloudPricingResellingPrices()}
     */
    @Deprecated
    public Set<CloudPricingResellingPriceDTO> getCloudPricings()
    {
        return cloudPricings;
    }

    /**
     * @deprecated by {@link #setCloudPricingResellingPrices(Set)}
     */
    @Deprecated
    public void setCloudPricings( Set<CloudPricingResellingPriceDTO> cloudPricings )
    {
        this.cloudPricings = cloudPricings;
    }

    public Boolean getLocked()
    {
        return locked;
    }

    public void setLocked( Boolean locked )
    {
        this.locked = locked;
    }

    public List<BillingItemValueDTO> getBillingItemValues()
    {
        return billingItemValues;
    }

    public void setBillingItemValues( List<BillingItemValueDTO> billingItemValues )
    {
        this.billingItemValues = billingItemValues;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ResellerPricingDTO that = (ResellerPricingDTO) o;
        return Objects.equals( productVersion, that.productVersion ) && Objects
                .equals( distributorPricing, that.distributorPricing );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, distributorPricing );
    }
    // endregion
}
