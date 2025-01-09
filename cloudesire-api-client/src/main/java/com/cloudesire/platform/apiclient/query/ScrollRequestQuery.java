package com.cloudesire.platform.apiclient.query;

import java.util.Map;

public class ScrollRequestQuery extends BaseQuery
{
    public ScrollRequestQuery( Map<String, ?> m )
    {
        super( m );
    }

    public ScrollRequestQuery()
    {
    }

    public ScrollRequestQuery( int offset, int limit )
    {
        setOffset( offset );
        setLimit( limit );
    }

    public ScrollRequestQuery setOffset( long offset )
    {
        put( "offset", offset );
        return this;
    }

    public ScrollRequestQuery setLimit( long limit )
    {
        put( "limit", limit );
        return this;
    }

}
