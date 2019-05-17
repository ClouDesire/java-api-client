package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SubscriptionV1DTO extends BaseSubscriptionDTO
{
    private Map<UrlEntityDTO, Integer> billingItems = new HashMap<>();

    public Map<UrlEntityDTO, Integer> getBillingItems()
    {
        return billingItems;
    }

    public SubscriptionV1DTO setBillingItems( Map<String, Integer> billingItems )
    {
        if ( billingItems == null ) return this;

        this.billingItems = new HashMap<>();

        for ( Map.Entry<String, Integer> entry : billingItems.entrySet() )
        {
            this.billingItems.put( new UrlEntityDTO( entry.getKey() ), entry.getValue() );
        }

        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        SubscriptionV1DTO that = (SubscriptionV1DTO) o;
        return Objects.equals( billingItems, that.billingItems );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), billingItems );
    }
}
