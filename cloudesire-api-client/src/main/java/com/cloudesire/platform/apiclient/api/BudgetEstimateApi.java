package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BudgetDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.BudgetInputDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import static com.cloudesire.platform.apiclient.response.Headers.MODE;

public interface BudgetEstimateApi
{
    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input );

    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input, @Header( MODE ) String environment );

    @POST( "budgetEstimate/validate" )
    Call<Void> validate( @Body BudgetInputDTO input );
}
