package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ProductVersionDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductVersionDraftDTO;
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

import static com.liberologico.cloudesire.cmw.model.constants.Parameters.LANGUAGE;
import static com.liberologico.cloudesire.cmw.model.constants.Parameters.VERSION;

public interface ProductVersionApi
{
    @POST( "productVersion" )
    Call<ProductVersionDTO> create( @Body ProductVersionDTO input );

    @POST( "productVersion" )
    Call<ProductVersionDTO> create( @Body ProductVersionDTO input, @Query( "language" ) String language );

    @DELETE( "productVersion/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "productVersion/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input );

    @PATCH( "productVersion/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input,
            @Query( "language" ) String language );

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll( @Query( "product" ) Integer product );

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll( @Query( "product" ) Integer product,
            @QueryMap Map<String, String> pageRequest );

    @GET( "productVersion/identifier/{productVersionIdentifier}" )
    Call<ProductVersionDTO> getByIdentifier( @Path( "productVersionIdentifier" ) String productVersionIdentifier );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id, @Query( LANGUAGE ) String language );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id, @Query( VERSION ) Long apiVersion );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> getByReseller( @Path( "id" ) int id, @Query( "reseller" ) String reseller );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> getByReseller( @Path( "id" ) int id, @Query( "reseller" ) String reseller,
            @Query( "language" ) String language );

    @PUT( "productVersion/{id}" )
    Call<ProductVersionDTO> update( @Path( "id" ) int id, @Body ProductVersionDTO input );

    @PUT( "productVersion/{id}" )
    Call<ProductVersionDTO> update( @Path( "id" ) int id, @Body ProductVersionDTO input,
            @Query( "language" ) String language );

    @GET( "productVersion/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) int id );

    @PUT( "productVersion/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Map<String, Object> payload );

    @GET( "productVersion/draft" )
    Call<List<ProductVersionDraftDTO>> getDrafts();

    @GET( "productVersion/draft" )
    Call<List<ProductVersionDraftDTO>> getDrafts( @QueryMap Map<String, String> pageRequest );

    @GET( "productVersion/{id}/draft" )
    Call<ProductVersionDraftDTO> getDraft( @Path( "id" ) Integer productVersion, @Query( "language" ) String language );
}
