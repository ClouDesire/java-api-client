package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CartDTO;
import com.cloudesire.platform.apiclient.query.CartQuery;
import com.cloudesire.platform.apiclient.query.ResellerCatalogQuery;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;

public interface CartApi
{
    @POST( "cart" )
    Call<CartDTO> create( @Body CartDTO cart );

    @POST( "cart" )
    Call<CartDTO> create( @Body CartDTO cart, @QueryMap ResellerCatalogQuery query );

    @GET( "cart" )
    Call<List<CartDTO>> getAll();

    @GET( "cart" )
    Call<List<CartDTO>> getAll( @QueryMap CartQuery query );

    /**
     * @deprecated by {@link #getAll(CartQuery)}
     */
    @Deprecated
    @GET( "cart" )
    Call<List<CartDTO>> getAll( @Query( "customerId" ) int customerId );

    @GET( "cart/{id}" )
    Call<CartDTO> get( @Path( "id" ) int id );

    @PUT( "cart/{id}" )
    Call<CartDTO> update( @Path( "id" ) int id, @Body CartDTO cart );

    @POST( "cart/{id}/checkout" )
    Call<Void> checkout( @Path( "id" ) int id );

    @DELETE( "cart/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
