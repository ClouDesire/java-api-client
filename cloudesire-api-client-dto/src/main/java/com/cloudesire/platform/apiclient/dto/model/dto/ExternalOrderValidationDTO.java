package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

import java.util.Map;

public class ExternalOrderValidationDTO implements DTO
{
    private Integer productId;

    private String productIdentifier;

    private Integer productVersionId;

    private String productVersionIdentifier;

    private Map<String, Integer> billingItems;

    private Map<String, String> configurationParameters;

    private Integer subscriptionId;

    private Integer buyerId;

    private OrderType orderType;

    private String language;

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId( Integer productId )
    {
        this.productId = productId;
    }

    public String getProductIdentifier()
    {
        return productIdentifier;
    }

    public void setProductIdentifier( String productIdentifier )
    {
        this.productIdentifier = productIdentifier;
    }

    public Integer getProductVersionId()
    {
        return productVersionId;
    }

    public void setProductVersionId( Integer productVersionId )
    {
        this.productVersionId = productVersionId;
    }

    public String getProductVersionIdentifier()
    {
        return productVersionIdentifier;
    }

    public void setProductVersionIdentifier( String productVersionIdentifier )
    {
        this.productVersionIdentifier = productVersionIdentifier;
    }

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

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }
}
