package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CostDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.CostDescriptionDTO;
import com.cloudesire.platform.apiclient.query.CostsQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;

public interface CostsApi
{
    @GET( "costs" )
    Call<List<CostDTO>> getAll();

    @GET( "costs" )
    Call<List<CostDTO>> getAll( @QueryMap CostsQuery query );

    @GET( "costs" )
    @Headers( { "Accept:text/csv" } )
    @Streaming
    Call<ResponseBody> getCsv( @QueryMap CostsQuery query );

    @Deprecated
    @GET( "costs/description/custom" )
    Call<CostDescriptionDTO> getCustomCostDescription( @Query( "identifier" ) String identifier );

    @GET( "costs/tags/keys" )
    Call<List<String>> getCustomerTagsKeys();

    @GET( "costs/tags/{key}/values" )
    Call<List<String>> getCustomerTagsValues( @Path( "key" ) String key );
}
