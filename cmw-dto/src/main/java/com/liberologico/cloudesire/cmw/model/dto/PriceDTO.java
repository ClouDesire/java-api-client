package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.MathConfiguration;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class PriceDTO extends DTO
{
    @NotNull
    protected BigDecimal price;

    protected String currency;

    public PriceDTO( BigDecimal price, String currency )
    {
        this.price = price;
        this.currency = currency;
    }

    public PriceDTO()
    {
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public BigDecimal getPrice()
    {
        if ( price == null ) return null;

        return price.setScale( MathConfiguration.COMPUTATION_PRECISION, MathConfiguration.ROUNDING_MODE );
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getTotal()
    {
        return getPrice();
    }

    // region Fluent methods
    public PriceDTO withCurrency( String currency )
    {
        this.currency = currency;
        return this;
    }

    public PriceDTO withValue( BigDecimal value )
    {
        price = value;
        return this;
    }
    // endregion

    @Override
    public String toString()
    {
        return "PriceDTO [price=" + price + ", currency=" + currency + "]";
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        PriceDTO priceDTO = (PriceDTO) o;
        return Objects.equals( price, priceDTO.price ) && Objects.equals( currency, priceDTO.currency );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( price, currency );
    }
}
