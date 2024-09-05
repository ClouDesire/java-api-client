package com.cloudesire.platform.apiclient.query;

public class ResellerQuery extends BaseQuery
{
    private static final String ENABLED = "enabled";
    private static final String DISTRIBUTOR_ID = "distributorId";

    public ResellerQuery enabled( boolean enabled )
    {
        put( ENABLED, enabled );
        return this;
    }

    public ResellerQuery distributorId( int distributorId )
    {
        put( DISTRIBUTOR_ID, distributorId );
        return this;
    }

    public ResellerQuery search( SearchQuery search )
    {
        putAll( search );
        return this;
    }

    public ResellerQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
