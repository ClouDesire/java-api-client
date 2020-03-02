package com.cloudesire.platform.apiclient.query;

import java.util.HashMap;
import java.util.Map;

abstract class BaseQuery extends HashMap<String, Object>
{
    public BaseQuery( Map<? extends String, ?> m )
    {
        super( m );
    }

    public BaseQuery()
    {
    }

    @Override
    public Object put( String key, Object value )
    {
        if ( value == null ) return super.remove( key );
        return super.put( key, value );
    }
}
