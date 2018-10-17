package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.ISO8601DateTime;
import com.cloudesire.platform.apiclient.query.CouponFetchQuery;
import com.cloudesire.platform.apiclient.query.CouponGeneratorQuery;
import com.cloudesire.platform.apiclient.query.CouponQuery;
import com.cloudesire.platform.apiclient.query.CouponTrialQuery;
import com.liberologico.cloudesire.cmw.model.dto.CouponDTO;
import com.liberologico.cloudesire.cmw.model.enums.CouponType;
import com.liberologico.cloudesire.cmw.model.patch.CouponPatchDTO;
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

public interface CouponApi
{
    @DELETE( "coupon/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @POST( "coupon" )
    Call<List<CouponDTO>> generate( @QueryMap CouponQuery query );

    /**
     * @deprecated by {@link #generate(CouponQuery)}
     */
    @Deprecated
    @POST( "coupon" )
    Call<List<CouponDTO>> generate(
            @Query( "type" ) CouponType type,
            @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product,
            @Query( "expirationDate" ) ISO8601DateTime expiration,
            @Query( "licenseOnly" ) Boolean licenseOnly,
            @Query( "number" ) BigDecimal number,
            @Query( "howMany" ) Integer howMany );

    @POST( "coupon" )
    Call<CouponDTO> generateGenerator( @QueryMap CouponGeneratorQuery query );

    /**
     * @deprecated by {@link #generate(CouponTrialQuery)}
     */
    @Deprecated
    @POST( "coupon" )
    Call<CouponDTO> generate( @Query( "type" ) CouponType type, @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product, @Query( "expirationDate" ) ISO8601DateTime expiration,
            @Query( "days" ) Integer days, @Query( "plafond" ) BigDecimal plafond );

    @POST( "coupon" )
    Call<CouponDTO> generate( @QueryMap CouponTrialQuery query );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body CouponPatchDTO actions );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body CouponPatchDTO actions, @Query( "language" ) String language );

    /**
     * @deprecated by {@link #partialUpdate(Integer, CouponPatchDTO)}
     */
    @Deprecated
    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object actions );

    @GET( "coupon/{id}" )
    Call<CouponDTO> get( @Path( "id" ) Integer id );

    @GET( "coupon/hash={hash}" )
    Call<CouponDTO> retrieveByHash( @Path( "hash" ) String hash );

    @GET( "coupon" )
    Call<List<CouponDTO>> getAll( @QueryMap CouponFetchQuery query );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap CouponFetchQuery query );
}
