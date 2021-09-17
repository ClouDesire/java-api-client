package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Objects;

public class ConfigurationParameterValueDTO implements DTO
{
    private String value;

    private String description;

    public ConfigurationParameterValueDTO( String value, String description )
    {
        this.value = value;
        this.description = description;
    }

    public ConfigurationParameterValueDTO()
    {
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ConfigurationParameterValueDTO that = (ConfigurationParameterValueDTO) o;
        return Objects.equals( value, that.value ) && Objects.equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( value, description );
    }
}
