package com.cloudesire.platform.apiclient.dto.model.external;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

import java.util.Map;

public class ExternalOrderValidationDTO extends BaseExternalOrderValidationDTO
{
    private Map<String, Integer> billingItems;

    private Integer subscriptionId;

    private OrderType orderType;

    private Integer cloudCredentialId;

    public Map<String, Integer> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Map<String, Integer> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Integer getSubscriptionId()
    {
        return subscriptionId;
    }

    public void setSubscriptionId( Integer subscriptionId )
    {
        this.subscriptionId = subscriptionId;
    }

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void setOrderType( OrderType orderType )
    {
        this.orderType = orderType;
    }

    public Integer getCloudCredentialId()
    {
        return cloudCredentialId;
    }

    public void setCloudCredentialId( Integer cloudCredentialId )
    {
        this.cloudCredentialId = cloudCredentialId;
    }
}
