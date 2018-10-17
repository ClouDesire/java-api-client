package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class ClientDate
{
    protected final Date date;

    ClientDate( Date date )
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        final SimpleDateFormat dateFormat = getDateFormat();
        return dateFormat.format( date );
    }

    public abstract SimpleDateFormat getDateFormat();

    public Date getDate()
    {
        return date;
    }
}
