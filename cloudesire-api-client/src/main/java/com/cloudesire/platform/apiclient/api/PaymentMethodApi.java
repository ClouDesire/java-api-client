package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.UserPaymentMethodDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PaymentMethodApi
{
    @POST( "paymentMethod" )
    Call<UserPaymentMethodDTO> create( @Body UserPaymentMethodDTO pamymentMethod );

    @GET( "paymentMethod/{id}" )
    Call<UserPaymentMethodDTO> get( @Path( "id" ) int id );

    @PUT( "paymentMethod/{id}" )
    Call<UserPaymentMethodDTO> update( @Path( "id" ) int id, @Body UserPaymentMethodDTO paymentMethod );

    @DELETE( "paymentMethod/{id}" )
    Call<UserPaymentMethodDTO> delete( @Path( "id" ) int id );
}
