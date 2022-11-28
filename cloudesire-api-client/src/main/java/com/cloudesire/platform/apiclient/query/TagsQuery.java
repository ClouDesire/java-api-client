package com.cloudesire.platform.apiclient.query;

import java.util.Map;

public class TagsQuery extends BaseQuery
{
    private static final String TAGS = "tags";

    public TagsQuery setTags( Map<String, String> tags )
    {
        tags.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", TAGS, key ), value );
        } );
        return this;
    }
}
