package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BillingBudgetDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface BillingBudgetApi
{
    @POST( "billingBudget" )
    Call<BillingBudgetDTO> create( @Body BillingBudgetDTO resource );

    @GET( "billingBudget" )
    Call<List<BillingBudgetDTO>> getAll();

    @GET( "billingBudget/{id}" )
    Call<BillingBudgetDTO> get( @Path( "id" ) int id );

    @PUT( "billingBudget/{id}" )
    Call<BillingBudgetDTO> update( @Path( "id" ) int id, @Body BillingBudgetDTO resource );

    @DELETE( "billingBudget/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
