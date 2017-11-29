package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.BandwidthPricingDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface BandwidthPricingApi
{
    @POST( "bandwidthPricing" )
    Call<BandwidthPricingDTO> create( @Body BandwidthPricingDTO resource );

    @GET( "bandwidthPricing" )
    Call<List<BandwidthPricingDTO>> getAll( @Query( "cloudProvider" ) Integer cloudProvider );
}
