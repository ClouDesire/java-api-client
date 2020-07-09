package com.liberologico.cloudesire.common;

import java.math.MathContext;
import java.math.RoundingMode;

public class MathConfiguration
{
    /**
     * BigDecimal output precision
     */
    public static final int DEFAULT_PRECISION = 2;

    /**
     * BigDecimal calculation precision
     */
    public static final int COMPUTATION_PRECISION = 6;

    /**
     * BigDecimal day scale precision
     */
    public static final int DAY_SCALE_PRECISION = 10;

    /**
     * BigDecimal rounding mode
     */
    public static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

    public static MathContext computationMathContext()
    {
        return new MathContext( COMPUTATION_PRECISION, ROUNDING_MODE );
    }

    public static MathContext dayScaleMathContext()
    {
        return new MathContext( DAY_SCALE_PRECISION, ROUNDING_MODE );
    }

    private MathConfiguration()
    {
    }
}
