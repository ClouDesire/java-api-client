package com.cloudesire.platform.apiclient.query;

public class ResellerCatalogQuery extends PageRequestQuery
{
    private static final String RESELLER = "reseller";
    private static final String CATALOG_ID = "catalogId";

    public ResellerCatalogQuery setReseller( String reseller )
    {
        put( RESELLER, reseller );
        return this;
    }

    public ResellerCatalogQuery setCatalogId( Integer catalogId )
    {
        put( CATALOG_ID, catalogId );
        return this;
    }

}
