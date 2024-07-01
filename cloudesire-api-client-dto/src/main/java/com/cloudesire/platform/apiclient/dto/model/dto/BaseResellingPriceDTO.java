package com.cloudesire.platform.apiclient.dto.model.dto;

import jakarta.validation.Valid;
import java.util.Objects;

abstract class BaseResellingPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO resellerPricing;

    @Valid
    protected ResellingPriceDTO price;

    // region Auto-generated code
    public UrlEntityDTO getResellerPricing()
    {
        return resellerPricing;
    }

    public void setResellerPricing( UrlEntityDTO resellerPricing )
    {
        this.resellerPricing = resellerPricing;
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
        BaseResellingPriceDTO that = (BaseResellingPriceDTO) o;
        return Objects.equals( resellerPricing, that.resellerPricing );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( resellerPricing );
    }
    // endregion
}
