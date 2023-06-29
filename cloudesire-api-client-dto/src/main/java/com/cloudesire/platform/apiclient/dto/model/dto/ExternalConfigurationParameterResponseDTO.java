package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class ExternalConfigurationParameterResponseDTO implements DTO
{
    private List<ConfigurationParameterValueDTO> values;

    public ExternalConfigurationParameterResponseDTO( String k1, String v1, String k2, String v2 )
    {
        this.values = List.of(
                new ConfigurationParameterValueDTO( k1, v1 ), new ConfigurationParameterValueDTO( k2, v2 )
        );
    }

    public ExternalConfigurationParameterResponseDTO( String k1, String v1 )
    {
        this.values = List.of( new ConfigurationParameterValueDTO( k1, v1 ) );
    }

    public ExternalConfigurationParameterResponseDTO( List<ConfigurationParameterValueDTO> values )
    {
        this.values = values;
    }

    public ExternalConfigurationParameterResponseDTO()
    {
    }

    public List<ConfigurationParameterValueDTO> getValues()
    {
        return values;
    }

    public void setValues( List<ConfigurationParameterValueDTO> values )
    {
        this.values = values;
    }
}
