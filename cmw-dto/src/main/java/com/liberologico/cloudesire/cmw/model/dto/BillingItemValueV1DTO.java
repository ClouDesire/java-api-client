package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Objects;

public class BillingItemValueV1DTO extends BillingItemValueDTO
{
    @ApiModelProperty( "Recurring cost for every billing period" )
    @Min( 0 )
    private BigDecimal recurring;

    @ApiModelProperty( "Recurring cost set by vendor, visible to admin only" )
    @Min( 0 )
    private BigDecimal vendorRecurring;

    public BigDecimal getRecurring()
    {
        return recurring;
    }

    public void setRecurring( BigDecimal recurring )
    {
        this.recurring = recurring;
    }

    public BigDecimal getVendorRecurring()
    {
        return vendorRecurring;
    }

    public void setVendorRecurring( BigDecimal vendorRecurring )
    {
        this.vendorRecurring = vendorRecurring;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        BillingItemValueV1DTO that = (BillingItemValueV1DTO) o;
        return Objects.equals( recurring, that.recurring );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), recurring );
    }
}
