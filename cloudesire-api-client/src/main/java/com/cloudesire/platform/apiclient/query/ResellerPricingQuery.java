package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellerPricingHierarchy;
import com.cloudesire.platform.apiclient.dto.model.enums.ResellerPricingListing;
import org.apache.commons.lang3.StringUtils;

public class ResellerPricingQuery extends BaseQuery
{
    private static final String RESELLER_ID = "resellerId";
    private static final String CATALOG_ID = "catalogId";
    private static final String SEARCH = "search";
    private static final String PRODUCT_ID = "productId";
    private static final String PRODUCT_VERSION_ID = "productVersionId";
    private static final String UNPRICED = "unpriced";
    private static final String HIERARCHY = "hierarchy";
    private static final String LISTING = "listing";

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

    public ResellerPricingQuery setSearch( String search )
    {
        put( SEARCH, search );
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

    public ResellerPricingQuery setHierarchy( ResellerPricingHierarchy hierarchy )
    {
        put( HIERARCHY, hierarchy );
        return this;
    }

    public ResellerPricingQuery setListing( ResellerPricingListing... listing )
    {
        put( LISTING, StringUtils.join( listing, ',' ) );
        return this;
    }
}
