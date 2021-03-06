package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BulkImportResultDTO;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface BulkApi
{
    @GET( "bulk/cloudPricings" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCloudPricings();

    @GET( "bulk/distributorCatalog/{id}" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getDistributorCatalog( @Path( "id" ) int id );

    @GET( "bulk/plans" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getPlans( @QueryMap Map<String, String> pageRequest );

    @GET( "bulk/resellerCatalog/{id}" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getResellerCatalog( @Path( "id" ) int id );

    @GET( "bulk/users" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getUsers( @QueryMap Map<String, String> pageRequest );

    @Multipart
    @PUT( "bulk/cloudPricings" )
    Call<Void> saveCloudPricings( @Part MultipartBody.Part file );

    @Multipart
    @PUT( "bulk/distributorCatalog/{id}" )
    Call<Void> saveDistributorCatalog( @Path( "id" ) int id, @Part MultipartBody.Part file );

    @Multipart
    @PUT( "bulk/plans" )
    Call<Void> savePlans( @Part MultipartBody.Part file );

    @Multipart
    @PUT( "bulk/resellerCatalog/{id}" )
    Call<Void> saveResellerCatalog( @Path( "id" ) int id, @Part MultipartBody.Part file );

    @Multipart
    @PUT( "bulk/users" )
    Call<Void> saveUsers( @Part MultipartBody.Part file );

    @GET( "bulk/result" )
    Call<List<BulkImportResultDTO>> getResults();

    @GET( "bulk/result/{requestId}" )
    Call<BulkImportResultDTO> getResult( @Path( "requestId" ) String requestId );
}
