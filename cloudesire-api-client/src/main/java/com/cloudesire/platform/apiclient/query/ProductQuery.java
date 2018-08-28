package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.ProductType;

public class ProductQuery extends BaseQuery
{
    public ProductQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
    public ProductQuery setName( String name )
    {
        put( "name", name );
        return this;
    }

    public ProductQuery setReseller( String reseller )
    {
        put( "reseller", reseller );
        return this;
    }

    public ProductQuery setProductType( ProductType productType )
    {
        put( "productType", productType.toString() );
        return this;
    }

    public ProductQuery setOwnCompany( Boolean ownCompany )
    {
        put( "ownCompany", ownCompany.toString() );
        return this;
    }
}
