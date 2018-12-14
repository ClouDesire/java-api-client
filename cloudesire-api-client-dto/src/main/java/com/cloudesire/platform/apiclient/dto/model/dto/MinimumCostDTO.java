package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;

public class MinimumCostDTO extends DTO
{
    private VATPriceDTO cost;

    private Integer billingPeriod;

    private Integer lifespan;

    @Valid
    private UrlEntityDTO cheapest;

    public MinimumCostDTO( VATPriceDTO cost, Integer billingPeriod, Integer lifespan, UrlEntityDTO cheapest )
    {
        this.cost = cost;
        this.billingPeriod = billingPeriod;
        this.lifespan = lifespan;
        this.cheapest = cheapest;
    }

    public MinimumCostDTO()
    {
    }

    public VATPriceDTO getCost()
    {
        return cost;
    }

    public Integer getBillingPeriod()
    {
        return billingPeriod;
    }

    public Integer getLifespan()
    {
        return lifespan;
    }

    public UrlEntityDTO getCheapest()
    {
        return cheapest;
    }
}
