package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ResellerPricingDTO;
import com.liberologico.cloudesire.cmw.model.dto.ResellerPricingPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ResellerPricingApi
{
    @POST( "resellerPricing" )
    Call<ResellerPricingDTO> create( @Body ResellerPricingDTO dto );

    @GET( "resellerPricing" )
    Call<List<ResellerPricingDTO>> getAll( @Query( "resellerId" ) Integer resellerId,
            @Query( "unpriced" ) Boolean unpriced, @QueryMap Map<String, String> pageRequest );

    @PATCH( "resellerPricing" )
    Call<Void> patch( @Body ResellerPricingPatchDTO input );
}
