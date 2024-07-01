package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Schema( description = "A price" )
public class PriceDTO implements DTO
{
    @NotNull
    @Schema( description = "The price for the current resource")
    protected BigDecimal price;

    @Schema( description = "The currency of the price", example = "EUR" )
    protected String currency;

    public PriceDTO( BigDecimal price, String currency )
    {
        this.price = price;
        this.currency = currency;
    }

    public PriceDTO( String price )
    {
        this.price = new BigDecimal( price );
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
        return price;
    }

    public void setPrice( @NotNull BigDecimal price )
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
