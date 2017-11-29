package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.RiskProfileDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface RiskProfileApi
{
    @GET( "riskProfile" )
    Call<List<RiskProfileDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "riskProfile/{id}" )
    Call<RiskProfileDTO> get( @Path("id") int id );
}
