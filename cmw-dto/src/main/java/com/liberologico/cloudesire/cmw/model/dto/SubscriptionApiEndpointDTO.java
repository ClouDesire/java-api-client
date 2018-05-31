package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.enums.HttpMethod;

import java.util.Objects;

public class SubscriptionApiEndpointDTO extends ApiEndpointDTO
{
    private Integer quantity;

    public SubscriptionApiEndpointDTO( HttpMethod method, String path, Integer quantity )
    {
        super( method, path );
        this.quantity = quantity;
    }

    public SubscriptionApiEndpointDTO()
    {
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        SubscriptionApiEndpointDTO that = (SubscriptionApiEndpointDTO) o;
        return Objects.equals( quantity, that.quantity );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), quantity );
    }

    @Override
    public String toString()
    {
        return getMethod() + " " + getPath() + ": " + quantity;
    }
}
