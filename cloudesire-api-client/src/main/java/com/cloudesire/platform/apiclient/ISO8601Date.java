package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ISO8601Date
{
    private final Date date;

    public ISO8601Date( Date date )
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        final SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
        return dateFormat.format( date );
    }

    public Date getDate()
    {
        return date;
    }
}
