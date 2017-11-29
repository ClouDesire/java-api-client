package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Set;

public class DistributorDTO extends UserProfileDTO
{
    private Set<UrlEntityDTO> products;

    public Set<UrlEntityDTO> getProducts()
    {
        return products;
    }

    public void setProducts( Set<UrlEntityDTO> products )
    {
        this.products = products;
    }
}
