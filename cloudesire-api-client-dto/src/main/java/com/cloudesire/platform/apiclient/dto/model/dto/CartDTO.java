package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

public class CartDTO extends BaseEntityDTO
{
    private UrlEntityDTO resellerCatalog;

    private UrlEntityDTO customer;

    @Valid
    private List<CartItemDTO> items;

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public UrlEntityDTO getCustomer()
    {
        return customer;
    }

    public void setCustomer( UrlEntityDTO customer )
    {
        this.customer = customer;
    }

    public List<CartItemDTO> getItems()
    {
        return items;
    }

    public void setItems( List<CartItemDTO> items )
    {
        this.items = items;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CartDTO cartDTO = (CartDTO) o;
        return Objects.equals( resellerCatalog, cartDTO.resellerCatalog ) && Objects.equals( customer, cartDTO.customer );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), resellerCatalog, customer );
    }
}
