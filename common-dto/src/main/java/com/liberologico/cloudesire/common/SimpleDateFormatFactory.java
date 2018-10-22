package com.liberologico.cloudesire.common;

import java.text.SimpleDateFormat;

public class SimpleDateFormatFactory
{
    public static SimpleDateFormat dateFormat()
    {
        return new SimpleDateFormat( DateFormats.DATE_PATTERN );
    }

    public static SimpleDateFormat dateTimeFormat()
    {
        return new SimpleDateFormat( DateFormats.DATE_TIME_PATTERN );
    }

    public static SimpleDateFormat iso8601Format()
    {
        return new SimpleDateFormat( DateFormats.ISO8601_PATTERN );
    }

    private SimpleDateFormatFactory()
    {
    }
}
