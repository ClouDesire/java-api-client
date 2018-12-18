package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CardDataDTO;
import com.liberologico.cloudesire.cmw.model.dto.InvoiceDTO;
import com.liberologico.cloudesire.cmw.model.patch.InvoicePaymentReferenceDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface InvoiceApi
{
    @DELETE( "invoice/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "invoice/{id}/forcePaid" )
    Call<Void> forcePaid( @Path( "id" ) Integer id, @Body InvoicePaymentReferenceDTO input );

    /**
     * @deprecated by {@link #forcePaid(Integer, InvoicePaymentReferenceDTO)}
     */
    @Deprecated
    @PATCH( "invoice/{id}/forcePaid" )
    Call<Void> forcePaid( @Path( "id" ) Integer id, @Body Map<String, String> input );

    @GET( "invoice" )
    Call<List<InvoiceDTO>> getAll();

    @GET( "invoice" )
    Call<List<InvoiceDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "invoice/{id}/pdf" )
    Call<List<byte[]>> getPdf( @Path( "id" ) Integer id );

    @GET( "invoice/remoteId={remoteId}" )
    Call<InvoiceDTO> getByRemoteId( @Path( "remoteId" ) String remoteId );

    @GET( "invoice/remoteInvoiceId={remoteId}" )
    Call<InvoiceDTO> getByRemoteInvoiceId( @Path( "remoteId" ) String remoteId );

    @GET( "invoice/{id}" )
    Call<InvoiceDTO> get( @Path( "id" ) Integer id );

    @POST( "invoice/{id}/pay/stripe" )
    Call<Void> payWithStripe( @Path( "id" ) int id, @Body CardDataDTO input );

    /**
     * @deprecated by {@link #payWithStripe(int, CardDataDTO)}
     */
    @Deprecated
    @PATCH( "invoice/{id}/payWithStripe" )
    Call<Void> payWithStripe( @Path( "id" ) Integer id, @Body Object input );

    @Streaming
    @GET( "invoice" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv(  @Query( "paid" ) Boolean paid, @Query( "nominee" ) Boolean nominee,
            @Query( "selfBilled" ) Boolean selfBilled, @Query( "type" ) String type,
            @Query( "expired" ) Boolean expired, @QueryMap Map<String, String> pageRequest  );

    @Streaming
    @GET( "invoice" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
