package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.DistributorPricingDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PercentagePricingPatchDTO;
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

public interface DistributorPricingApi
{
    @POST( "distributorPricing" )
    Call<DistributorPricingDTO> create( @Body DistributorPricingDTO dto );

    @GET( "distributorPricing/{id}" )
    Call<DistributorPricingDTO> get( @Path( "id" ) int id );

    @GET( "distributorPricing" )
    Call<List<DistributorPricingDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "distributorPricing" )
    Call<List<DistributorPricingDTO>> getAll(
            @Query( "productId" ) Integer productId,
            @Query( "catalogId" ) Integer catalogId,
            @Query( "deprecated" ) Boolean deprecated,
            @QueryMap Map<String, String> pageRequest
    );

    @PUT( "distributorPricing/{id}" )
    Call<DistributorPricingDTO> update( @Path( "id" ) int id, @Body DistributorPricingDTO input );

    @PATCH( "distributorPricing" )
    Call<Void> patch( @Body PercentagePricingPatchDTO input );

    @DELETE( "distributorPricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
