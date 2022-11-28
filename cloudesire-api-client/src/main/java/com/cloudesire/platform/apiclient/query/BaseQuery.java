package com.cloudesire.platform.apiclient.query;

import java.util.HashMap;
import java.util.Map;

abstract class BaseQuery extends HashMap<String, Object>
{
    protected BaseQuery( Map<String, ?> m )
    {
        super( m );
    }

    protected BaseQuery()
    {
    }

    @Override
    public Object put( String key, Object value )
    {
        if ( value == null ) return super.remove( key );
        return super.put( key, value );
    }

    void putMap( String parameter, Map<String, String> map )
    {
        map.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", parameter, key ), value );
        } );
    }
}
