package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;

public class BudgetCloudPricingDTO implements DTO
{
    private String type;

    private String specs;

    private BigDecimal price;

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
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
}
