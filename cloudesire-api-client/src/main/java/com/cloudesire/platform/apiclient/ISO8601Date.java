package com.cloudesire.platform.apiclient;

import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ISO8601Date extends DateFormatter
{
    public ISO8601Date( Date date )
    {
        super( date );
    }

    @Override
    public SimpleDateFormat getDateFormat()
    {
        return SimpleDateFormatFactory.dateFormat();
    }
}
