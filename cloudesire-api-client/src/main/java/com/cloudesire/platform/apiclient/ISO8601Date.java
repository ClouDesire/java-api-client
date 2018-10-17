package com.cloudesire.platform.apiclient;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.liberologico.cloudesire.common.DateFormats.DATE_PATTERN;

public final class ISO8601Date extends DateFormatter
{
    public ISO8601Date( Date date )
    {
        super( date );
    }

    @Override
    public SimpleDateFormat getDateFormat()
    {
        return new SimpleDateFormat( DATE_PATTERN );
    }
}
