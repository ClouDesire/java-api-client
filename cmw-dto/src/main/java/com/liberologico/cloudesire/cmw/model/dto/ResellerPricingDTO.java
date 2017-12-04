package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ResellerPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    @ApiModelProperty( "The version of this product's reselling pricing, editable by the distributor" )
    private UrlEntityDTO productVersion;

    @ApiModelProperty( "If the invoices for this resold product are self billed" )
    private boolean selfBilled;

    @Valid
    @ApiModelProperty( "The reseller of this product, editable by the distributor" )
    private UrlEntityDTO reseller;

    @Valid
    @ApiModelProperty( "The distributor of this product, editable by the admin" )
    private UrlEntityDTO distributor;

    @Valid
    private ResellingPriceDTO price;

    @Valid
    private ResellingPriceDTO setup;

    @Valid
    private Set<BillingItemResellingPriceDTO> billingItems;

    @Valid
    private Set<CloudPricingResellingPriceDTO> cloudPricings;

    private Boolean locked;

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

    public Set<BillingItemResellingPriceDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Set<BillingItemResellingPriceDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Set<CloudPricingResellingPriceDTO> getCloudPricings()
    {
        return cloudPricings;
    }

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
        return Objects.equals( productVersion, that.productVersion ) && Objects.equals( distributor, that.distributor );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, distributor );
    }
    // endregion
}
