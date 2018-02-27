package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ISO8601DateTime extends ISO8601Date
{
    public ISO8601DateTime( Date date )
    {
        super( date );
    }

    @Override
    public String toString()
    {
        final SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd hh:mm" );
        return dateFormat.format( getDate() );
    }
}
