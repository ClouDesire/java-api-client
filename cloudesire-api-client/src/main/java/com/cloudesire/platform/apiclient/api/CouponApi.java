package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.query.CouponFetchQuery;
import com.cloudesire.platform.apiclient.query.CouponGeneratorQuery;
import com.cloudesire.platform.apiclient.query.CouponQuery;
import com.cloudesire.platform.apiclient.query.CouponTrialQuery;
import com.cloudesire.platform.apiclient.dto.model.dto.CouponDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.CouponPatchDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface CouponApi
{
    @POST( "coupon" )
    Call<List<CouponDTO>> generate( @QueryMap CouponQuery query );

    @POST( "coupon" )
    Call<CouponDTO> generate( @QueryMap CouponTrialQuery query );

    @POST( "coupon" )
    Call<CouponDTO> generateGenerator( @QueryMap CouponGeneratorQuery query );

    @GET( "coupon" )
    Call<List<CouponDTO>> getAll( @QueryMap CouponFetchQuery query );

    @Streaming
    @GET( "coupon" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap CouponFetchQuery query );

    @GET( "coupon/{id}" )
    Call<CouponDTO> get( @Path( "id" ) Integer id );

    @GET( "coupon/hash={hash}" )
    Call<CouponDTO> retrieveByHash( @Path( "hash" ) String hash );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body CouponPatchDTO actions );

    @PATCH( "coupon/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body CouponPatchDTO actions, @QueryMap Map<String, String> queryMap );

    @DELETE( "coupon/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );
}
