package com.cloudesire.platform.apiclient.response;

import java.util.List;
import java.util.Map;

public class CallResponse<T>
{
    private final int code;
    private final Map<String, List<String>> headers;
    private final T body;
    private final Pagination paginator;

    public CallResponse( int code, T body, Map<String, List<String>> headers )
    {
        this.code = code;
        this.body = body;
        this.headers = headers;
        this.paginator = new Pagination( headers );
    }

    public int getCode()
    {
        return code;
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
