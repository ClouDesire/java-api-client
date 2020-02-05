package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.PaymentMethodDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PaymentMethodApi
{
    @POST( "paymentMethod" )
    Call<PaymentMethodDTO> create( @Body PaymentMethodDTO pamymentMethod );

    @GET( "paymentMethod" )
    Call<List<PaymentMethodDTO>> getAll();

    @GET( "paymentMethod" )
    Call<List<PaymentMethodDTO>> getAll( @Query( "userId" ) Integer userId );

    @GET( "paymentMethod/{id}" )
    Call<PaymentMethodDTO> get( @Path( "id" ) int id );

    @PUT( "paymentMethod/{id}" )
    Call<PaymentMethodDTO> update( @Path( "id" ) int id, @Body PaymentMethodDTO paymentMethod );

    @DELETE( "paymentMethod/{id}" )
    Call<PaymentMethodDTO> delete( @Path( "id" ) int id );
}
