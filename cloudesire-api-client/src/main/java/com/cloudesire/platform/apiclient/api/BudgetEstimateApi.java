package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BudgetDetailDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.BudgetInputDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.CartBudgetDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.CartItemBudgetDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import static com.cloudesire.platform.apiclient.response.Headers.MODE;

public interface BudgetEstimateApi
{
    @POST( "budgetEstimate" )
    Call<BudgetDetailDTO> request( @Body BudgetInputDTO input );

    @POST( "budgetEstimate" )
    Call<BudgetDetailDTO> request( @Body BudgetInputDTO input, @Header( MODE ) String environment );

    @POST( "budgetEstimate/cart/{id}" )
    Call<CartBudgetDTO> requestForCart( @Path( "id" ) int cartId );

    @POST( "budgetEstimate/cart/item/{id}" )
    Call<CartItemBudgetDTO> requestForCartItem( @Path( "id" ) int cartItemId );

    @POST( "budgetEstimate/validate" )
    Call<Void> validate( @Body BudgetInputDTO input );
}
