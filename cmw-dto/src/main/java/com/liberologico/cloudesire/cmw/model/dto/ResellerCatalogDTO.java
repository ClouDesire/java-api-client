package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.Set;

public class ResellerCatalogDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO reseller;

    private Set<UrlEntityDTO> customers;

    private Set<UrlEntityDTO> pricings;

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

    public Set<UrlEntityDTO> getPricings()
    {
        return pricings;
    }

    public void setPricings( Set<UrlEntityDTO> pricings )
    {
        this.pricings = pricings;
    }
}
