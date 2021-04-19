package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.InvoiceDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.MyUserDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UserCompanyDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
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

    @GET( "test/user/{id}/metadata" )
    Call<Map<String, String>> getSandboxMetadata( @Path( "id" ) int id );

    @PUT( "test/user/{id}/metadata" )
    Call<Void> updateSandboxMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @GET( "test/userCompany/{id}" )
    Call<UserCompanyDTO> getUserCompany( @Path( "id" ) int id );
}
