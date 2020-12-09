package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

public class CartDTO extends BaseEntityDTO
{
    private UrlEntityDTO reseller;

    private UrlEntityDTO customer;

    @Valid
    private List<CartItemDTO> items;

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
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
        return Objects.equals( reseller, cartDTO.reseller ) && Objects.equals( customer, cartDTO.customer );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), reseller, customer );
    }
}
