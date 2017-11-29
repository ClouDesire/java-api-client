package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.BudgetDTO;
import com.liberologico.cloudesire.cmw.model.dto.BudgetInputDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface BudgetEstimateApi
{
    @GET( "budgetEstimate" )
    Call<BudgetDTO> get( @Query( "idProductVersion" ) String idProductVersion, @Query( "idProvider" ) String idProvider,
            @Query( "type" ) String type, @Query( "idBandwidthPricing" ) Integer idBandwidthPricing,
            @Query( "billingPeriods" ) Integer billingPeriods, @Query( "hashCoupon" ) String hashCoupon );

    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input );
}
