package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CartDTO extends BaseEntityDTO
{
    @Size( max = 125 )
    private String name;

    private String notes;

    private UrlEntityDTO customer;

    private UrlEntityDTO reseller;

    private UrlEntityDTO resellerCatalog;

    @Valid
    private List<CartItemDTO> items;

    private Date createdAt;

    private Date updatedAt;

    private Date checkoutAt;

    public CartDTO( String name )
    {
        this.name = name;
    }

    public CartDTO()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes( String notes )
    {
        this.notes = notes;
    }

    public UrlEntityDTO getCustomer()
    {
        return customer;
    }

    public void setCustomer( UrlEntityDTO customer )
    {
        this.customer = customer;
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public List<CartItemDTO> getItems()
    {
        return items;
    }

    public void setItems( List<CartItemDTO> items )
    {
        this.items = items;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt( Date createdAt )
    {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt( Date updatedAt )
    {
        this.updatedAt = updatedAt;
    }

    public Date getCheckoutAt()
    {
        return checkoutAt;
    }

    public void setCheckoutAt( Date checkoutAt )
    {
        this.checkoutAt = checkoutAt;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CartDTO cartDTO = (CartDTO) o;
        return Objects.equals( customer, cartDTO.customer ) && Objects.equals( reseller, cartDTO.reseller )
                && Objects.equals( resellerCatalog, cartDTO.resellerCatalog ) && Objects.equals( checkoutAt,
                cartDTO.checkoutAt );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), customer, reseller, resellerCatalog, checkoutAt );
    }
}
