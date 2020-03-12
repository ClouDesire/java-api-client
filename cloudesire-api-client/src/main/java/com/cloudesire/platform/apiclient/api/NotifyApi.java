package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.NotifyDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface NotifyApi
{
    @POST( "notification" )
    Call<Void> create( @Body NotifyDTO notification );

    @GET( "notification" )
    Call<List<NotifyDTO>> getAll();

    @GET( "notification" )
    Call<List<NotifyDTO>> getAll( @Query( "expired" ) boolean expired );

    @GET( "notification/{id}" )
    Call<NotifyDTO> get( @Path( "id" ) int notificationId );

    @PUT( "notification/{id}" )
    Call<NotifyDTO> update( @Path( "id" ) int notificationId, @Body NotifyDTO notification );

    @DELETE( "notification/{id}" )
    Call<Void> delete( @Path( "id" ) int notificationId );
}
