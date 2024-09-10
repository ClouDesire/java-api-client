package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class OrderQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String STATUS = "status";
    private static final String SUBSCRIPTION_ID = "subscriptionId";
    private static final String COUPON = "coupon";
    private static final String FROM = "from";
    private static final String TO = "to";

    public OrderQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public OrderQuery setSearch( SearchQuery searchQuery )
    {
        putAll( searchQuery );
        return this;
    }

    public OrderQuery setType( OrderType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public OrderQuery setStatus( OrderStatus status )
    {
        put( STATUS, status.toString() );
        return this;
    }

    public OrderQuery setSubscriptionId( int subscriptionId )
    {
        put( SUBSCRIPTION_ID, subscriptionId );
        return this;
    }

    /**
     * @deprecated by {@link #setSearch(SearchQuery)}
     */
    @Deprecated( since = "20240905", forRemoval = true )
    public OrderQuery setTextField( String textField )
    {
        return setSearch( new SearchQuery( textField ) );
    }

    public OrderQuery setCoupon( boolean coupon )
    {
        put( COUPON, coupon );
        return this;
    }

    public OrderQuery setFrom( Date from )
    {
        put( FROM, SimpleDateFormatFactory.iso8601Format().format( from ) );
        return this;
    }

    public OrderQuery setTo( Date to )
    {
        put( TO, SimpleDateFormatFactory.iso8601Format().format( to ) );
        return this;
    }

    public OrderQuery setMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

    public OrderQuery setConfiguration( ConfigurationQuery configuration )
    {
        putAll( configuration );
        return this;
    }

}
