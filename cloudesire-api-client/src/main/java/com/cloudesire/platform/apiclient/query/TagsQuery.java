package com.cloudesire.platform.apiclient.query;

import java.util.Map;

public class TagsQuery extends BaseQuery
{
    private static final String TAGS = "tags";

    public TagsQuery setTags( Map<String, String> tags )
    {
        putMap( TAGS, tags );
        return this;
    }
}
