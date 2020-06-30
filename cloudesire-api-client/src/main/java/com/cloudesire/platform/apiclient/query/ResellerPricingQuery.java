package com.cloudesire.platform.apiclient.query;

public class ResellerPricingQuery extends BaseQuery
{
    private static final String RESELLER_ID = "resellerId";
    private static final String CATALOG_ID = "catalogId";
    private static final String PRODUCT_ID = "productId";
    private static final String PRODUCT_VERSION_ID = "productVersionId";
    private static final String UNPRICED = "unpriced";

    public ResellerPricingQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ResellerPricingQuery setResellerId( Integer id )
    {
        put( RESELLER_ID, id );
        return this;
    }

    public ResellerPricingQuery setCatalogId( Integer id )
    {
        put( CATALOG_ID, id );
        return this;
    }

    public ResellerPricingQuery setProductId( Integer id )
    {
        put( PRODUCT_ID, id );
        return this;
    }

    public ResellerPricingQuery setProductVersionId( Integer id )
    {
        put( PRODUCT_VERSION_ID, id );
        return this;
    }

    public ResellerPricingQuery setUnpriced( Boolean unpriced )
    {
        put( UNPRICED, unpriced );
        return this;
    }
}
