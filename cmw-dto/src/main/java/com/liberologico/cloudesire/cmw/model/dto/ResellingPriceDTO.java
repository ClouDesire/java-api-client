package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.ResellingConfigurationType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ResellingPriceDTO extends DTO
{
    @ApiModelProperty( "The markup on the price, editable by a distributor" )
    private BigDecimal markup;

    @ApiModelProperty( "The markup type, editable by a distributor" )
    private ResellingConfigurationType markupType;

    @ApiModelProperty( value = "The sell-in price", readOnly = true )
    private BigDecimal sellin;

    @ApiModelProperty( "The sell-out on the price, editable by a reseller" )
    private BigDecimal sellout;

    @ApiModelProperty( "The sell-out type, editable by a reseller" )
    private ResellingConfigurationType selloutType;

    public static ResellingPriceDTO sellout( BigDecimal value, ResellingConfigurationType type )
    {
        return new ResellingPriceDTO( null, null, value, type );
    }

    // region Auto-generated code
    public ResellingPriceDTO( BigDecimal markup, BigDecimal sellout )
    {
        this( markup );
        this.sellout = sellout;
    }

    public ResellingPriceDTO( BigDecimal markup, ResellingConfigurationType markupType )
    {
        this( markup );
        this.markupType = markupType;
    }

    public ResellingPriceDTO( BigDecimal markup )
    {
        this.markup = markup;
    }

    private ResellingPriceDTO( BigDecimal markup, ResellingConfigurationType markupType, BigDecimal sellout,
            ResellingConfigurationType selloutType )
    {
        this.markup = markup;
        this.markupType = markupType;
        this.sellout = sellout;
        this.selloutType = selloutType;
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
