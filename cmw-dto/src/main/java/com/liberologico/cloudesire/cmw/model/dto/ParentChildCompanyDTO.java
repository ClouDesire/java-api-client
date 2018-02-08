package com.liberologico.cloudesire.cmw.model.dto;

@SuppressWarnings( "squid:MaximumInheritanceDepth" )
public class ParentChildCompanyDTO extends MinimalCompanyDTO
{
    private String marketplaceDomain;

    public ParentChildCompanyDTO( String name )
    {
        super( name );
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
