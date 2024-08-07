package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Schema( description = "Defines a pricing for a product version" )
public class DistributorPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO distributorCatalog;

    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Schema( description = "The price defined by the distributor")
    @Valid
    private ResellingPriceDTO price;

    @Schema( description = "The setup fee defined by the distributor")
    @Valid
    private ResellingPriceDTO setup;

    @Schema( description = "Sell-in prices for the billing items")
    @Valid
    private Set<BillingItemSellinPriceDTO> billingItemSellinPrices;

    @Schema( description = "Sell-in prices for the cloud pricings")
    @Valid
    private Set<CloudPricingSellinPriceDTO> cloudPricingSellinPrices;

    @Schema( description = "Sell-in prices for custom costs")
    @Valid
    private List<CustomSellinPriceDTO> customSellinPrices;

    @Schema( description = "Whether the pricing will not be altered by a mass update")
    private Boolean locked;

    @Schema( description = "Default percentage sellout for new Reseller catalogs")
    @Min( 0 )
    private BigDecimal recommendedSelloutPercentage;

    @Schema( description = "Whether the pricing is not associated to the reseller anymore", readOnly = true )
    private Boolean deprecated;

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

    public List<CustomSellinPriceDTO> getCustomSellinPrices()
    {
        return customSellinPrices;
    }

    public void setCustomSellinPrices( List<CustomSellinPriceDTO> customSellinPrices )
    {
        this.customSellinPrices = customSellinPrices;
    }

    public Boolean getLocked()
    {
        return locked;
    }

    public void setLocked( Boolean locked )
    {
        this.locked = locked;
    }

    public BigDecimal getRecommendedSelloutPercentage()
    {
        return recommendedSelloutPercentage;
    }

    public void setRecommendedSelloutPercentage( BigDecimal recommendedSelloutPercentage )
    {
        this.recommendedSelloutPercentage = recommendedSelloutPercentage;
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
