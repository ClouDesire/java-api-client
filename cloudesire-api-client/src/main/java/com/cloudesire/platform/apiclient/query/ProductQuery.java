package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderingType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;

public class ProductQuery extends PageRequestQuery
{
    private static final String NAME = "name";
    private static final String NAMEFILTER = "nameFilter";
    private static final String DISTRIBUTOR = "distributor";
    private static final String PRODUCT_TYPE = "productType";
    private static final String OWN_COMPANY = "ownCompany";
    private static final String COMPANY = "company";
    private static final String FEATURED = "featured";
    private static final String ONLY_ACTIVE_CONFIGURATIONS = "onlyActiveConfigurations";
    private static final String ORDERING_TYPE = "orderingType";
    private static final String CATEGORY_ID = "categoryId";
    private static final String TAG = "tag";

    public ProductQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ProductQuery setResellerCatalog( ResellerCatalogQuery resellerCatalogQuery )
    {
        putAll( resellerCatalogQuery );
        return this;
    }

    public ProductQuery setName( String name )
    {
        put( NAME, name );
        return this;
    }

    /**
     * @deprecated use {@link #setName(String)}
     */
    @Deprecated
    public ProductQuery setNameFilter( String name )
    {
        put( NAMEFILTER, name );
        return this;
    }

    public ProductQuery setDistributor( String distributor )
    {
        put( DISTRIBUTOR, distributor );
        return this;
    }

    public ProductQuery setProductType( ProductType productType )
    {
        put( PRODUCT_TYPE, productType );
        return this;
    }

    public ProductQuery setOwnCompany( Boolean ownCompany )
    {
        put( OWN_COMPANY, ownCompany );
        return this;
    }

    public ProductQuery setCompany( int companyId )
    {
        put( COMPANY, companyId );
        return this;
    }

    public ProductQuery setFeatured( boolean featured )
    {
        put( FEATURED, featured );
        return this;
    }

    public ProductQuery setOrderingType( OrderingType type )
    {
        put( ORDERING_TYPE, type );
        return this;
    }

    public ProductQuery setCategoryId( int categoryId )
    {
        put( CATEGORY_ID, categoryId );
        return this;
    }

    public ProductQuery setTag( String tag )
    {
        put( TAG, tag );
        return this;
    }

    public ProductQuery setOnlyActiveConfigurations( boolean flag )
    {
        put( ONLY_ACTIVE_CONFIGURATIONS, flag );
        return this;
    }
}
