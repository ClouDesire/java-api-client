package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class SubscriptionConfigurationParameterDTO implements DTO
{
    private UrlEntityDTO configurationParameter;

    @Schema( description = "The identifier for this Configuration Parameter")
    private String code;

    @Schema( description = "The chosen value for this Configuration Parameter")
    private String value;

    @Schema( description = "The (optional) description for the Configuration Parameter chosen value")
    private String description;

    public UrlEntityDTO getConfigurationParameter()
    {
        return configurationParameter;
    }

    public void setConfigurationParameter( UrlEntityDTO configurationParameter )
    {
        this.configurationParameter = configurationParameter;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
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
}
