package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.api.EventApi;

public class EventQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String ENTITY = "entity";
    private static final String ID = "id";

    public static EventQuery all()
    {
        return new EventQuery().setType( EventApi.EventType.ALL );
    }

    public EventQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public EventQuery setType( EventApi.EventType value )
    {
        put( TYPE, value );
        return this;
    }

    public EventQuery setEntity( String value )
    {
        put( ENTITY, value );
        return this;
    }

    public EventQuery setId( Integer value )
    {
        put( ID, value );
        return this;
    }
}
