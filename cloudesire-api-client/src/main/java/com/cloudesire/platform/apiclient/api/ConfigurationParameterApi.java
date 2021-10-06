package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ConfigurationParameterDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ConfigurationParameterValuesDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ExternalConfigurationParameterValuesRequestDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ConfigurationParameterApi
{
    @GET( "configurationParameter/{id}" )
    Call<ConfigurationParameterDTO> get( @Path( "id" ) int id );

    @POST( "configurationParameter/{id}/values" )
    Call<ConfigurationParameterValuesDTO> getValues( @Path( "id" ) int id,
            @Body ExternalConfigurationParameterValuesRequestDTO input );
}
