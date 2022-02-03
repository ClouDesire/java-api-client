package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CloudPricingType;

import java.math.BigDecimal;

public class BudgetCloudPricingDTO implements DTO
{
    private CloudPricingType type;

    private String specs;

    private BigDecimal price;

    public CloudPricingType getType()
    {
        return type;
    }

    public void setType( CloudPricingType type )
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
