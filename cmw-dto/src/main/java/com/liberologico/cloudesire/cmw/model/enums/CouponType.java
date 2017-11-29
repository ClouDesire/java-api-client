package com.liberologico.cloudesire.cmw.model.enums;

public enum CouponType
{
    BUNDLE( "bundle" ),
    DISCOUNT( "discount" ),
    EXTENDED_TRIAL( "extendedTrial" ),
    FIXED_PRICE( "fixedPrice" );

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
