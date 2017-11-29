package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.StackParameterValueDTO;
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

    @DELETE( "stackParameterValue/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "stackParameterValue" )
    Call<List<StackParameterValueDTO>> getAll( @Query( "stackParameterId" ) Integer stackParameterId,
            @Query( "dependencyId" ) Integer dependencyId );

    @GET( "stackParameterValue/{id}" )
    Call<StackParameterValueDTO> get( @Path( "id" ) Integer id );

    @PUT( "stackParameterValue/{id}" )
    Call<StackParameterValueDTO> update( @Body StackParameterValueDTO input, @Path( "id" ) Integer id );
}
