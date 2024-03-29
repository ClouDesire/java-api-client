package com.cloudesire.platform.apiclient.dto.model.external;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonPropertyOrder( {
        "productId", "productIdentifier", "productVersionId", "productVersionIdentifier", "configurationParameters",
        "cloudCredentialId", "language", "buyerId", "billingItems", "subscriptionId", "orderType"
  } )
public class ExternalOrderValidationDTO extends BaseExternalOrderValidationDTO
{
    private Map<String, Integer> billingItems;

    private Integer subscriptionId;

    private OrderType orderType;

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
}
