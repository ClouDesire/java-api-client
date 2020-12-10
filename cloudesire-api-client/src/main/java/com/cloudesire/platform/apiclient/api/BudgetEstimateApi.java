package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BudgetDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.BudgetInputDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

import static com.cloudesire.platform.apiclient.response.Headers.MODE;

public interface BudgetEstimateApi
{
    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input );

    @POST( "budgetEstimate" )
    Call<BudgetDTO> request( @Body BudgetInputDTO input, @Header( MODE ) String environment );

    @POST( "budgetEstimate/cart/{id}" )
    Call<List<BudgetDTO>> requestForCart( @Path( "id" ) int cartId );

    @POST( "budgetEstimate/cart/item/{id}" )
    Call<BudgetDTO> requestForCartItem( @Path( "id" ) int cartItemId );

    @POST( "budgetEstimate/validate" )
    Call<Void> validate( @Body BudgetInputDTO input );
}
