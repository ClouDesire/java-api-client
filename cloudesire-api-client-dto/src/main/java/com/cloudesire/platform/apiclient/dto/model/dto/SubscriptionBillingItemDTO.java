package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

import static com.liberologico.cloudesire.common.MathConfiguration.DAY_SCALE_PRECISION;
import static com.liberologico.cloudesire.common.MathConfiguration.ROUNDING_MODE;

public class SubscriptionBillingItemDTO implements DTO
{
    private UrlEntityDTO billingItem;

    @Schema( description = "Unique identifier of the billing item")
    private String identifier;

    @Schema( description = "Descriptive name of the billing item")
    private String unit;

    @Schema( description = "The current value for this billing item")
    private BigDecimal value;

    @Schema( description = "Whether the billing item has been already bought for the Subscription")
    private Boolean bought;

    @Schema( description = "An alternative description to identify a quantity range")
    private String tag;

    @Schema( description = "Whether the chosen value is in the last range of the possible values")
    private Boolean unlimited;

    private ApiEndpointDTO endpoint;

    private SubscriptionBillingItemDTO( UrlEntityDTO billingItem, BigDecimal value, boolean bought )
    {
        this.billingItem = billingItem;
        this.value = value;
        this.bought = bought;
    }

    public SubscriptionBillingItemDTO( UrlEntityDTO billingItem, Integer value, boolean bought )
    {
        this( billingItem, new BigDecimal( value ).setScale( DAY_SCALE_PRECISION, ROUNDING_MODE ), bought );
    }

    public SubscriptionBillingItemDTO( UrlEntityDTO billingItem, Integer value )
    {
        this( billingItem, value, true );
    }

    public SubscriptionBillingItemDTO( UrlEntityDTO billingItem, BigDecimal value )
    {
        this( billingItem, value, true );
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

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit( String unit )
    {
        this.unit = unit;
    }

    public BigDecimal getValue()
    {
        return value;
    }

    public void setValue( BigDecimal value )
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
