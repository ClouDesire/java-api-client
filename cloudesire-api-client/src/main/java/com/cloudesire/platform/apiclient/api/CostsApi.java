package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CostDTO;
import com.cloudesire.platform.apiclient.query.CostsQuery;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;

public interface CostsApi
{
    @GET( "costs" )
    Call<List<CostDTO>> getAll();

    @GET( "costs" )
    Call<List<CostDTO>> getAll( @QueryMap CostsQuery query );

    @GET( "costs/description/custom/{identifier}" )
    Call<String> getCustomCostDescription( @Path( "identifier" ) String identifier );
}
