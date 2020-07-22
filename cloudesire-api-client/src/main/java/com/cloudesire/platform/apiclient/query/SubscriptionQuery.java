package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatusEnum;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class SubscriptionQuery extends PageRequestQuery
{
    private static final String FILTER = "filter";
    private static final String METADATA = "metadata";
    private static final String STATUS = "status";
    private static final String TYPE = "type";
    private static final String PRODUCT = "product";
    private static final String PRODUCT_TYPE = "productType";


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

    public SubscriptionQuery setMetadata( Map<String, Object> metadata )
    {
        metadata.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", METADATA, key ), value );
        } );
        return this;
    }

    public SubscriptionQuery setStatus( DeploymentStatusEnum... values )
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
