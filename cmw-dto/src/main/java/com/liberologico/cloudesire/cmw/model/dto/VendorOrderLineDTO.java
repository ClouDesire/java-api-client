package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.LineType;

import java.math.BigDecimal;

public class VendorOrderLineDTO extends OrderLineDTO
{
    public VendorOrderLineDTO( BigDecimal value, BigDecimal vat )
    {
        this();
        this.setPrice( new VATPriceDTO().withValue( value ).withVAT( vat ) );
    }

    public VendorOrderLineDTO()
    {
        super();
    }

    @Override
    public LineType getType()
    {
        return LineType.CUSTOM;
    }

    @Override
    public void setType( LineType type )
    {
    }
}
