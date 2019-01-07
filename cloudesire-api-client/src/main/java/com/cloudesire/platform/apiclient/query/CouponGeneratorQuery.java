package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.date.ISO8601DateTime;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponType;

import java.math.BigDecimal;

public class CouponGeneratorQuery extends BaseQuery
{
    private static final String TYPE = "type";
    private static final String PRODUCT_VERSION = "productVersion";
    private static final String PRODUCT = "product";
    private static final String EXPIRATION = "expiration";
    private static final String DESTINATION = "destination";
    private static final String CODE = "code";
    private static final String VALUE = "value";
    private static final String REUSABLE = "reusable";

    public CouponGeneratorQuery setType( CouponType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public CouponGeneratorQuery setProductVersion( Integer productVersion )
    {
        put( PRODUCT_VERSION, productVersion );
        return this;
    }

    public CouponGeneratorQuery setProduct( Integer product )
    {
        put( PRODUCT, product );
        return this;
    }

    public CouponGeneratorQuery setExpiration( ISO8601DateTime expiration )
    {
        put( EXPIRATION, expiration );
        return this;
    }

    public CouponGeneratorQuery setDestination( CouponDestination destination )
    {
        put( DESTINATION, destination );
        return this;
    }

    public CouponGeneratorQuery setCode( String code )
    {
        put( CODE, code );
        return this;
    }

    public CouponGeneratorQuery setValue( BigDecimal value )
    {
        put( VALUE, value );
        return this;
    }

    public CouponGeneratorQuery setReusable( Boolean reusable )
    {
        put( REUSABLE, String.valueOf( reusable ) );
        return this;
    }

}
