package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.StackParameterDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface StackParameterApi
{
    @POST( "stackParameter" )
    Call<StackParameterDTO> create( @Body StackParameterDTO input );

    @DELETE( "stackParameter/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "stackParameter" )
    Call<List<StackParameterDTO>> getAll( @Query( "nodeRoleId" ) Integer nodeRoleId,
            @Query( "nodeRoleName" ) String nodeRoleName );

    @GET( "stackParameter/{id}" )
    Call<StackParameterDTO> get( @Path( "id" ) Integer id );

    @PUT( "stackParameter/{id}" )
    Call<StackParameterDTO> update( @Body StackParameterDTO input, @Path( "id" ) Integer id );
}
