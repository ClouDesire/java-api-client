package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CloudPricingResellingPriceDTO extends BaseResellingPriceDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudPricing;

    public CloudPricingResellingPriceDTO( UrlEntityDTO cloudPricing, BigDecimal markup )
    {
        this.cloudPricing = cloudPricing;
        this.price = new ResellingPriceDTO( markup );
    }

    // region Auto-generated code
    public CloudPricingResellingPriceDTO()
    {
    }

    public UrlEntityDTO getCloudPricing()
    {
        return cloudPricing;
    }

    public void setCloudPricing( UrlEntityDTO cloudPricing )
    {
        this.cloudPricing = cloudPricing;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CloudPricingResellingPriceDTO that = (CloudPricingResellingPriceDTO) o;
        return Objects.equals( cloudPricing, that.cloudPricing );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudPricing );
    }
    // endregion
}
