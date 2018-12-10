package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.BudgetDTO;
import com.liberologico.cloudesire.cmw.model.dto.BudgetInputDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import static com.liberologico.cloudesire.cmw.model.constants.Headers.MODE;

public interface BudgetEstimateApi
{
    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input );

    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input, @Header( MODE ) String environment );
}
