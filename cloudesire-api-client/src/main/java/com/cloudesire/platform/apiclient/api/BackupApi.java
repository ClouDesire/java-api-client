package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.BackupDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface BackupApi
{
    @GET( "backup" )
    Call<List<BackupDTO>> getAll( @Query( "instance" ) int instanceId );

    @GET( "backup/{id}" )
    Call<BackupDTO> get( @Path( "id" ) int id );

    @POST( "backup" )
    Call<Void> requestBackup( @Query( "subscriptionId" ) int subscriptionId );
}
