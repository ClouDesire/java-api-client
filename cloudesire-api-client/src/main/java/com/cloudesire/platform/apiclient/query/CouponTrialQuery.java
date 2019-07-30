package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.date.ISO8601DateTime;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponType;

import java.math.BigDecimal;

public class CouponTrialQuery extends BaseQuery
{
    private static final String TYPE = "type";
    private static final String PRODUCT_VERSION = "productVersion";
    private static final String PRODUCT = "product";
    private static final String EXPIRATION_DATE = "expirationDate";
    private static final String DAYS = "days";
    private static final String PLAFOND = "plafond";

    public CouponTrialQuery()
    {
        put( TYPE, CouponType.TRIAL.toString() );
    }

    public CouponTrialQuery setProductVersion( Integer productVersion )
    {
        put( PRODUCT_VERSION, productVersion );
        return this;
    }

    public CouponTrialQuery setProduct( Integer product )
    {
        put( PRODUCT, product );
        return this;
    }

    public CouponTrialQuery setExpiration( ISO8601DateTime expiration )
    {
        put( EXPIRATION_DATE, expiration );
        return this;
    }

    public CouponTrialQuery setDays( Integer days )
    {
        put( DAYS, days );
        return this;
    }

    public CouponTrialQuery setPlafond( BigDecimal number )
    {
        put( PLAFOND, number );
        return this;
    }

}
