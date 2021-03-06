package com.cloudesire.platform.apiclient.dto.model.dto;

public abstract class ParentChildCompanyDTO extends MinimalCompanyDTO
{
    private String marketplaceDomain;

    public ParentChildCompanyDTO( String name, String email )
    {
        super( name, email );
    }

    public ParentChildCompanyDTO( String name )
    {
        super( name );
    }

    public ParentChildCompanyDTO()
    {
        super();
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
