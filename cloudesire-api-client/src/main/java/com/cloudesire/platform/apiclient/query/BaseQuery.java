package com.cloudesire.platform.apiclient.query;

import java.util.HashMap;

abstract class BaseQuery extends HashMap<String, Object>
{
    @Override
    public Object put( String key, Object value )
    {
        if ( value == null ) return super.remove( key );
        return super.put( key, value );
    }
}
