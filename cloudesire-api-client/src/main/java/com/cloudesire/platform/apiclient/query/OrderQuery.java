package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;
import java.util.Map;

public class OrderQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String TEXT_FIELD = "textField";
    private static final String COUPON = "coupon";
    private static final String FROM = "from";
    private static final String TO = "to";
    private static final String METADATA = "metadata";

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

    public OrderQuery setTextField( String textField )
    {
        put( TEXT_FIELD, textField );
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

    public OrderQuery setMetadata( Map<String, Object> metadata )
    {
        metadata.forEach( ( key, value ) -> {
            if ( value == null ) value = "";
            put( String.format( "%s[%s]", METADATA, key ), value );
        } );
        return this;
    }

}
