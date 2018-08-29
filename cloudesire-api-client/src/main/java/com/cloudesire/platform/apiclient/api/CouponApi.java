package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.ISO8601Date;
import com.cloudesire.platform.apiclient.ISO8601DateTime;
import com.cloudesire.platform.apiclient.query.CouponQuery;
import com.liberologico.cloudesire.cmw.model.dto.CouponDTO;
import com.liberologico.cloudesire.cmw.model.enums.CouponDestination;
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
import java.util.Map;

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
    Call<List<CouponDTO>> generate( @Query( "type" ) String type, @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product, @Query( "expirationDate" ) ISO8601DateTime expiration,
            @Query( "licenseOnly" ) Boolean licenseOnly, @Query( "number" ) BigDecimal number,
            @Query( "howMany" ) Integer howMany );

    @POST( "coupon" )
    Call<CouponDTO> generateGenerator( @QueryMap CouponQuery query );

    /**
     * @deprecated by {@link #generateGenerator(CouponQuery)}
     */
    @Deprecated
    @POST( "coupon" )
    Call<CouponDTO> generate( @Query( "type" ) String type, @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product, @Query( "expiration" ) ISO8601DateTime expiration,
            @Query( "licenseOnly" ) Boolean licenseOnly, @Query( "code" ) String code,
            @Query( "value" ) BigDecimal value );

    @POST( "coupon" )
    Call<CouponDTO> generate( @Query( "type" ) String type, @Query( "productVersion" ) Integer productVersion,
            @Query( "product" ) Integer product, @Query( "expirationDate" ) ISO8601DateTime expiration,
            @Query( "days" ) Integer days, @Query( "plafond" ) BigDecimal plafond );

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

    /**
     * @deprecated by {@link #partialUpdate(Integer, CouponPatchDTO, String)}
     */
    @Deprecated
    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object actions, @Query( "language" ) String language );

    @GET( "coupon/{id}" )
    Call<CouponDTO> get( @Path( "id" ) Integer id );

    @GET( "coupon/hash={hash}" )
    Call<CouponDTO> retrieveByHash( @Path( "hash" ) String hash );

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
