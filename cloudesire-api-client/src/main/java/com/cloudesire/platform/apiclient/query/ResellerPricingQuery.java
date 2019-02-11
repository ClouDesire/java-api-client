package com.cloudesire.platform.apiclient.query;

public class ResellerPricingQuery extends BaseQuery
{
    private static final String resellerId = "resellerId";
    private static final String catalogId = "catalogId";
    private static final String productId = "productId";
    private static final String unpriced = "unpriced";

    public ResellerPricingQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ResellerPricingQuery setResellerId( Integer name )
    {
        put( resellerId, name );
        return this;
    }

    public ResellerPricingQuery setCatalogId( Integer name )
    {
        put( catalogId, name );
        return this;
    }

    public ResellerPricingQuery setProductId( Integer name )
    {
        put( productId, name );
        return this;
    }

    public ResellerPricingQuery setUnpriced( Boolean name )
    {
        put( unpriced, name );
        return this;
    }
}
