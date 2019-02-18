package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.util.Date;

abstract class ProceedsCsvDTO extends DTO
{
    private Integer invoiceId;

    private String product;

    private Date purchased;

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
}
