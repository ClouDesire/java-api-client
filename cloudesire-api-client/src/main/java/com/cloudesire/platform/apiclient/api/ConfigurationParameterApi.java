package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ConfigurationParameterDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ConfigurationParameterApi
{
    @GET( "configurationParameter/{id}" )
    Call<ConfigurationParameterDTO> get( @Path( "id" ) int id );
}
