package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.DistributorCatalogDTO;
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

public interface DistributorCatalogApi
{
    @POST( "distributorCatalog" )
    Call<DistributorCatalogDTO> create( @Body DistributorCatalogDTO dto );

    @GET( "distributorCatalog/{id}" )
    Call<DistributorCatalogDTO> get( @Path( "id" ) int id );

    @GET( "distributorCatalog" )
    Call<List<DistributorCatalogDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "distributorCatalog" )
    Call<List<DistributorCatalogDTO>> getAll(
            @Query( "distributorId" ) Integer distributorId,
            @QueryMap Map<String, String> pageRequest
    );

    @PUT( "distributorCatalog/{id}" )
    Call<DistributorCatalogDTO> update( @Path( "id" ) int id, @Body DistributorCatalogDTO input );

    @PUT( "distributorCatalog/{id}" )
    Call<DistributorCatalogDTO> update( @Path( "id" ) int id, @Body DistributorCatalogDTO input,
            @Query( "generateResellerCatalogs" ) boolean generateResellerCatalogs );

    @DELETE( "distributorCatalog/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
