package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.date.ISO8601DateTime;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponType;

import java.math.BigDecimal;

public class CouponQuery extends BaseQuery
{
    private static final String TYPE = "type";
    private static final String PRODUCT_VERSION = "productVersion";
    private static final String PRODUCT = "product";
    private static final String EXPIRATION_DATE = "expirationDate";
    private static final String DESTINATION = "destination";
    private static final String VALUE = "value";
    private static final String NUMBER = "number";
    private static final String HOW_MANY = "howMany";

    public CouponQuery setType( CouponType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public CouponQuery setProductVersion( Integer productVersion )
    {
        put( PRODUCT_VERSION, productVersion );
        return this;
    }

    public CouponQuery setProduct( Integer product )
    {
        put( PRODUCT, product );
        return this;
    }

    public CouponQuery setExpiration( ISO8601DateTime expiration )
    {
        put( EXPIRATION_DATE, expiration );
        return this;
    }

    public CouponQuery setDestination( CouponDestination destination )
    {
        put( DESTINATION, destination );
        return this;
    }

    public CouponQuery setValue( BigDecimal value )
    {
        put( VALUE, value );
        return this;
    }

    /**
     * @deprecated by {@link #setValue(BigDecimal)}
     */
    @Deprecated
    public CouponQuery setNumber( BigDecimal number )
    {
        put( NUMBER, number );
        return this;
    }

    public CouponQuery setHowMany( Integer howMany )
    {
        put( HOW_MANY, howMany );
        return this;
    }

}
