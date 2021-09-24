package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;
import java.util.Objects;

public class ConfigurationParameterValuesDTO implements DTO
{
    private List<ConfigurationParameterValueDTO> values;

    public ConfigurationParameterValuesDTO( List<ConfigurationParameterValueDTO> values )
    {
        this.values = values;
    }

    public ConfigurationParameterValuesDTO()
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ConfigurationParameterValuesDTO that = (ConfigurationParameterValuesDTO) o;
        return Objects.equals( values, that.values );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( values );
    }
}
