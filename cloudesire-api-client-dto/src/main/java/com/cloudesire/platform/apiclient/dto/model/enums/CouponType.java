package com.cloudesire.platform.apiclient.dto.model.enums;

public enum CouponType
{
    BUNDLE( "bundle" ),
    DISCOUNT( "discount" ),
    EXTENDED_TRIAL( "extendedTrial" ),
    FIXED_PRICE( "fixedPrice" ),
    DISCOUNT_GENERATOR( "discountGenerator" ),
    FIXED_PRICE_GENERATOR( "fixedPriceGenerator" );

    private final String toString;

    CouponType( String toString )
    {
        this.toString = toString;
    }

    @Override
    public String toString()
    {
        return toString;
    }
}
