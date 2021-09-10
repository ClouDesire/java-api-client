package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Map;

public class ConfigurationParameterValuesDTO implements DTO
{
    private Map<String, String> values;

    public ConfigurationParameterValuesDTO( Map<String, String> values )
    {
        this.values = values;
    }

    public ConfigurationParameterValuesDTO()
    {
    }

    public Map<String, String> getValues()
    {
        return values;
    }

    public void setValues( Map<String, String> values )
    {
        this.values = values;
    }
}
