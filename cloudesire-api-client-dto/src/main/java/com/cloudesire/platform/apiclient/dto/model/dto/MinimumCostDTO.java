package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

@Schema( description = "Billing details for the cheapest Product Version for a Product" )
public class MinimumCostDTO implements DTO
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        MinimumCostDTO that = (MinimumCostDTO) o;
        return Objects.equals( cost, that.cost ) && Objects.equals( billingPeriod, that.billingPeriod ) && Objects
                .equals( lifespan, that.lifespan ) && Objects.equals( cheapest, that.cheapest );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( cost, billingPeriod, lifespan, cheapest );
    }
}
