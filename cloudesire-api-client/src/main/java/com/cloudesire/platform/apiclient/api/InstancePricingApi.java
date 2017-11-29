package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.InstancePricingDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface InstancePricingApi
{
    @PATCH( "instancePricing" )
    Call<Void> associationTrigger( @Body Object input );

    @POST( "instancePricing" )
    Call<InstancePricingDTO> create( @Body InstancePricingDTO outres );

    @GET( "instancePricing" )
    Call<List<InstancePricingDTO>> getAll( @Query( "cloudProvider" ) Integer cloudProvider );
}
