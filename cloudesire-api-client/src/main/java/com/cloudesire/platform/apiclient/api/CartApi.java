package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CartDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface CartApi
{
    @POST( "cart" )
    Call<CartDTO> create( @Body CartDTO cart );

    @GET( "cart" )
    Call<List<CartDTO>> getAll();

    @GET( "cart/{id}" )
    Call<CartDTO> get( @Path( "id" ) int id );

    @PUT( "cart/{id}" )
    Call<CartDTO> update( @Path( "id" ) int id, @Body CartDTO cart );

    @DELETE( "cart/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
