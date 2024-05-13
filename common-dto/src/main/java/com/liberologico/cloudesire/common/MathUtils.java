package com.liberologico.cloudesire.common;

import java.math.BigDecimal;

import static com.liberologico.cloudesire.common.MathConfiguration.computationMathContext;

public final class MathUtils
{
    public static final BigDecimal ONE_HUNDRED = new BigDecimal( 100 );

    public static BigDecimal addPercentage( BigDecimal base, BigDecimal pct )
    {
        if ( base == null ) return BigDecimal.ZERO;

        return base.add( percentage( base, pct, MathConfiguration.COMPUTATION_PRECISION ) );
    }

    public static boolean isBetween( BigDecimal number, int min, int max )
    {
        return isBetween( number, new BigDecimal( min ), new BigDecimal( max ) );
    }

    public static boolean isBetween( BigDecimal number, BigDecimal min, BigDecimal max )
    {
        return min.compareTo( number ) <= 0 && number.compareTo( max ) <= 0;
    }

    public static BigDecimal subtractPercentage( BigDecimal base, BigDecimal pct )
    {
        if ( base == null ) return BigDecimal.ZERO;

        return base.subtract( percentage( base, pct, MathConfiguration.COMPUTATION_PRECISION ) );
    }

    public static BigDecimal revertPercentage( BigDecimal number, BigDecimal pct )
    {
        if ( number == null ) return BigDecimal.ZERO;

        return number.multiply( ONE_HUNDRED ).divide( ONE_HUNDRED.add( pct ), computationMathContext() );
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
        return equalsByComparing( number, BigDecimal.ZERO );
    }

    public static boolean isNotZero( BigDecimal number )
    {
        return ! isZero( number );
    }

    public static boolean allZeroes( BigDecimal... numbers )
    {
        for ( BigDecimal number : numbers )
        {
            if ( isNotZero( number ) ) return false;
        }

        return true;
    }

    public static boolean isPositive( BigDecimal number )
    {
        return number != null && number.signum() > 0;
    }

    public static BigDecimal parseFloat( Float amount )
    {
        return setScale( BigDecimal.valueOf( amount ), MathConfiguration.DEFAULT_PRECISION );
    }

    public static String parseLongToString( Long amount )
    {
        return BigDecimal.valueOf( amount )
                .divide( ONE_HUNDRED, MathConfiguration.DEFAULT_PRECISION, MathConfiguration.ROUNDING_MODE )
                .toPlainString();
    }

    public static BigDecimal setScale( BigDecimal number, int scale )
    {
        return number.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }

    public static BigDecimal bytesToGigabytes( BigDecimal bytes )
    {
        BigDecimal rescale = new BigDecimal( 1073741824 );  // rescale to GB, 1024 * 1024 * 1024
        return bytes.divide( rescale, computationMathContext() );
    }

    public static boolean equalsByComparing( BigDecimal a, long b )
    {
        return equalsByComparing( a, new BigDecimal( b ) );
    }

    public static boolean equalsByComparing( BigDecimal a, String b )
    {
        return equalsByComparing( a, new BigDecimal( b ) );
    }

    public static boolean equalsByComparing( int a, BigDecimal b )
    {
        return equalsByComparing( new BigDecimal( a ), b );
    }

    public static boolean equalsByComparing( BigDecimal a, BigDecimal b )
    {
        if ( a == null ) return b == null;
        if ( b == null ) return false;
        return a.compareTo( b ) == 0;
    }

    private MathUtils() {}
}
