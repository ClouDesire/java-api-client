package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;

public class VendorOrderLineDTO extends OrderLineDTO
{
    public VendorOrderLineDTO( BigDecimal value )
    {
        this( value, null );
    }

    public VendorOrderLineDTO( BigDecimal value, BigDecimal vat )
    {
        this.setPrice( new VATPriceDTO().withValue( value ).withVAT( vat ) );
    }

    public VendorOrderLineDTO()
    {
    }

    @Override
    public LineType getType()
    {
        return LineType.CUSTOM;
    }

    @Override
    public void setType( LineType type )
    {
        // type is fixed to CUSTOM
    }
}
