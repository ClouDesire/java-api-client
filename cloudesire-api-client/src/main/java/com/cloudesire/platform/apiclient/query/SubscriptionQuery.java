package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatusEnum;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

public class SubscriptionQuery extends PageRequestQuery
{
    private static final String FILTER = "filter";
    private static final String STATUS = "status";
    private static final String TYPE = "type";
    private static final String PRODUCT = "product";


    public SubscriptionQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public SubscriptionQuery setFilter( String value )
    {
        put( FILTER, value );
        return this;
    }

    public SubscriptionQuery setStatus( DeploymentStatusEnum value )
    {
        put( STATUS, value );
        return this;
    }

    public SubscriptionQuery setType( OrderType value )
    {
        put( TYPE, value );
        return this;
    }

    public SubscriptionQuery setProduct( Integer value )
    {
        put( PRODUCT, value );
        return this;
    }
}
