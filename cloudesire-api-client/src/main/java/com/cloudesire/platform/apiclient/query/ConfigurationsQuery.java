package com.cloudesire.platform.apiclient.query;

import java.util.Collections;
import java.util.Map;

public class ConfigurationsQuery extends BaseQuery
{
    private static final String CONFIGURATIONS = "configurations";

    public ConfigurationsQuery( String key, String value )
    {
        setConfigurations( Collections.singletonMap( key, value ) );
    }

    public ConfigurationsQuery setConfigurations( Map<String, String> configurations )
    {
        configurations.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", CONFIGURATIONS, key ), value );
        } );
        return this;
    }
}
