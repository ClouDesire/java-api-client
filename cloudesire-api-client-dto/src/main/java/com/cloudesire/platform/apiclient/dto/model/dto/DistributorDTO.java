package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Set;

public class DistributorDTO extends ParentChildCompanyDTO
{
    private Set<UrlEntityDTO> products;

    public DistributorDTO( String name, String email )
    {
        super( name, email );
    }

    public DistributorDTO( String name )
    {
        super( name );
    }

    public DistributorDTO()
    {
        super();
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
