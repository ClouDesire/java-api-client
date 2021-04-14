package com.cloudesire.platform.apiclient.query;

import java.util.Map;

public class MetadataQuery extends BaseQuery
{
    private static final String METADATA = "metadata";

    public MetadataQuery setMetadata( Map<String, String> metadata )
    {
        metadata.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", METADATA, key ), value );
        } );
        return this;
    }
}
