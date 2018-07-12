package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.EventDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface EventApi
{
    @GET( "event?type=all" )
    Call<List<EventDTO>> getAll();

    @GET( "event?type=all" )
    Call<List<EventDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "event?type=entity" )
    Call<List<EventDTO>> getAll(
            @Query( "entity" ) String entity,
            @Query( "id" ) Integer id );

    @GET( "event?type=all" )
    Call<List<EventDTO>> getAll( @Query("type") boolean notified );
}
