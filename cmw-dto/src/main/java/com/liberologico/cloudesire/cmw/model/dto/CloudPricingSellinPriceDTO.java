package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.ResellingConfigurationType;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CloudPricingSellinPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO distributorPricing;

    @NotNull
    @Valid
    private UrlEntityDTO cloudPricing;

    @Valid
    protected ResellingPriceDTO price;

    public CloudPricingSellinPriceDTO( UrlEntityDTO cloudPricing, BigDecimal markup, ResellingConfigurationType markupType )
    {
        this( cloudPricing, new ResellingPriceDTO( markup, markupType ) );
    }

    public CloudPricingSellinPriceDTO( UrlEntityDTO cloudPricing, BigDecimal markup )
    {
        this( cloudPricing, new ResellingPriceDTO( markup ) );
    }

    public CloudPricingSellinPriceDTO( UrlEntityDTO cloudPricing, ResellingPriceDTO price )
    {
        this( cloudPricing );
        this.price = price;
    }

    public CloudPricingSellinPriceDTO( UrlEntityDTO cloudPricing )
    {
        this.cloudPricing = cloudPricing;
    }

    // region Auto-generated code
    public CloudPricingSellinPriceDTO()
    {
    }

    public UrlEntityDTO getDistributorPricing()
    {
        return distributorPricing;
    }

    public void setDistributorPricing( UrlEntityDTO distributorPricing )
    {
        this.distributorPricing = distributorPricing;
    }

    public UrlEntityDTO getCloudPricing()
    {
        return cloudPricing;
    }

    public void setCloudPricing( UrlEntityDTO cloudPricing )
    {
        this.cloudPricing = cloudPricing;
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CloudPricingSellinPriceDTO that = (CloudPricingSellinPriceDTO) o;
        return Objects.equals( distributorPricing, that.distributorPricing ) && Objects
                .equals( cloudPricing, that.cloudPricing );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( distributorPricing, cloudPricing );
    }
    // endregion
}
