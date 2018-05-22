package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.AzureProductDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductBundleDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductDraftDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductRegisterEntryDTO;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

import static com.liberologico.cloudesire.cmw.model.constants.Headers.MODE;

public interface ProductApi
{
    @POST( "product" )
    Call<ProductDTO> create( @Body ProductDTO input );

    @POST( "product" )
    Call<ProductDTO> create( @Body ProductDTO input, @Query( "language" ) String language );

    @POST( "product/csp" )
    Call<ProductDTO> createCsp( @Body AzureProductDTO input );

    @DELETE( "product/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "product/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object actions );

    @PATCH( "product/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object actions, @Query( "language" ) String language );

    @GET( "product" )
    Call<List<ProductDTO>> getAllWithFunnyFilters( @QueryMap Map<String, String> filters );

    @GET( "product" )
    Call<List<ProductDTO>> getAll();

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @Header( MODE ) String mode );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "name" ) String name );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "name" ) String name,
            @Query( "reseller" ) String reseller );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "reseller" ) String reseller,
            @Query( "productType" ) ProductType productType );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "name" ) String name,
            @Query( "reseller" ) String reseller, @Query( "productType" ) ProductType productType );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "name" ) String name,
            @Query( "ownCompany" ) boolean ownCompany );

    @GET( "product" )
    Call<List<ProductDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "name" ) String name,
            @Query( "ownCompany" ) boolean ownCompany, @Query( "productType" ) ProductType productType );

    @GET( "product/approvalRequests" )
    Call<List<ProductDTO>> getApprovalRequests( @QueryMap Map<String, String> pageRequest );

    @GET( "product/sku/{sku}" )
    Call<ProductDTO> getProductBySKU( @Path( "sku" ) String sku );

    @GET( "product/sku/{sku}" )
    Call<ProductDTO> getProductBySKU( @Path( "sku" ) String sku, @Query( "language" ) String language );

    @GET( "product/{id}" )
    Call<ProductDTO> get( @Path( "id" ) int id );

    @GET( "product/{id}" )
    Call<ProductDTO> get( @Path( "id" ) int id, @Query( "language" ) String language );

    @PUT( "product/{id}" )
    Call<ProductDTO> update( @Path( "id" ) Integer id, @Body ProductDTO input );

    @PUT( "product/{id}" )
    Call<ProductDTO> update( @Path( "id" ) Integer id, @Body ProductDTO input, @Query( "language" ) String language );

    @GET( "product/{id}/bundled" )
    Call<List<ProductBundleDTO>> getBundled( @Path( "id" ) Integer id );

    @GET( "product/{id}/draft" )
    Call<ProductDraftDTO> getDraft( @Path( "id" ) Integer id );

    @GET( "product/{id}/draft" )
    Call<ProductDraftDTO> getDraft( @Path( "id" ) Integer id, @Query( "language" ) String language );

    @GET( "product/draft" )
    Call<List<ProductDraftDTO>> getDrafts( @QueryMap Map<String, String> pageRequest );

    @GET( "product/draft" )
    Call<List<ProductDraftDTO>> getDrafts( @QueryMap Map<String, String> pageRequest, @Query( "language" ) String language );

    @GET( "product/{id}/register" )
    Call<List<ProductRegisterEntryDTO>> getRegister( @Path( "id" ) Integer id );

    @Streaming
    @GET( "product" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );

    @Streaming
    @GET( "product" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest, @Query( "productType" ) ProductType productType );
}
