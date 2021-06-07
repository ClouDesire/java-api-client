package com.cloudesire.platform.apiclient.query;

public class DistributorPricingQuery extends BaseQuery
{
    private static final String CATALOG_ID = "catalogId";
    private static final String PRODUCT_ID = "productId";
    private static final String PRODUCT_VERSION_ID = "productVersionId";
    private static final String RESELLER_ID = "resellerId";
    private static final String DEPRECATED = "deprecated";

    public DistributorPricingQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public DistributorPricingQuery setCatalogId( Integer id )
    {
        put( CATALOG_ID, id );
        return this;
    }

    public DistributorPricingQuery setProductId( Integer id )
    {
        put( PRODUCT_ID, id );
        return this;
    }

    public DistributorPricingQuery setProductVersionId( Integer id )
    {
        put( PRODUCT_VERSION_ID, id );
        return this;
    }

    public DistributorPricingQuery setResellerId( int resellerId )
    {
        put( RESELLER_ID, resellerId );
        return this;
    }

    public DistributorPricingQuery setDeprecated( Boolean deprecated )
    {
        put( DEPRECATED, deprecated );
        return this;
    }
}
