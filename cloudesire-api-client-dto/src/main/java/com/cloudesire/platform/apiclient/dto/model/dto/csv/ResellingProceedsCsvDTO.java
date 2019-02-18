package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;

public abstract class ResellingProceedsCsvDTO extends ProceedsCsvDTO
{
    private String vendor;

    private Integer lineId;

    private LineType type;

    private String description;

    private BigDecimal quantity;

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor( String vendor )
    {
        this.vendor = vendor;
    }

    public Integer getLineId()
    {
        return lineId;
    }

    public void setLineId( Integer lineId )
    {
        this.lineId = lineId;
    }

    public LineType getType()
    {
        return type;
    }

    public void setType( LineType type )
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity( BigDecimal quantity )
    {
        this.quantity = quantity;
    }
}
