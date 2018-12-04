package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ResellerCatalogDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO reseller;

    private Set<UrlEntityDTO> customers;

    private List<UrlEntityDTO> pricings;

    public ResellerCatalogDTO( String name )
    {
        super( name );
    }

    public ResellerCatalogDTO()
    {
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public Set<UrlEntityDTO> getCustomers()
    {
        return customers;
    }

    public void setCustomers( Set<UrlEntityDTO> customers )
    {
        this.customers = customers;
    }

    public List<UrlEntityDTO> getPricings()
    {
        return pricings;
    }

    public void setPricings( List<UrlEntityDTO> pricings )
    {
        this.pricings = pricings;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ResellerCatalogDTO that = (ResellerCatalogDTO) o;
        return Objects.equals( reseller, that.reseller );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), reseller );
    }
}
