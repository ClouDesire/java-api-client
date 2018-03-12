package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Set;

public class DistributorDTO extends ParentChildCompanyDTO
{
    private Set<UrlEntityDTO> products;

    public DistributorDTO( String name )
    {
        super( name );
    }

    public DistributorDTO()
    {
    }

    public Set<UrlEntityDTO> getProducts()
    {
        return products;
    }

    public void setProducts( Set<UrlEntityDTO> products )
    {
        this.products = products;
    }
}
