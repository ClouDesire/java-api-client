package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import org.apache.commons.lang3.StringUtils;

public class SubscriptionQuery extends PageRequestQuery
{
    private static final String FILTER = "filter";
    private static final String STATUS = "status";
    private static final String TYPE = "type";
    private static final String PRODUCT = "product";
    private static final String PRODUCT_TYPE = "productType";

    public SubscriptionQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public SubscriptionQuery setMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

    public SubscriptionQuery setFilter( String value )
    {
        put( FILTER, value );
        return this;
    }

    public SubscriptionQuery setStatus( DeploymentStatus... values )
    {
        String value = StringUtils.join( values, ',' );
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

    public SubscriptionQuery setProductType( ProductType value )
    {
        put( PRODUCT_TYPE, value );
        return this;
    }
}
