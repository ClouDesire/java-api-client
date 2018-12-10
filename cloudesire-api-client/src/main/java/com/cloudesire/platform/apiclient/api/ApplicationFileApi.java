package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ApplicationFileDTO;
import com.liberologico.cloudesire.cmw.model.dto.ApplicationFileEnvironmentDTO;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface ApplicationFileApi
{
    @POST( "applicationFile" )
    Call<ApplicationFileDTO> create( @Body ApplicationFileDTO file );

    @Multipart
    @POST( "applicationFile" )
    Call<ApplicationFileDTO> create(
            @Part MultipartBody.Part file,
            @Query( "stack" ) String[] stacks,
            @Query( "version" ) String version
    );

    @DELETE( "applicationFile/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "applicationFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Object input );

    @GET( "applicationFile/active" )
    Call<ApplicationFileDTO> getActive( @Query( "virtualMachineConfiguration" ) Integer virtualMachineConfiguration,
            @Query( "name" ) String name );

    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAllVersions( @Query( "virtualMachineInstance" ) String virtualMachineInstance );

    @GET( "applicationFile/{id}/environment" )
    Call<List<ApplicationFileEnvironmentDTO>> getEnvironments( @Path( "id" ) int id );

    @GET( "applicationFile/{id}" )
    Call<ApplicationFileDTO> get( @Path( "id" ) int id );

    @PUT( "applicationFile/{id}" )
    Call<ApplicationFileDTO> update( @Path( "id" ) int id, @Body ApplicationFileDTO input );
}
