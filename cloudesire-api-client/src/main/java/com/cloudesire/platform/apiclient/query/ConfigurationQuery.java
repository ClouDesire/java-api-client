package com.cloudesire.platform.apiclient.query;

import java.util.Collections;
import java.util.Map;

public class ConfigurationQuery extends BaseQuery
{
    private static final String CONFIGURATION = "configuration";

    public ConfigurationQuery( String key, String value )
    {
        setConfiguration( Collections.singletonMap( key, value ) );
    }

    public ConfigurationQuery setConfiguration( Map<String, String> configuration )
    {
        configuration.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", CONFIGURATION, key ), value );
        } );
        return this;
    }
}
