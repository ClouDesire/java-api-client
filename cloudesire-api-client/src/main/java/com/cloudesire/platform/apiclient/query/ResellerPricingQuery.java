package com.cloudesire.platform.apiclient.query;

public class ResellerPricingQuery extends BaseQuery
{
    private static final String RESELLER_ID = "resellerId";
    private static final String CATALOG_ID = "catalogId";
    private static final String PRODUCT_ID = "productId";
    private static final String UNPRICED = "unpriced";

    public ResellerPricingQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ResellerPricingQuery setResellerId( Integer name )
    {
        put( RESELLER_ID, name );
        return this;
    }

    public ResellerPricingQuery setCatalogId( Integer name )
    {
        put( CATALOG_ID, name );
        return this;
    }

    public ResellerPricingQuery setProductId( Integer name )
    {
        put( PRODUCT_ID, name );
        return this;
    }

    public ResellerPricingQuery setUnpriced( Boolean name )
    {
        put( UNPRICED, name );
        return this;
    }
}
