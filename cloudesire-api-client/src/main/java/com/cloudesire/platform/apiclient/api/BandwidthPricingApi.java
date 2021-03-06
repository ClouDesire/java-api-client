package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BandwidthPricingDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PricingPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface BandwidthPricingApi
{
    @POST( "bandwidthPricing" )
    Call<BandwidthPricingDTO> create( @Body BandwidthPricingDTO resource );

    @GET( "bandwidthPricing" )
    Call<List<BandwidthPricingDTO>> getAll( @Query( "cloudProvider" ) int cloudProvider );

    @GET( "bandwidthPricing/{id}" )
    Call<BandwidthPricingDTO> get( @Path( "id" ) int id );

    @PUT( "bandwidthPricing/{id}" )
    Call<BandwidthPricingDTO> update( @Path( "id" ) int id, @Body BandwidthPricingDTO resource );

    /**
     * @deprecated use {@link #update(int, BandwidthPricingDTO)}
     */
    @Deprecated
    @PATCH( "bandwidthPricing/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body PricingPatchDTO input );

    @DELETE( "bandwidthPricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
