package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

abstract class CustomOrderLineDTO extends OrderLineDTO
{
    @ApiModelProperty( "Cost for the platform owner" )
    private BigDecimal cost;

    public CustomOrderLineDTO( BigDecimal price )
    {
        this( price, null );
    }

    public CustomOrderLineDTO( BigDecimal price, BigDecimal vat )
    {
        this.setPrice( new VATPriceDTO().withValue( price ).withVAT( vat ) );
    }

    public CustomOrderLineDTO()
    {
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CustomOrderLineDTO that = (CustomOrderLineDTO) o;
        return Objects.equals( cost, that.cost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cost );
    }
}
