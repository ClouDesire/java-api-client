package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;
import java.util.Date;

public abstract class ProceedsCsvDTO extends DTO
{
    private Integer invoiceId;

    private String product;

    private Date purchased;

    private String vendor;

    private Integer lineId;

    private LineType type;

    private String description;

    private BigDecimal quantity;

    public Integer getInvoiceId()
    {
        return invoiceId;
    }

    public void setInvoiceId( Integer invoiceId )
    {
        this.invoiceId = invoiceId;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct( String product )
    {
        this.product = product;
    }

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }

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
