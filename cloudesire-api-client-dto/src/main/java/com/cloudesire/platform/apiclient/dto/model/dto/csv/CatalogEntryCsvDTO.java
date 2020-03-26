package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "resource", "identifier", "start", "end", "price", "vendorPrice" } )
public class CatalogEntryCsvDTO extends DTO
{
    private String resource;

    private String identifier;

    private Integer start;

    private Integer end;

    private BigDecimal price;

    private BigDecimal vendorPrice;

    // region Getters & Setters
    public String getResource()
    {
        return resource;
    }

    public void setResource( String resource )
    {
        this.resource = resource;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    public Integer getStart()
    {
        return start;
    }

    public void setStart( Integer start )
    {
        this.start = start;
    }

    public Integer getEnd()
    {
        return end;
    }

    public void setEnd( Integer end )
    {
        this.end = end;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getVendorPrice()
    {
        return vendorPrice;
    }

    public void setVendorPrice( BigDecimal vendorPrice )
    {
        this.vendorPrice = vendorPrice;
    }
    // endregion
}
