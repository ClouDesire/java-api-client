package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.StackParameterValueDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface StackParameterValueApi
{
    @POST( "stackParameterValue" )
    Call<StackParameterValueDTO> create( @Body StackParameterValueDTO input );

    @GET( "stackParameterValue" )
    Call<List<StackParameterValueDTO>> getAll();

    @GET( "stackParameterValue" )
    Call<List<StackParameterValueDTO>> getAll( @Query( "stackParameter" ) String stackParameter );

    @GET( "stackParameterValue" )
    Call<List<StackParameterValueDTO>> getAll( @Query( "dependencyId" ) int dependencyId );

    @GET( "stackParameterValue" )
    Call<List<StackParameterValueDTO>> getAll( @Query( "stackParameter" ) String stackParameterName,
            @Query( "dependencyId" ) int dependencyId );

    @GET( "stackParameterValue/{id}" )
    Call<StackParameterValueDTO> get( @Path( "id" ) int id );

    @PUT( "stackParameterValue/{id}" )
    Call<StackParameterValueDTO> update( @Path( "id" ) int id, @Body StackParameterValueDTO input );

    @DELETE( "stackParameterValue/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
