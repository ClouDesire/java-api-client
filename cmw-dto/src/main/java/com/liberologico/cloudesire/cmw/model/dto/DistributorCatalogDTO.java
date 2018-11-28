package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.Date;
import java.util.Set;

public class DistributorCatalogDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO distributor;

    private Set<UrlEntityDTO> resellers;

    private Set<UrlEntityDTO> pricings;

    private Date validity;

    private Date expiration;

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

    public Date getValidity()
    {
        return validity;
    }

    public void setValidity( Date validity )
    {
        this.validity = validity;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration( Date expiration )
    {
        this.expiration = expiration;
    }
}
