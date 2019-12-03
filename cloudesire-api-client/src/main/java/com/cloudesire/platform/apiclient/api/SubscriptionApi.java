package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ApplicationCredentialDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.EndpointDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.RecurringCostLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionDetailDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionPatchDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionPatchResponseDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.VendorOrderLineDTO;
import com.cloudesire.platform.apiclient.query.SubscriptionQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
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

public interface SubscriptionApi
{
    @HEAD( "subscription" )
    Call<Void> getAllPagedHead();

    @HEAD( "subscription" )
    Call<Void> getAllPagedHead( @QueryMap SubscriptionQuery query );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAll();

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAll( @QueryMap SubscriptionQuery query );

    @POST( "subscription/{id}/invoice/recurring" )
    Call<SubscriptionDetailDTO> addRecurringCosts( @Path( "id" ) Integer id, @Body List<RecurringCostLineDTO> lines );

    @DELETE( "subscription/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "subscription/{id}" )
    Call<SubscriptionPatchResponseDTO> partialUpdate( @Path( "id" ) int id, @Body SubscriptionPatchDTO input );

    @PATCH( "subscription/{id}" )
    Call<SubscriptionPatchResponseDTO> partialUpdate( @Path( "id" ) int id, @Body SubscriptionPatchDTO input,
            @Query( "language" ) String language );

    @GET( "subscription/expiring" )
    Call<List<SubscriptionDTO>> getExpiring();

    @GET( "subscription/{id}" )
    Call<SubscriptionDetailDTO> get( @Path( "id" ) Integer id );

    @GET( "subscription/{id}" )
    Call<SubscriptionDetailDTO> get( @Path( "id" ) Integer id, @Query( "language" ) String language );

    @POST( "subscription/{id}/invoice" )
    Call<Void> postOrderLines( @Path( "id" ) Integer id, @Body List<VendorOrderLineDTO> lines,
            @Query( "cashed" ) Boolean cashed );

    @POST( "subscription/{id}/credentials" )
    Call<SubscriptionDetailDTO> setApplicationCredentials( @Path( "id" ) int id, @Body List<ApplicationCredentialDTO> credentials );

    @POST( "subscription/{id}/instructions" )
    Call<SubscriptionDetailDTO> setEndUserInstructions( @Path( "id" ) Integer id, @Body Map<String, String> instructions );

    @POST( "subscription/{id}/endpoints" )
    Call<SubscriptionDetailDTO> setSyndicatedEndpoints( @Path( "id" ) Integer id, @Body List<EndpointDTO> endpointsDTO );

    @GET( "subscription/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) Integer id );

    @PUT( "subscription/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Map<String, Object> payload );

    @DELETE( "subscription/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );

    @Streaming
    @GET( "subscription" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv();

    @Streaming
    @GET( "subscription" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap SubscriptionQuery query );

    @GET( "subscription/{id}/bandwidth" )
    Call<Map<String, Object>> getBandwidth( @Path( "id" ) Integer subscriptionId );
}
