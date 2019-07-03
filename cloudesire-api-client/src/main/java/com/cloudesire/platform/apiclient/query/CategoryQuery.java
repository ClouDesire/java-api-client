package com.cloudesire.platform.apiclient.query;

public class CategoryQuery extends PageRequestQuery
{
    private static final String MODE = "mode";
    private static final String DISTRIBUTOR = "distributor";
    private static final String RESELLER = "reseller";
    private static final String ONLY_ACTIVE_CONFIGURATIONS = "onlyActiveConfigurations";

    public CategoryQuery mode( String mode )
    {
        put( MODE, mode );
        return this;
    }

    public CategoryQuery distributor( String distributor )
    {
        put( DISTRIBUTOR, distributor );
        return this;
    }

    public CategoryQuery reseller( String reseller )
    {
        put( RESELLER, reseller );
        return this;
    }

    public CategoryQuery onlyActiveConfigurations( boolean onlyActiveConfigurations )
    {
        put( ONLY_ACTIVE_CONFIGURATIONS, onlyActiveConfigurations );
        return this;
    }

    public CategoryQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
