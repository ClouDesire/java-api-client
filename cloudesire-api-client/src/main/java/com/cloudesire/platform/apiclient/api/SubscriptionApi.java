package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ApplicationCredentialInputDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.EndpointDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.NamedEntityDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.OneshotCostLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PricedEntityDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.RecurringCostLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionDeploymentDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionDetailDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionPatchDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SubscriptionPatchResponseDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.VendorOrderLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.changelog.ChangelogDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.CustomInvoiceType;
import com.cloudesire.platform.apiclient.query.CostsQuery;
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
    @Headers( "Prefer: response=minimal" )
    Call<List<NamedEntityDTO>> getAllMinimal( @QueryMap SubscriptionQuery query );

    @GET( "subscription" )
    @Headers( "Prefer: response=priced" )
    Call<List<PricedEntityDTO>> getAllPriced( @QueryMap SubscriptionQuery subscriptionQuery, @QueryMap CostsQuery costsQuery );

    @GET( "subscription" )
    @Headers( "Prefer: response=deployment" )
    Call<List<SubscriptionDeploymentDTO>> getAllDeployment( @QueryMap SubscriptionQuery query );

    @GET( "subscription" )
    Call<List<SubscriptionDTO>> getAll( @QueryMap SubscriptionQuery query );

    @POST( "subscription/{id}/invoice/oneshot" )
    Call<SubscriptionDetailDTO> addOneshotCosts( @Path( "id" ) int id, @Body List<OneshotCostLineDTO> lines );

    @POST( "subscription/{id}/invoice/recurring" )
    Call<SubscriptionDetailDTO> addRecurringCosts( @Path( "id" ) int id, @Body List<RecurringCostLineDTO> lines );

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

    @GET( "subscription/{id}" )
    @Headers( "Prefer: response=minimal" )
    Call<NamedEntityDTO> getMinimal( @Path( "id" ) int id );

    @GET( "subscription/{id}/changelog" )
    Call<ChangelogDTO> getChangelog( @Path( "id" ) int id );

    @POST( "subscription/{id}/invoice" )
    Call<Void> customInvoice( @Path( "id" ) int id,
            @Body List<VendorOrderLineDTO> lines,
            @Query( "type" ) CustomInvoiceType type );

    /**
     * @deprecated by {@link #customInvoice(int, List, CustomInvoiceType)}
     */
    @Deprecated
    @POST( "subscription/{id}/invoice" )
    Call<Void> postOrderLines( @Path( "id" ) int id, @Body List<VendorOrderLineDTO> lines,
            @Query( "cashed" ) Boolean cashed );

    @POST( "subscription/{id}/credentials" )
    Call<Void> setApplicationCredentials( @Path( "id" ) int id, @Body List<ApplicationCredentialInputDTO> credentials );

    @POST( "subscription/{id}/instructions" )
    Call<Void> setEndUserInstructions( @Path( "id" ) int id, @Body Map<String, String> instructions );

    @POST( "subscription/{id}/endpoints" )
    Call<Void> setSyndicatedEndpoints( @Path( "id" ) int id, @Body List<EndpointDTO> endpointsDTO );

    @GET( "subscription/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) Integer id );

    @PUT( "subscription/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Map<String, String> payload );

    @DELETE( "subscription/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );

    @GET( "subscription/metadata/keys" )
    Call<List<String>> getMetadataKeys();

    @GET( "subscription/metadata/{key}/values" )
    Call<List<String>> getMetadataValues( @Path( "key" ) String key );

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
