package com.cloudesire.platform.apiclient.date;

import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ISO8601DateTime extends DateFormatter
{
    public ISO8601DateTime( Date date )
    {
        super( date );
    }

    @Override
    public SimpleDateFormat getDateFormat()
    {
        return SimpleDateFormatFactory.dateTimeFormat();
    }
}
