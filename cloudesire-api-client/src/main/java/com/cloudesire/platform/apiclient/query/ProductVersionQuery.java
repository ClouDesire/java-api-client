package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellerPricingVisibility;

public class ProductVersionQuery extends BaseQuery
{
    private static final String PRODUCT = "product";
    private static final String VISIBILITY = "visibility";
    private static final String WITH_UNPUBLISHED = "withUnpublished";

    public ProductVersionQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ProductVersionQuery setResellerCatalog( ResellerCatalogQuery resellerCatalogQuery )
    {
        putAll( resellerCatalogQuery );
        return this;
    }

    public ProductVersionQuery setProduct( int productId )
    {
        put( PRODUCT, productId );
        return this;
    }

    public ProductVersionQuery includeUnpublished( boolean includeUnpublished )
    {
        put( WITH_UNPUBLISHED, includeUnpublished );
        return this;
    }

    public ProductVersionQuery setVisibility( ResellerPricingVisibility visibility )
    {
        put( VISIBILITY, visibility );
        return this;
    }
}
