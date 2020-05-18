package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

abstract class CustomOrderLineDTO extends OrderLineDTO
{
    @ApiModelProperty( "Cost for the platform owner" )
    @FieldAPI( sinceVersion = ApiVersion.V20200518 )
    private PriceDTO platformCost;

    @ApiModelProperty( hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20200518 )
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

    public PriceDTO getPlatformCost()
    {
        return platformCost;
    }

    public void setPlatformCost( PriceDTO platformCost )
    {
        this.platformCost = platformCost;
    }

    /**
     * @deprecated by {@link #getPlatformCost()}
     */
    @Deprecated
    public BigDecimal getCost()
    {
        return cost;
    }

    /**
     * @deprecated by {@link #setPlatformCost(PriceDTO)}
     */
    @Deprecated
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
        return Objects.equals( platformCost, that.platformCost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), platformCost );
    }
}
