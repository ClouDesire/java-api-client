package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ResellerCatalogDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ResellerCatalogApi
{
    @POST( "resellerCatalog" )
    Call<ResellerCatalogDTO> create( @Body ResellerCatalogDTO dto );

    @GET( "resellerCatalog/{id}" )
    Call<ResellerCatalogDTO> get( @Path( "id" ) int id );

    @GET( "resellerCatalog" )
    Call<List<ResellerCatalogDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "resellerCatalog" )
    Call<List<ResellerCatalogDTO>> getAll(
            @Query( "resellerId" ) Integer resellerId,
            @QueryMap Map<String, String> pageRequest
    );

    @PUT( "resellerCatalog/{id}" )
    Call<ResellerCatalogDTO> update( @Path( "id" ) int id, @Body ResellerCatalogDTO input );

    @DELETE( "resellerCatalog/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
