package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "resource", "cloudProvider", "specs", "price", "cost" } )
public class CatalogCloudPricingCsvDTO extends DTO
{
    private String resource;

    private String cloudProvider;

    private String specs;

    private BigDecimal price;

    private BigDecimal cost;

    // region Getters & Setters
    public String getResource()
    {
        return resource;
    }

    public void setResource( String resource )
    {
        this.resource = resource;
    }

    public String getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( String cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public String getSpecs()
    {
        return specs;
    }

    public void setSpecs( String specs )
    {
        this.specs = specs;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }
    // endregion
}
