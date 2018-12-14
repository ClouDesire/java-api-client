package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.DependencyDTO;
import com.cloudesire.platform.apiclient.query.PageRequestQuery;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;

public interface DependencyApi
{
    @POST( "dependency" )
    Call<DependencyDTO> create( @Body DependencyDTO dependency );

    @GET( "dependency" )
    Call<List<DependencyDTO>> getAll();

    @GET( "dependency" )
    Call<List<DependencyDTO>> getAll( @QueryMap PageRequestQuery pageRequest );

    @GET( "dependency/{id}" )
    Call<DependencyDTO> get( @Path( "id" ) int id );

    @PUT( "dependency/{id}" )
    Call<DependencyDTO> update( @Path( "id" ) int id, @Body DependencyDTO dependency );

    @DELETE( "dependency/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
