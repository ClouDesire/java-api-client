package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class CostsQuery extends BaseQuery
{
    private static final String FROM = "from";
    private static final String TO = "to";
    private static final String SUBSCRIPTION_ID = "subscriptionId";
    private static final String LANGUAGE = "language";

    public CostsQuery from( Date from )
    {
        put( FROM, SimpleDateFormatFactory.iso8601Format().format( from ) );
        return this;
    }

    public CostsQuery to( Date to )
    {
        put( TO, SimpleDateFormatFactory.iso8601Format().format( to ) );
        return this;
    }

    public CostsQuery subscriptionId( int subscriptionId )
    {
        put( SUBSCRIPTION_ID, subscriptionId );
        return this;
    }

    public CostsQuery language( String language )
    {
        put( LANGUAGE, language );
        return this;
    }

    public CostsQuery subscriptionMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

    public CostsQuery tags( TagsQuery tags )
    {
        putAll( tags );
        return this;
    }

}
