package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.EndpointDTO;
import com.liberologico.cloudesire.cmw.model.dto.RecurringCostLineDTO;
import com.liberologico.cloudesire.cmw.model.dto.SubscriptionDTO;
import com.liberologico.cloudesire.cmw.model.dto.SubscriptionPatchDTO;
import com.liberologico.cloudesire.cmw.model.dto.VendorOrderLineDTO;
import com.liberologico.cloudesire.cmw.model.enums.DeploymentStatusEnum;
import com.liberologico.cloudesire.cmw.model.enums.OrderType;
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
    @POST( "subscription/{id}/invoice/recurring" )
    Call<SubscriptionDTO> addRecurringCosts( @Path( "id" ) Integer id, @Body List<RecurringCostLineDTO> lines );

    @DELETE( "subscription/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "subscription/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body SubscriptionPatchDTO input );

    @HEAD( "subscription" )
    Call<Void> getAllPagedHead( @Query( "filter" ) String filter, @Query( "status" ) String status,
            @Query( "type" ) String type, @Query( "product" ) Integer product, @QueryMap Map<String, String> pageRequest );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAllPaged( @QueryMap Map<String, String> pageRequest );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAllPaged(
            @Query( "status" ) DeploymentStatusEnum status, @QueryMap Map<String, String> pageRequest );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAllPaged(
            @Query( "type" ) OrderType type, @QueryMap Map<String, String> pageRequest );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAllPaged( @Query( "filter" ) String filter, @Query( "status" ) String status,
            @Query( "type" ) String type, @Query( "product" ) Integer product, @QueryMap Map<String, String> pageRequest );

    @GET( "subscription/expiring" )
    Call<List<SubscriptionDTO>> getExpiring();

    @GET( "subscription/{id}" )
    Call<SubscriptionDTO> get( @Path( "id" ) Integer id );

    @POST( "subscription/{id}/invoice" )
    Call<Void> postOrderLines( @Path( "id" ) Integer id, @Body List<VendorOrderLineDTO> lines,
            @Query( "cashed" ) Boolean cashed );

    @POST( "subscription/{id}/instructions" )
    Call<SubscriptionDTO> setEndUserInstructions( @Path( "id" ) Integer id, @Body Map<String, String> instructions );

    @POST( "subscription/{id}/endpoints" )
    Call<SubscriptionDTO> setSyndicatedEndpoints( @Path( "id" ) Integer id, @Body List<EndpointDTO> endpointsDTO );

    @GET( "subscription/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) Integer id );

    @PUT( "subscription/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Map<String, Object> payload );

    @Streaming
    @GET( "subscription" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @Query( "filter" ) String filter, @Query( "status" ) String status,
            @Query( "type" ) String type, @Query( "product" ) Integer product,
            @QueryMap Map<String, String> pageRequest );

    @Streaming
    @GET( "subscription" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
