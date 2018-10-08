package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Set;

public class DistributorCatalogDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO distributor;

    private Set<UrlEntityDTO> resellers;

    private Set<UrlEntityDTO> pricings;

    public DistributorCatalogDTO( String name )
    {
        super( name );
    }

    public DistributorCatalogDTO()
    {
    }

    public UrlEntityDTO getDistributor()
    {
        return distributor;
    }

    public void setDistributor( UrlEntityDTO distributor )
    {
        this.distributor = distributor;
    }

    public Set<UrlEntityDTO> getResellers()
    {
        return resellers;
    }

    public void setResellers( Set<UrlEntityDTO> resellers )
    {
        this.resellers = resellers;
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
