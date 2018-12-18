package com.cloudesire.platform.apiclient;

import com.liberologico.cloudesire.cmw.model.dto.InvoiceDTO;
import com.liberologico.cloudesire.cmw.model.dto.MyUserDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.Map;

public interface EventTestApi
{
    @GET( "test/user/{id}" )
    Call<MyUserDTO> getUser( @Path( "id" ) int userId );

    @GET( "test/invoicePaid/{id}" )
    Call<InvoiceDTO> getInvoice( @Path( "id" ) int invoiceId );

    @PATCH( "test/subscription/{id}" )
    Call<Void> patch( @Path( "id" ) int subscriptionId, @Body Map<String, Object> emptyMap,
            @Query( "language" ) String language );
}
