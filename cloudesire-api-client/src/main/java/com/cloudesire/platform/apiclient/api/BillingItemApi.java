package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.BillingItemDTO;
import com.liberologico.cloudesire.cmw.model.enums.BillingItemValueType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface BillingItemApi
{
    @POST( "billingItem" )
    Call<BillingItemDTO> create( @Body BillingItemDTO source );

    @POST( "billingItem" )
    Call<BillingItemDTO> create( @Body BillingItemDTO source, @Query( "language" ) String language );

    @DELETE( "billingItem/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "billingItem" )
    Call<List<BillingItemDTO>> getAll(
            @QueryMap Map<String, String> pageRequest,
            @Query( "valueType" ) BillingItemValueType valueType,
            @Query( "companyId" ) Integer companyId,
            @Query( "reseller" ) String reseller
    );

    @GET( "billingItem/identifier={identifier}" )
    Call<BillingItemDTO> get( @Path( "identifier" ) String identifier );

    @GET( "billingItem/{id}" )
    Call<BillingItemDTO> get( @Path( "id" ) Integer id );

    @GET( "billingItem/{id}" )
    Call<BillingItemDTO> get( @Path( "id" ) Integer id, @Query( "language" ) String language );

    @PUT( "billingItem/{id}" )
    Call<BillingItemDTO> update( @Path( "id" ) Integer id, @Body BillingItemDTO source );

    @PUT( "billingItem/{id}" )
    Call<BillingItemDTO> update( @Path( "id" ) Integer id, @Body BillingItemDTO source, @Query( "language" ) String language );
}
