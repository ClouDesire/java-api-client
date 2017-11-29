package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.OrderType;

import javax.validation.constraints.NotNull;
import java.util.Map;

public class BudgetInputDTO
{
    @NotNull
    private OrderType type = OrderType.NORMAL;

    @NotNull
    private Integer productVersionId;

    private Integer providerId;

    private Integer bandwidthPricingId;

    private int billingPeriods = 1;

    private Integer subscriptionId;

    private String hashCoupon;

    private Map<UrlEntityDTO, Integer> billingItems;

    private String reseller;

    public OrderType getType()
    {
        return type;
    }

    public BudgetInputDTO setType( OrderType type )
    {
        this.type = type;
        return this;
    }

    public Integer getProductVersionId()
    {
        return productVersionId;
    }

    public BudgetInputDTO setProductVersionId( Integer productVersionId )
    {
        this.productVersionId = productVersionId;
        return this;
    }

    public Integer getProviderId()
    {
        return providerId;
    }

    public BudgetInputDTO setProviderId( Integer providerId )
    {
        this.providerId = providerId;
        return this;
    }

    public Integer getBandwidthPricingId()
    {
        return bandwidthPricingId;
    }

    public BudgetInputDTO setBandwidthPricingId( Integer bandwidthPricingId )
    {
        this.bandwidthPricingId = bandwidthPricingId;
        return this;
    }

    public int getBillingPeriods()
    {
        return billingPeriods;
    }

    public BudgetInputDTO setBillingPeriods( int billingPeriods )
    {
        this.billingPeriods = billingPeriods;
        return this;
    }

    public Integer getSubscriptionId()
    {
        return subscriptionId;
    }

    public BudgetInputDTO setSubscriptionId( Integer subscriptionId )
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getHashCoupon()
    {
        return hashCoupon;
    }

    public BudgetInputDTO setHashCoupon( String hashCoupon )
    {
        this.hashCoupon = hashCoupon;
        return this;
    }

    public Map<UrlEntityDTO, Integer> getBillingItems()
    {
        return billingItems;
    }

    public BudgetInputDTO setBillingItems( Map<UrlEntityDTO, Integer> billingItems )
    {
        this.billingItems = billingItems;
        return this;
    }

    public String getReseller()
    {
        return reseller;
    }

    public BudgetInputDTO setReseller( String reseller )
    {
        this.reseller = reseller;
        return this;
    }
}
