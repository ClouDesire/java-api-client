package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class SubscriptionBillingItemDTO extends DTO
{
    private UrlEntityDTO billingItem;

    @ApiModelProperty( "The chosen value for this billing item" )
    private Integer value;

    @ApiModelProperty( "Whether the billing item has been already bought for the Subscription" )
    private Boolean bought;

    @ApiModelProperty( "An alternative description to identify a quantity range" )
    private String tag;

    @ApiModelProperty( "Whether the chosen value is in the last range of the possible values" )
    private Boolean unlimited;

    private ApiEndpointDTO endpoint;

    public SubscriptionBillingItemDTO( UrlEntityDTO billingItem, Integer value )
    {
        this.billingItem = billingItem;
        this.value = value;
        this.bought = true;
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

    public Boolean getBought()
    {
        return bought;
    }

    public void setBought( Boolean bought )
    {
        this.bought = bought;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public Boolean getUnlimited()
    {
        return unlimited;
    }

    public void setUnlimited( Boolean unlimited )
    {
        this.unlimited = unlimited;
    }

    public ApiEndpointDTO getEndpoint()
    {
        return endpoint;
    }

    public void setEndpoint( ApiEndpointDTO endpoint )
    {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SubscriptionBillingItemDTO that = (SubscriptionBillingItemDTO) o;
        return Objects.equals( billingItem, that.billingItem ) && Objects.equals( value, that.value ) && Objects
                .equals( bought, that.bought );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( billingItem, value, bought );
    }

    @Override
    public String toString()
    {
        return "SubscriptionBillingItemDTO{" + "billingItem=" + billingItem + ", value=" + value + ", bought=" + bought
                + '}';
    }
}
