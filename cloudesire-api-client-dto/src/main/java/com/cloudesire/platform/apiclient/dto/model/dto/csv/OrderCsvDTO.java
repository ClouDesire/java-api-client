package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( { "name", "type", "buyer", "date", "endOfPeriod", "currency", "vat" } )
public class OrderCsvDTO extends DTO
{
    private String name;

    private String type;

    private String buyer;

    private Date date;

    private Date endOfPeriod;

    private String currency;

    private BigDecimal vat;

    // region Auto-generated code

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getBuyer()
    {
        return buyer;
    }

    public void setBuyer( String buyer )
    {
        this.buyer = buyer;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public Date getEndOfPeriod()
    {
        return endOfPeriod;
    }

    public void setEndOfPeriod( Date endOfPeriod )
    {
        this.endOfPeriod = endOfPeriod;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public BigDecimal getVat()
    {
        return vat;
    }

    public void setVat( BigDecimal vat )
    {
        this.vat = vat;
    }

    // endregion
}
