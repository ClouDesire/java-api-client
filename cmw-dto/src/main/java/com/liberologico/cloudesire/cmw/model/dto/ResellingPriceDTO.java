package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.ResellingConfigurationType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ResellingPriceDTO extends DTO
{
    @ApiModelProperty( "The markup percentage on the product price, editable by the distributor" )
    private BigDecimal markup;

    private ResellingConfigurationType markupType;

    @ApiModelProperty( value = "The sell-in price of this product", readOnly = true )
    private BigDecimal sellin;

    @ApiModelProperty( "The sell-out price for this product, editable by a reseller" )
    private BigDecimal sellout;

    private ResellingConfigurationType selloutType;

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

    public ResellingConfigurationType getMarkupType()
    {
        return markupType;
    }

    public void setMarkupType( ResellingConfigurationType markupType )
    {
        this.markupType = markupType;
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

    public ResellingConfigurationType getSelloutType()
    {
        return selloutType;
    }

    public void setSelloutType( ResellingConfigurationType selloutType )
    {
        this.selloutType = selloutType;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ResellingPriceDTO ) ) return false;
        ResellingPriceDTO that = (ResellingPriceDTO) o;
        return Objects.equals( markup, that.markup ) && markupType == that.markupType && Objects
                .equals( sellout, that.sellout ) && selloutType == that.selloutType;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( markup, markupType, sellout, selloutType );
    }
    // endregion
}
