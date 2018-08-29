package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.ISO8601DateTime;
import com.liberologico.cloudesire.cmw.model.enums.CouponDestination;

import java.math.BigDecimal;

public class CouponQuery extends BaseQuery
{
    private static final String TYPE = "type";
    private static final String PRODUCT_VERSION = "productVersion";
    private static final String PRODUCT = "product";
    private static final String EXPIRATION_DATE = "expirationDate";
    private static final String DESTINATION = "destination";
    private static final String NUMBER = "number";
    private static final String HOW_MANY = "howMany";

    public CouponQuery setType( String type )
    {
        put( TYPE, type );
        return this;
    }

    public CouponQuery setProductVersion( Integer productVersion )
    {
        put( PRODUCT_VERSION, productVersion.toString() );
        return this;
    }

    public CouponQuery setProduct( Integer product )
    {
        put( PRODUCT, product.toString() );
        return this;
    }

    public CouponQuery setExpiration( ISO8601DateTime expiration )
    {
        put( EXPIRATION_DATE, expiration.toString() );
        return this;
    }

    public CouponQuery setDestination( CouponDestination destination )
    {
        put( DESTINATION, destination.toString() );
        return this;
    }

    public CouponQuery setNumber( BigDecimal number )
    {
        put( NUMBER, number.toString() );
        return this;
    }

    public CouponQuery setHowMany( Integer howMany )
    {
        put( HOW_MANY, howMany.toString() );
        return this;
    }

}
