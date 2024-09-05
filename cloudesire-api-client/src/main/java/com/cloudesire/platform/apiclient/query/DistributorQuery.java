package com.cloudesire.platform.apiclient.query;

public class DistributorQuery extends BaseQuery
{
    private static final String ENABLED = "enabled";

    public DistributorQuery enabled( boolean enabled )
    {
        put( ENABLED, enabled );
        return this;
    }

    public DistributorQuery search( SearchQuery search )
    {
        putAll( search );
        return this;
    }

    public DistributorQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
