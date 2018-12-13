package com.cloudesire.platform.apiclient.response;

import java.util.List;
import java.util.Map;

public class Pagination
{
    private final Map<String, List<String>> headers;

    Pagination( Map<String, List<String>> headers )
    {
        this.headers = headers;
    }

    public String getPageSize()
    {
        return extractFirst( headers.get( Headers.PAGE_SIZE ) );
    }

    public String getPageNumber()
    {
        return extractFirst( headers.get( Headers.PAGE_NUMBER ) );
    }

    public String getTotalItems()
    {
        return extractFirst( headers.get( Headers.TOTAL_ITEMS ) );
    }

    public String getTotalPages()
    {
        return extractFirst( headers.get( Headers.TOTAL_PAGES ) );
    }

    private String extractFirst( List<String> values )
    {
        if ( values != null && values.size() == 1 ) return values.get( 0 );
        return null;
    }
}
