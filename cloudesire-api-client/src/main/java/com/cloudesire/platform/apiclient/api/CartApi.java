package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CartDTO;
import com.cloudesire.platform.apiclient.query.CartQuery;
import com.cloudesire.platform.apiclient.query.ResellerCatalogQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

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

    @GET( "cart/{id}" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCsv( @Path( "id" ) int id );

    @PUT( "cart/{id}" )
    Call<CartDTO> update( @Path( "id" ) int id, @Body CartDTO cart );

    @POST( "cart/{id}/checkout" )
    Call<Void> checkout( @Path( "id" ) int id );

    @POST( "cart/{id}/copy" )
    Call<Void> copy( @Path( "id" ) int id );

    @DELETE( "cart/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @GET( "cart/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id );

    @PUT( "cart/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @DELETE( "cart/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );
}
