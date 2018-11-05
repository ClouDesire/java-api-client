package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.EventDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface EventApi
{
    @POST( "event" )
    Call<EventDTO> create( @Body EventDTO event );

    @GET( "event" )
    Call<List<EventDTO>> getAll();

    @GET( "event" )
    Call<List<EventDTO>> getAll( @Query("type") EventType type );

    @GET( "event" )
    Call<List<EventDTO>> getAll( @Query("type") EventType type, @Query("entity") String entity, @Query("id") int entiyId );

    @GET( "event/annotated")
    Call<List<String>> getAnnotated();

    @GET( "event?type=all" )
    Call<List<EventDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "event?type=entity" )
    Call<List<EventDTO>> getAll(
            @Query( "entity" ) String entity,
            @Query( "id" ) Integer id );

    @GET( "event?type=all" )
    Call<List<EventDTO>> getAll( @Query("type") boolean notified );

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
