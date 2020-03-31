package com.cloudesire.platform.apiclient.api;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.Map;

public interface BulkApi
{
    @GET( "bulk/cloudPricings" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCloudPricings();

    @GET( "bulk/plans" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getPlans( @QueryMap Map<String, String> pageRequest );

    @Multipart
    @PUT( "bulk/plans" )
    Call<Void> savePlans( @Part MultipartBody.Part file );
}
