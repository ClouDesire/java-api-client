package com.cloudesire.platform.apiclient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.EnumMap;
import java.util.Map;
import java.util.TimeZone;

import static java.util.Collections.emptyMap;

public class ObjectMapperFactory
{
    public static ObjectMapper build( ObjectMapper mapper )
    {
        return build( mapper, emptyMap() );
    }

    public static ObjectMapper build( ObjectMapper mapper, Map<DeserializationFeature, Boolean> configuration )
    {
        return build( mapper, configuration, null );
    }

    public static ObjectMapper build( ObjectMapper mapper, Map<DeserializationFeature, Boolean> configuration,
            SimpleModule module )
    {
        configure( mapper, configuration, module );
        return mapper;
    }

    private static void configure( ObjectMapper mapper, Map<DeserializationFeature, Boolean> configuration, SimpleModule module )
    {
        for ( Map.Entry<SerializationFeature, Boolean> entry : defaultSerialization().entrySet() )
        {
            mapper.configure( entry.getKey(), entry.getValue() );
        }
        for ( Map.Entry<DeserializationFeature, Boolean> entry : defaultDeserialization().entrySet() )
        {
            mapper.configure( entry.getKey(), entry.getValue() );
        }
        for ( Map.Entry<DeserializationFeature, Boolean> entry : configuration.entrySet() )
        {
            mapper.configure( entry.getKey(), entry.getValue() );
        }

        mapper.setTimeZone( TimeZone.getTimeZone( "UTC" ) );

        if ( module != null) mapper.registerModule( module );
    }

    private static Map<SerializationFeature, Boolean> defaultSerialization()
    {
        Map<SerializationFeature, Boolean> map = new EnumMap<>( SerializationFeature.class );
        map.put( SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true );
        map.put( SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false );
        return map;
    }

    private static Map<DeserializationFeature, Boolean> defaultDeserialization()
    {
        Map<DeserializationFeature, Boolean> map = new EnumMap<>( DeserializationFeature.class );
        map.put( DeserializationFeature.READ_ENUMS_USING_TO_STRING, true );
        map.put( DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true );
        map.put( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
        return map;
    }

    private ObjectMapperFactory()
    {
    }
}
