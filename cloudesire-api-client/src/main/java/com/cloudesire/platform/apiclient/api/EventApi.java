package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.query.EventQuery;
import com.liberologico.cloudesire.cmw.model.dto.EventDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;

public interface EventApi
{
    @POST( "event" )
    Call<EventDTO> create( @Body EventDTO event );

    @GET( "event" )
    Call<List<EventDTO>> getAll();

    @GET( "event" )
    Call<List<EventDTO>> getAll( @QueryMap EventQuery query );

    @GET( "event/annotated")
    Call<List<String>> getAnnotated();

    @DELETE( "event" )
    Call<Void> delete();

    @DELETE( "event" )
    Call<Void> delete( @Query("eventType") DeleteEventType type );

    enum EventType
    {
        ALL,
        ENTITY,
        TRUE,
        FALSE;

        @Override
        public String toString()
        {
            return name().toLowerCase();
        }
    }

    enum DeleteEventType
    {
        NOTIFIED,
        FAILED;

        @Override
        public String toString()
        {
            return name().toLowerCase();
        }
    }
}
