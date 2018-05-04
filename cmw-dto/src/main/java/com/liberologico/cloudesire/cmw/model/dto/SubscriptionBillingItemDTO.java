package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Objects;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SubscriptionBillingItemDTO that = (SubscriptionBillingItemDTO) o;
        return Objects.equals( billingItem, that.billingItem ) && Objects.equals( value, that.value );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( billingItem, value );
    }
}
