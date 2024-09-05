package com.cloudesire.platform.apiclient.query;

public class SearchQuery extends BaseQuery
{
    private static final String SEARCH = "search";

    public SearchQuery( String search )
    {
        put( SEARCH, search );
    }
}
