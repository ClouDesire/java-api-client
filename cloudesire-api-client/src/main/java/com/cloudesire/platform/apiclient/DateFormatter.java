package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class DateFormatter
{
    protected final Date date;

    DateFormatter( Date date )
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return getDateFormat().format( date );
    }

    public abstract SimpleDateFormat getDateFormat();
}
