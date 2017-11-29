package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CouponDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface CouponApi
{
    @DELETE( "coupon/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @POST( "coupon" )
    Call<CouponDTO> create( @Query( "type" ) String type, @Query( "expiration" ) Date expiration,
            @Query( "value" ) BigDecimal value, @Query( "code" ) String code,
            @Query( "productVersion" ) Integer productVersion, @Query( "product" ) Integer product,
            @Query( "licenseOnly" ) Boolean licenseOnly, @Query( "reusable" ) Boolean reusable );

    @GET( "coupon/{id}" )
    Call<CouponDTO> get( @Path( "id" ) Integer id );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "coupon/hash={hash}" )
    Call<CouponDTO> retrieveByHash( @Path( "hash" ) String hash );

    @GET( "coupon" )
    Call<List<CouponDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "product" ) Integer product, @Query( "createdAfter" ) Date createdAfter,
            @Query( "unused" ) Boolean unused );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "product" ) Integer product, @Query( "createdAfter" ) Date createdAfter,
            @Query( "unused" ) Boolean unused );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
