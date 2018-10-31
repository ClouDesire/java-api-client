package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ResellerPricingDTO;
import com.liberologico.cloudesire.cmw.model.dto.PercentagePricingPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ResellerPricingApi
{
    @POST( "resellerPricing" )
    Call<ResellerPricingDTO> create( @Body ResellerPricingDTO dto );

    @GET( "resellerPricing/{id}" )
    Call<ResellerPricingDTO> get( @Path( "id" ) int id );

    @GET( "resellerPricing" )
    Call<List<ResellerPricingDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "resellerPricing" )
    Call<List<ResellerPricingDTO>> getAll(
            @Query( "resellerId" ) Integer resellerId,
            @QueryMap Map<String, String> pageRequest
    );

    @GET( "resellerPricing" )
    Call<List<ResellerPricingDTO>> getAll(
            @Query( "unpriced" ) Boolean unpriced,
            @QueryMap Map<String, String> pageRequest
    );

    @GET( "resellerPricing" )
    Call<List<ResellerPricingDTO>> getAll(
            @Query( "resellerId" ) Integer resellerId,
            @Query( "catalogId" ) Integer catalogId,
            @Query( "productId" ) Integer productId,
            @Query( "unpriced" ) Boolean unpriced,
            @QueryMap Map<String, String> pageRequest
    );

    @PUT( "resellerPricing/{id}" )
    Call<ResellerPricingDTO> update( @Path( "id" ) int id, @Body ResellerPricingDTO input );

    @PATCH( "resellerPricing" )
    Call<Void> patch( @Body PercentagePricingPatchDTO input );

    @DELETE( "resellerPricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
