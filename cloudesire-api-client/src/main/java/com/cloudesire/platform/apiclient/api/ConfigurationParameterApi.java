package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ConfigurationParameterDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ConfigurationParameterApi
{
    @GET( "configurationParameter/{id}" )
    Call<ConfigurationParameterDTO> get( @Path( "id" ) int id );
}
