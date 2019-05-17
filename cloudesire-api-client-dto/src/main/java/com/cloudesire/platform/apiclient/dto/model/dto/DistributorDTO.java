package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Objects;
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        DistributorDTO that = (DistributorDTO) o;
        return Objects.equals( products, that.products );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), products );
    }
}
