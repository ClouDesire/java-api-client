package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ApiModel( "Defines a pricing for a product version and a reseller" )
public class ResellerPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @ApiModelProperty( "If the invoices for this resold product are self billed" )
    private boolean selfBilled;

    @Valid
    private UrlEntityDTO reseller;

    @Valid
    private UrlEntityDTO distributor;

    @ApiModelProperty( "The price defined by the reseller" )
    @Valid
    private ResellingPriceDTO price;

    @ApiModelProperty( "The setup fee defined by the reseller" )
    @Valid
    private ResellingPriceDTO setup;

    @ApiModelProperty( "Reselling prices for the billing items" )
    @Valid
    private Set<BillingItemResellingPriceDTO> billingItemResellingPrices;

    @ApiModelProperty( "Reselling prices for the cloud pricings" )
    @Valid
    private Set<CloudPricingResellingPriceDTO> cloudPricingResellingPrices;

    @ApiModelProperty( "Whether the pricing will not be altered by a mass update" )
    private Boolean locked;

    @ApiModelProperty( "Billing item ranges defined by the reseller" )
    @Valid
    private List<BillingItemValueDTO> billingItemValues;

    public ResellerPricingDTO( UrlEntityDTO distributor, UrlEntityDTO productVersion )
    {
        this( productVersion );
        this.distributor = distributor;
    }

    public ResellerPricingDTO( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
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

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public UrlEntityDTO getDistributor()
    {
        return distributor;
    }

    public void setDistributor( UrlEntityDTO distributor )
    {
        this.distributor = distributor;
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
        return getBillingItemResellingPrices();
    }

    /**
     * @deprecated by {@link #setBillingItemResellingPrices(Set)}
     */
    @Deprecated
    public void setBillingItems( Set<BillingItemResellingPriceDTO> billingItems )
    {
        setBillingItemResellingPrices( billingItems );
    }

    /**
     * @deprecated by {@link #getCloudPricingResellingPrices()}
     */
    @Deprecated
    public Set<CloudPricingResellingPriceDTO> getCloudPricings()
    {
        return getCloudPricingResellingPrices();
    }

    /**
     * @deprecated by {@link #setCloudPricingResellingPrices(Set)}
     */
    @Deprecated
    public void setCloudPricings( Set<CloudPricingResellingPriceDTO> cloudPricings )
    {
        setCloudPricingResellingPrices( cloudPricings );
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
        return Objects.equals( productVersion, that.productVersion ) && Objects.equals( distributor, that.distributor );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, distributor );
    }
    // endregion
}
