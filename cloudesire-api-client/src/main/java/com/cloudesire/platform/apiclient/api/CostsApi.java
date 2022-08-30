package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CostDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.CostDescriptionDTO;
import com.cloudesire.platform.apiclient.query.CostsQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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

    @GET( "costs/description/custom" )
    Call<CostDescriptionDTO> getCustomCostDescription( @Query( "identifier" ) String identifier );
}
