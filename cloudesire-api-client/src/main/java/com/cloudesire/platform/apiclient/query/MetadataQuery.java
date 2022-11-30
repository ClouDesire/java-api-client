package com.cloudesire.platform.apiclient.query;

import java.util.Map;

public class MetadataQuery extends BaseQuery
{
    private static final String METADATA = "metadata";

    public MetadataQuery setMetadata( Map<String, String> metadata )
    {
        putMap( METADATA, metadata );
        return this;
    }
}
