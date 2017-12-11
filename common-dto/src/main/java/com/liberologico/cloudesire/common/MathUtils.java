package com.liberologico.cloudesire.common;

import java.math.BigDecimal;

public final class MathUtils
{
    public static final BigDecimal ONE_HUNDRED = new BigDecimal( 100 );

    public static BigDecimal addPercentage( BigDecimal base, BigDecimal pct )
    {
        if ( base == null ) return BigDecimal.ZERO;

        return base.add( percentage( base, pct, MathConfiguration.DEFAULT_PRECISION ) );
    }

    public static BigDecimal subtractPercentage( BigDecimal base, BigDecimal pct )
    {
        if ( base == null ) return BigDecimal.ZERO;

        return base.subtract( percentage( base, pct ) );
    }

    public static BigDecimal percentage( BigDecimal base, BigDecimal pct )
    {
        return percentage( base, pct, MathConfiguration.COMPUTATION_PRECISION );
    }

    public static BigDecimal percentage( BigDecimal base, BigDecimal pct, int scale )
    {
        if ( base == null || pct == null ) return BigDecimal.ZERO;

        return base.multiply( pct ).divide( ONE_HUNDRED, scale, MathConfiguration.ROUNDING_MODE );
    }

    public static BigDecimal percentage( BigDecimal base, String pct )
    {
        return percentage( base, new BigDecimal( pct ) );
    }

    public static String plainPrint( BigDecimal number )
    {
        if ( number == null ) return "0";

        return number.stripTrailingZeros().toPlainString();
    }

    public static String plainPrint( BigDecimal number, String suffix )
    {
        return plainPrint( number ) + suffix;
    }

    public static boolean isValidPercentage( BigDecimal percentage )
    {
        return percentage.compareTo( BigDecimal.ZERO ) >= 0 && percentage.compareTo( ONE_HUNDRED ) <= 0;
    }

    public static BigDecimal zeroIfNull( BigDecimal number )
    {
        if ( number == null ) return BigDecimal.ZERO;

        return number;
    }

    public static boolean isNullOrZero( BigDecimal number )
    {
        return number == null || isZero( number );
    }

    public static boolean isZero( BigDecimal number )
    {
        return BigDecimal.ZERO.compareTo( number ) == 0;
    }

    public static boolean isNotZero( BigDecimal number )
    {
        return ! isZero( number );
    }

    private MathUtils() {}
}
