package com.liberologico.cloudesire.cmw.model.dto;

public class SubscriptionBillingItemDTO extends DTO
{
    private UrlEntityDTO billingItem;

    private Integer value;

    private Boolean unlimited;

    public SubscriptionBillingItemDTO( UrlEntityDTO billingItem, Integer value )
    {
        this.billingItem = billingItem;
        this.value = value;
    }

    public SubscriptionBillingItemDTO()
    {
    }

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue( Integer value )
    {
        this.value = value;
    }

    public Boolean getUnlimited()
    {
        return unlimited;
    }

    public void setUnlimited( Boolean unlimited )
    {
        this.unlimited = unlimited;
    }
}
