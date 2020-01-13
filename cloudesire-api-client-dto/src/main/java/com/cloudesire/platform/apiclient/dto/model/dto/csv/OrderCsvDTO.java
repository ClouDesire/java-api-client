package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonPropertyOrder( {
        "id", "name", "type", "nomineeId", "nominee", "email", "pec", "sdiCode", "address", "fiscalCode", "taxCode",
        "date", "endOfPeriod", "total", "currency", "vat"
} )
public class OrderCsvDTO extends BaseOrderCsvDTO
{
    private String name;

    private Date endOfPeriod;

    // region Auto-generated code
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Date getEndOfPeriod()
    {
        return endOfPeriod;
    }

    public void setEndOfPeriod( Date endOfPeriod )
    {
        this.endOfPeriod = endOfPeriod;
    }
    // endregion
}
