package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ProductVersionDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ProductVersionApi
{
    @POST( "productVersion" )
    Call<ProductVersionDTO> create( @Body ProductVersionDTO input );

    @DELETE( "productVersion/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "productVersion/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input );

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll( @Query( "product" ) Integer product, @QueryMap Map<String, String> pageRequest );

    @GET( "productVersion/identifier/{productVersionIdentifier}" )
    Call<ProductVersionDTO> getByIdentifier( @Path( "productVersionIdentifier" ) String productVersionIdentifier );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id, @Query( "reseller" ) String reseller );

    @PUT( "productVersion/{id}" )
    Call<ProductVersionDTO> update( @Path( "id" ) Integer id, @Body ProductVersionDTO input );
}
