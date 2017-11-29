package com.liberologico.cloudesire.common;

import java.util.UUID;

public class RandomStringUtils
{
    public static String randomToken( int maxLength )
    {
        if ( maxLength < 1 ) throw new IllegalArgumentException( "should be at least 1" );
        StringBuilder stringBuilder = new StringBuilder();
        do
        {
            stringBuilder.append( UUID.randomUUID().toString().replace( "-", "" ) );
        } while ( stringBuilder.length() < maxLength );
        return stringBuilder.substring( 0, maxLength );
    }

    private RandomStringUtils()
    {
    }
}
