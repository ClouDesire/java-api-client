package com.cloudesire.platform.apiclient.response;

import java.util.List;
import java.util.Map;

public class CallResponse<T>
{
    private final Map<String, List<String>> headers;
    private final T body;
    private final Pagination paginator;

    public CallResponse( T body, Map<String, List<String>> headers )
    {
        this.body = body;
        this.headers = headers;
        this.paginator = new Pagination( headers );
    }

    public T getBody()
    {
        return body;
    }

    public String getHeader( String name )
    {
        List<String> values = headers.get( name );
        if ( values == null ) return null;
        if ( values.size() == 1 ) return values.get( 0 );
        throw new IllegalArgumentException( "Multiple values" );
    }

    public Map<String, List<String>> getAllHeaders()
    {
        return headers;
    }

    public Pagination paginator()
    {
        return paginator;
    }
}
