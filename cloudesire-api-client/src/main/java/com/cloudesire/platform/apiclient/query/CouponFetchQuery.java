package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.date.ISO8601Date;
import com.liberologico.cloudesire.cmw.model.enums.CouponType;

public class CouponFetchQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String PRODUCT = "product";
    private static final String CREATED_AFTER = "createdAfter";
    private static final String UNUSED = "unused";
    private static final String REUSABLE = "reusable";

    public CouponFetchQuery setType( CouponType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public CouponFetchQuery setProduct( Integer product )
    {
        put( PRODUCT, product );
        return this;
    }

    public CouponFetchQuery setCreatedAfter( ISO8601Date creation )
    {
        put( CREATED_AFTER, creation );
        return this;
    }

    public CouponFetchQuery setUnused( Boolean unused )
    {
        put( UNUSED, unused );
        return this;
    }

    public CouponFetchQuery setReusable( Boolean reusable )
    {
        put( REUSABLE, reusable );
        return this;
    }
}
