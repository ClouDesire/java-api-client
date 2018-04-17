package com.liberologico.cloudesire.cmw.model.dto;

public abstract class ParentChildCompanyDTO extends MinimalCompanyDTO
{
    private String marketplaceDomain;

    public ParentChildCompanyDTO( String name, String email )
    {
        super( name, email );
    }

    public ParentChildCompanyDTO()
    {
    }

    public String getMarketplaceDomain()
    {
        return marketplaceDomain;
    }

    public void setMarketplaceDomain( String marketplaceDomain )
    {
        this.marketplaceDomain = marketplaceDomain;
    }
}
