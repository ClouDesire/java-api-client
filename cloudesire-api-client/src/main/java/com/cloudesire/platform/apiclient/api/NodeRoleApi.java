package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.NodeRoleDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface NodeRoleApi
{
    @POST( "nodeRole" )
    Call<NodeRoleDTO> create( @Body NodeRoleDTO input );

    @DELETE( "nodeRole/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "nodeRole" )
    Call<List<NodeRoleDTO>> getAll();

    @GET( "nodeRole/{id}" )
    Call<NodeRoleDTO> get( @Path( "id" ) Integer id );

    @PUT( "nodeRole/{id}" )
    Call<NodeRoleDTO> update( @Body NodeRoleDTO input, @Path( "id" ) Integer id );
}
