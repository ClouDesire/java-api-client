package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BackupDTO;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface BackupApi
{
    @GET( "backup" )
    Call<List<BackupDTO>> getAll();

    @GET( "backup" )
    Call<List<BackupDTO>> getAll( @Query( "instance" ) int instanceId );

    @GET( "backup/{id}" )
    Call<BackupDTO> get( @Path( "id" ) int id );

    @POST( "backup" )
    Call<Void> requestBackup( @Query( "subscriptionId" ) int subscriptionId );

    @POST( "backup/{id}/restore" )
    Call<Void> restore( @Path( "id" ) int id );

    @DELETE( "backup/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
