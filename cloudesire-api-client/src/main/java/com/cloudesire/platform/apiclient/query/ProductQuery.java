package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.OrderingType;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;

public class ProductQuery extends PageRequestQuery
{
    private static final String NAME = "name";
    private static final String RESELLER = "reseller";
    private static final String PRODUCT_TYPE = "productType";
    private static final String OWN_COMPANY = "ownCompany";
    private static final String NAME_FILTER = "nameFilter";
    private static final String CATEGORY_ID = "categoryId";
    private static final String ORDERING_TYPE = "orderingType";
    private static final String DISTRIBUTOR = "distributor";
    private static final String COMPANY = "company";
    private static final String TAG = "tag";
    private static final String ONLY_ACTIVE_CONFIGURATIONS = "onlyActiveConfigurations";

    public ProductQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ProductQuery setName( String value )
    {
        put( NAME, value );
        return this;
    }

    public ProductQuery setReseller( String value )
    {
        put( RESELLER, value );
        return this;
    }

    public ProductQuery setProductType( ProductType value )
    {
        put( PRODUCT_TYPE, value );
        return this;
    }

    public ProductQuery setOwnCompany( Boolean value )
    {
        put( OWN_COMPANY, value );
        return this;
    }

    public ProductQuery setNameFilter( String value )
    {
        put( NAME_FILTER, value );
        return this;
    }

    public ProductQuery setCategoryId( Integer value )
    {
        put( CATEGORY_ID, value );
        return this;
    }

    public ProductQuery setOrderingType( OrderingType value )
    {
        put( ORDERING_TYPE, value );
        return this;
    }

    public ProductQuery setDistributor( String value )
    {
        put( DISTRIBUTOR, value );
        return this;
    }

    public ProductQuery setCompany( int value )
    {
        put( COMPANY, value );
        return this;
    }

    public ProductQuery setTag( String value )
    {
        put( TAG, value );
        return this;
    }

    public ProductQuery setOnlyActiveConfigurations( Boolean value )
    {
        put( ONLY_ACTIVE_CONFIGURATIONS, value );
        return this;
    }
}
