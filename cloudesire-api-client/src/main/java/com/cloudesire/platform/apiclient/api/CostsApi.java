package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CostDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CostsApi
{
    @GET( "costs" )
    Call<List<CostDTO>> getAll();
}
