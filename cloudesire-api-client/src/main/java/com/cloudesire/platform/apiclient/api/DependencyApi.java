package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.DependencyDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface DependencyApi
{
    @POST( "dependency" )
    Call<DependencyDTO> create( @Body DependencyDTO dependency );

    @GET( "dependency" )
    Call<List<DependencyDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "dependency/{id}" )
    Call<DependencyDTO> get( @Path( "id" ) int id );

    @PUT( "dependency/{id}" )
    Call<DependencyDTO> update( @Path( "id" ) int id, @Body DependencyDTO dependency );

    @DELETE( "dependency/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
