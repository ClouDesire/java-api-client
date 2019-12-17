package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.*;
import com.cloudesire.platform.apiclient.query.SubscriptionQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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
    Call<Void> setApplicationCredentials( @Path( "id" ) int id, @Body List<ApplicationCredentialInputDTO> credentials );

    @POST( "subscription/{id}/instructions" )
    Call<Void> setEndUserInstructions( @Path( "id" ) int id, @Body Map<String, String> instructions );

    @POST( "subscription/{id}/endpoints" )
    Call<Void> setSyndicatedEndpoints( @Path( "id" ) int id, @Body List<EndpointDTO> endpointsDTO );

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
