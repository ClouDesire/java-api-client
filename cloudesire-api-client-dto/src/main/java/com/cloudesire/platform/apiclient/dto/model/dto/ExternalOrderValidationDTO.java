package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

import java.util.Map;

public class ExternalOrderValidationDTO extends BaseExternalOrderValidationDTO
{
    private Map<String, Integer> billingItems;

    private Map<String, String> configurationParameters;

    private Integer subscriptionId;

    private Integer buyerId;

    private OrderType orderType;

    public Map<String, Integer> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Map<String, Integer> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Map<String, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<String, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public Integer getSubscriptionId()
    {
        return subscriptionId;
    }

    public void setSubscriptionId( Integer subscriptionId )
    {
        this.subscriptionId = subscriptionId;
    }

    public Integer getBuyerId()
    {
        return buyerId;
    }

    public void setBuyerId( Integer buyerId )
    {
        this.buyerId = buyerId;
    }

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void setOrderType( OrderType orderType )
    {
        this.orderType = orderType;
    }
}
