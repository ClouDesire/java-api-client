package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class CostDTO implements DTO
{
    private UrlEntityDTO subscription;

    private OrderType orderType;

    private LineType type;

    private UrlEntityDTO billingItem;

    private String identifier;

    private String description;

    private BigDecimal cost;

    private ZonedDateTime purchased;

    @JsonAnyGetter
    @JsonAnySetter
    private Map<String, String> tags;

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void setOrderType( OrderType orderType )
    {
        this.orderType = orderType;
    }

    public LineType getType()
    {
        return type;
    }

    public void setType( LineType type )
    {
        this.type = type;
    }

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }

    public ZonedDateTime getPurchased()
    {
        return purchased;
    }

    public void setPurchased( ZonedDateTime purchased )
    {
        this.purchased = purchased;
    }

    public Map<String, String> getTags()
    {
        return tags;
    }

    public void setTags( Map<String, String> tags )
    {
        this.tags = tags;
    }
}
