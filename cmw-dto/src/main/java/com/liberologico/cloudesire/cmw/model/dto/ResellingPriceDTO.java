package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ResellingPriceDTO extends DTO
{
    @ApiModelProperty( "The markup percentage on the product price, editable by the distributor" )
    private BigDecimal markup;

    @ApiModelProperty( value = "The sell-in price of this product", readOnly = true )
    private BigDecimal sellin;

    @ApiModelProperty( "The sell-out price for this product, editable by a reseller" )
    private BigDecimal sellout;

    // region Auto-generated code
    public ResellingPriceDTO( BigDecimal markup, BigDecimal sellout )
    {
        this( markup );
        this.sellout = sellout;
    }

    public ResellingPriceDTO( BigDecimal markup )
    {
        this.markup = markup;
    }

    public ResellingPriceDTO()
    {
    }

    public BigDecimal getMarkup()
    {
        return markup;
    }

    public void setMarkup( BigDecimal markup )
    {
        this.markup = markup;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ResellingPriceDTO ) ) return false;
        ResellingPriceDTO that = (ResellingPriceDTO) o;
        return Objects.equals( markup, that.markup ) && Objects.equals( sellout, that.sellout );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( markup, sellout );
    }
    // endregion
}
