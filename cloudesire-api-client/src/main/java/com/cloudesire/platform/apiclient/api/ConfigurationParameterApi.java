package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ConfigurationParameterDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ConfigurationParameterValuesDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.request.ExternalConfigurationParameterValuesRequestDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface ConfigurationParameterApi
{
    @GET( "configurationParameter" )
    Call<List<ConfigurationParameterDTO>> getAllForProduct( @Query( "productId" ) int productId );

    @GET( "configurationParameter/{id}" )
    Call<ConfigurationParameterDTO> get( @Path( "id" ) int id );

    @POST( "configurationParameter/{id}/values" )
    Call<ConfigurationParameterValuesDTO> getValues( @Path( "id" ) int id,
            @Body ExternalConfigurationParameterValuesRequestDTO input );
}
