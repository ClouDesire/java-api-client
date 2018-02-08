package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWrapper
{
    private final Date date;

    public DateWrapper( Date date )
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        final SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd hh:mm" );
        return dateFormat.format( date );
    }
}
