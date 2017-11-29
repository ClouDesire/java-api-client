package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ApplicationFileDTO;
import com.liberologico.cloudesire.cmw.model.dto.ApplicationFileEnvironmentDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface ApplicationFileApi
{
    @POST( "applicationFile" )
    Call<ApplicationFileDTO> create( @Body ApplicationFileDTO file );

    @DELETE( "applicationFile/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "applicationFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "applicationFile/active" )
    Call<ApplicationFileDTO> getActive( @Query( "virtualMachineConfiguration" ) Integer virtualMachineConfiguration,
            @Query( "name" ) String name );

    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAllVersions( @Query( "virtualMachineInstance" ) String virtualMachineInstance );

    @GET( "applicationFile/{id}/environment" )
    Call<List<ApplicationFileEnvironmentDTO>> getEnvironments( @Path( "id" ) Integer id );

    @GET( "applicationFile/{id}" )
    Call<ApplicationFileDTO> get( @Path( "id" ) Integer id );

    @PUT( "applicationFile/{id}" )
    Call<ApplicationFileDTO> update( @Body ApplicationFileDTO input, @Path( "id" ) Integer id );
}
