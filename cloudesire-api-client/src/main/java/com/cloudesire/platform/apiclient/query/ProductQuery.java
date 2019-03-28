package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;

public class ProductQuery extends BaseQuery
{
    private static final String NAME = "name";
    private static final String DISTRIBUTOR = "distributor";
    private static final String RESELLER = "reseller";
    private static final String PRODUCT_TYPE = "productType";
    private static final String OWN_COMPANY = "ownCompany";
    private static final String CATALOG_ID = "catalogId";
    private static final String COMPANY = "company";
    private static final String FEATURED = "featured";

    public ProductQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ProductQuery setName( String name )
    {
        put( NAME, name );
        return this;
    }

    public ProductQuery setDistributor( String distributor )
    {
        put( DISTRIBUTOR, distributor );
        return this;
    }

    public ProductQuery setReseller( String reseller )
    {
        put( RESELLER, reseller );
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

    public ProductQuery setCatalogId( Integer catalogId )
    {
        put( CATALOG_ID, catalogId );
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

}
