package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.ISO8601Date;
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
import java.util.List;
import java.util.Map;

public interface CouponApi
{
    @DELETE( "coupon/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    /*
        List<CouponDTO> generate( Integer howMany, String type, Integer productVersion, Integer product, Date expirationDate,
            Boolean licenseOnly, BigDecimal number ) throws RestException;
    */
    @POST( "coupon" )
    Call<List<CouponDTO>> generateList( @Query( "howMany" ) Integer howMany, @Query( "type" ) String type,
            @Query( "productVersion" ) Integer productVersion, @Query( "product" ) Integer product,
            @Query( "expiration" ) ISO8601Date expiration, @Query( "licenseOnly" ) Boolean licenseOnly,
            @Query( "number" ) Integer number );

    /*
    CouponDTO generateExtendedTrial( Integer productVersion, Integer product, Date expiration, int days, BigDecimal plafond )
            throws RestException;
    */
    @POST( "coupon" )
    Call<CouponDTO> generateExtendedTrial( @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product, @Query( "expiration" ) ISO8601Date expiration,
            @Query( "days" ) Integer days, @Query( "plafond" ) BigDecimal plafond );

    /*
    CouponDTO generate( CouponType type, String code, Integer productVersion, Integer product, Date expiration,
            Boolean licenseOnly, BigDecimal value ) throws RestException;
     */
    @POST( "coupon" )
    Call<CouponDTO> generate( @Query( "type" ) String type, @Query( "code" ) String code,
            @Query( "productVersion" ) Integer productVersion, @Query( "product" ) Integer product,
            @Query( "expiration" ) ISO8601Date expiration, @Query( "licenseOnly" ) Boolean licenseOnly,
            @Query( "value" ) BigDecimal value );

    @GET( "coupon/{id}" )
    Call<CouponDTO> get( @Path( "id" ) Integer id );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "coupon/hash={hash}" )
    Call<CouponDTO> retrieveByHash( @Path( "hash" ) String hash );

    /*
        RestResult<List<CouponDTO>> retrieve( PageRequestDTO page, String type, Integer product, Date expiringAfter,
            Boolean unused ) throws RestException;
     */

    @GET( "coupon" )
    Call<List<CouponDTO>> getAll( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "product" ) Integer product, @Query( "createdAfter" ) ISO8601Date createdAfter,
            @Query( "unused" ) Boolean unused );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest, @Query( "type" ) String type,
            @Query( "product" ) Integer product, @Query( "createdAfter" ) ISO8601Date createdAfter,
            @Query( "unused" ) Boolean unused );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
