package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.OrderDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.OrderInputDTO;
import com.cloudesire.platform.apiclient.query.OrderQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface OrderApi
{
    @POST( "order" )
    Call<OrderDTO> create( @Body OrderInputDTO input );

    @DELETE( "order/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "order" )
    Call<List<OrderDTO>> getAll();

    @GET( "order" )
    Call<List<OrderDTO>> getAll( @QueryMap OrderQuery query );

    /**
     * @deprecated by {@link #getAll(OrderQuery)}
     */
    @Deprecated
    @GET( "order" )
    Call<List<OrderDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    /**
     * @deprecated by {@link #getAll(OrderQuery)}
     */
    @Deprecated
    @GET( "order" )
    Call<List<OrderDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "buyerEmail" ) String buyerEmail, @Query( "coupon" ) Boolean coupon );

    @GET( "order" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCsv();

    @GET( "order" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCsv( @QueryMap OrderQuery query );

    @GET( "order/externalReference={externalReference}" )
    Call<OrderDTO> getByExternalReference( @Path( "externalReference" ) String externalReference );

    @GET( "order/{id}" )
    Call<OrderDTO> get( @Path( "id" ) Integer id );

    @POST( "order/{id}/notify" )
    Call<Void> notify( @Path( "id" ) Integer id );

    /**
     * @deprecated by {@link #getCsv(OrderQuery)}
     */
    @Deprecated
    @Streaming
    @GET( "order" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "buyerEmail" ) String buyerEmail, @Query( "coupon" ) Boolean coupon );

    /**
     * @deprecated by {@link #getCsv(OrderQuery)}
     */
    @Deprecated
    @Streaming
    @GET( "order" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
