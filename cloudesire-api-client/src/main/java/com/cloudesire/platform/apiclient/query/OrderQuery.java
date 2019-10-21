package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class OrderQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String BUYER_EMAIL = "buyerEmail";
    private static final String COUPON = "coupon";
    private static final String FROM = "from";
    private static final String TO = "to";

    public OrderQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public OrderQuery setType( OrderType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public OrderQuery setBuyerEmail( String buyerEmail )
    {
        put( BUYER_EMAIL, buyerEmail );
        return this;
    }

    public OrderQuery setCoupon( boolean coupon )
    {
        put( COUPON, coupon );
        return this;
    }

    public OrderQuery setFrom( Date from )
    {
        put( FROM, SimpleDateFormatFactory.dateFormat().format( from ) );
        return this;
    }

    public OrderQuery setTo( Date to )
    {
        put( TO, SimpleDateFormatFactory.dateFormat().format( to ) );
        return this;
    }
}
