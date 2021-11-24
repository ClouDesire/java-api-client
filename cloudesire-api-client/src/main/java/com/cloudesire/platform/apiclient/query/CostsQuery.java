package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class CostsQuery extends BaseQuery
{
    private static final String FROM = "from";
    private static final String TO = "to";
    private static final String SUBSCRIPTION_ID = "subscriptionId";

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

    public CostsQuery setMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

}
