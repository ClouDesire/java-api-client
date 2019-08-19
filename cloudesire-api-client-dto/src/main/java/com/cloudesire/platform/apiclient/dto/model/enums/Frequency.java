package com.cloudesire.platform.apiclient.dto.model.enums;

public enum Frequency
{
    EVERY_30_SECONDS( 30 ),
    EVERY_1_MINUTE( 60 ),
    EVERY_2_MINUTE( 120 ),
    EVERY_5_MINUTES( 300 ),
    EVERY_30_MINUTES( 1800 ),
    EVERY_1_HOUR( 3600 ),
    EVERY_24_HOUR( 86400 ),
    EVERY_48_HOUR( 86400 * 2 ),
    EVERY_WEEK( 86400 * 7 );

    private int samplePeriodInSeconds;

    public static Frequency getByPeriod( int period )
    {
        for ( Frequency type : Frequency.values() )
        {
            if ( type.samplePeriodInSeconds == period ) return type;
        }

        throw new IllegalArgumentException( "Invalid sample period: " + period );
    }

    Frequency( int samplePeriodInSeconds )
    {
        this.samplePeriodInSeconds = samplePeriodInSeconds;
    }

    public int getSamplePeriodInSeconds()
    {
        return samplePeriodInSeconds;
    }
}
