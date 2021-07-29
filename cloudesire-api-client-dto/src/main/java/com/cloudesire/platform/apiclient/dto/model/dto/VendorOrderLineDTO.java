package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;

public class VendorOrderLineDTO extends CustomOrderLineDTO
{
    public VendorOrderLineDTO( BigDecimal value )
    {
        super( value );
    }

    public VendorOrderLineDTO( BigDecimal value, BigDecimal vat )
    {
        super( value, vat );
    }

    public VendorOrderLineDTO()
    {
        super();
    }

    private String tag;

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

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }
}
