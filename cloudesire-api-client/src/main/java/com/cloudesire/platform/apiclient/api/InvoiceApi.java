package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CardDataDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.InvoiceDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.InvoicePaymentReferenceDTO;
import com.cloudesire.platform.apiclient.query.InvoiceQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface InvoiceApi
{
    @GET( "invoice" )
    Call<List<InvoiceDTO>> getAll( @QueryMap InvoiceQuery query );

    @GET( "invoice" )
    Call<List<InvoiceDTO>> getAll();

    @GET( "invoice" )
    Call<List<InvoiceDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "invoice/{id}" )
    Call<InvoiceDTO> get( @Path( "id" ) int id );

    @GET( "invoice/remoteId={remoteId}" )
    Call<InvoiceDTO> getByRemoteId( @Path( "remoteId" ) String remoteId );

    @GET( "invoice/remoteInvoiceId={remoteId}" )
    Call<InvoiceDTO> getByRemoteInvoiceId( @Path( "remoteId" ) String remoteId );

    @GET( "invoice/{id}/pdf" )
    @Streaming
    Call<ResponseBody> getPdf( @Path( "id" ) int id );

    @Streaming
    @GET( "invoice" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap InvoiceQuery query );

    @GET( "invoice/{id}/refresh" )
    Call<String> refreshPayment( @Path( "id" ) int id );

    @PATCH( "invoice/{id}/forcePaid" )
    Call<Void> forcePaid( @Path( "id" ) int id, @Body InvoicePaymentReferenceDTO input );

    /**
     * @deprecated by {@link #forcePaid(int, InvoicePaymentReferenceDTO)}
     */
    @Deprecated
    @PATCH( "invoice/{id}/forcePaid" )
    Call<Void> forcePaid( @Path( "id" ) Integer id, @Body Map<String, String> input );

    @POST( "invoice/{id}/pdf/regenerate" )
    Call<Void> regeneratePdf( @Path( "id" ) int id );

    @PATCH( "invoice/{id}/confirmPaypalPayment" )
    Call<Void> payWithPaypal( @Path( "id" ) int id, @Body Map<String, String> input );

    @POST( "invoice/{id}/pay/stripe" )
    Call<Void> payWithStripe( @Path( "id" ) int id );

    /**
     * @deprecated by {@link #payWithStripe(int)}
     */
    @Deprecated
    @POST( "invoice/{id}/pay/stripe" )
    Call<Void> payWithStripe( @Path( "id" ) int id, @Body CardDataDTO input );

    /**
     * @deprecated by {@link #payWithStripe(int, CardDataDTO)}
     */
    @Deprecated
    @PATCH( "invoice/{id}/payWithStripe" )
    Call<Void> payWithStripe( @Path( "id" ) Integer id, @Body Object input );

    @GET( "invoice/{id}/stripePaymentClientSecret" )
    Call<String> getStripePaymentClientSecret( @Path( "id" ) int id );

    @DELETE( "invoice/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
