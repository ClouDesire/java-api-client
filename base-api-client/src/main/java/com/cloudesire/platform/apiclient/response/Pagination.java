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

    public Integer getPageSize()
    {
        return extractFirst( headers.get( Headers.PAGE_SIZE ) );
    }

    public Integer getPageNumber()
    {
        return extractFirst( headers.get( Headers.PAGE_NUMBER ) );
    }

    public Integer getTotalItems()
    {
        return extractFirst( headers.get( Headers.TOTAL_ITEMS ) );
    }

    public Integer getTotalPages()
    {
        return extractFirst( headers.get( Headers.TOTAL_PAGES ) );
    }

    private Integer extractFirst( List<String> values )
    {
        if ( values == null || values.size() != 1 ) return null;

        return Integer.valueOf( values.get( 0 ) );
    }
}
