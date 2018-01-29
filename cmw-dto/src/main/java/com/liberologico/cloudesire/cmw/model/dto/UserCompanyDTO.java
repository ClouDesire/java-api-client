package com.liberologico.cloudesire.cmw.model.dto;

@SuppressWarnings( "squid:MaximumInheritanceDepth" )
public class UserCompanyDTO extends CompanyDTO
{
    private String marketplaceDomain;

    public String getMarketplaceDomain()
    {
        return marketplaceDomain;
    }

    public void setMarketplaceDomain( String marketplaceDomain )
    {
        this.marketplaceDomain = marketplaceDomain;
    }
}
