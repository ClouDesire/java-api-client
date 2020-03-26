package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProductVersionDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ProductVersionDraftDTO;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.LANGUAGE;

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

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll(
            @Query( "product" ) Integer product,
            @Query( "withUnpublished" ) boolean includeUnpublished,
            @QueryMap Map<String, String> pageRequest
    );

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll( @Query( "product" ) Integer product, @Query( "reseller" ) String reseller,
            @QueryMap Map<String, String> pageRequest );

    @GET( "productVersion" )
    Call<List<ProductVersionDTO>> getAll(
            @Query( "product" ) int product,
            @Query( "catalogId" ) Integer catalogId,
            @QueryMap Map<String, String> pageRequest
    );

    @GET( "productVersion/identifier/{productVersionIdentifier}" )
    Call<ProductVersionDTO> getByIdentifier( @Path( "productVersionIdentifier" ) String productVersionIdentifier );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> get( @Path( "id" ) int id, @Query( LANGUAGE ) String language );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> getByReseller( @Path( "id" ) int id, @Query( "reseller" ) String reseller );

    @GET( "productVersion/{id}" )
    Call<ProductVersionDTO> getByReseller( @Path( "id" ) int id, @Query( "reseller" ) String reseller,
            @Query( "language" ) String language );

    @GET( "productVersion" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCsvCatalog( @QueryMap Map<String, String> pageRequest );

    @Multipart
    @POST( "productVersion" )
    Call<Void> sendCsvCatalog( @Part MultipartBody.Part file );

    @PUT( "productVersion/{id}" )
    Call<ProductVersionDTO> update( @Path( "id" ) int id, @Body ProductVersionDTO input );

    @PUT( "productVersion/{id}" )
    Call<ProductVersionDTO> update( @Path( "id" ) int id, @Body ProductVersionDTO input,
            @Query( "language" ) String language );

    @GET( "productVersion/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) int id );

    @PUT( "productVersion/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Map<String, Object> payload );

    @DELETE( "productVersion/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );

    @GET( "productVersion/draft" )
    Call<List<ProductVersionDraftDTO>> getDrafts();

    @GET( "productVersion/draft" )
    Call<List<ProductVersionDraftDTO>> getDrafts( @QueryMap Map<String, String> pageRequest );

    @GET( "productVersion/{id}/draft" )
    Call<ProductVersionDraftDTO> getDraft( @Path( "id" ) Integer productVersion, @Query( "language" ) String language );
}
