package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

public class SubscriptionConfigurationParameterDTO implements DTO
{
    private UrlEntityDTO configurationParameter;

    @ApiModelProperty( "The chosen value for this Configuration Parameter" )
    private String value;

    @ApiModelProperty( "The (optional) description for the Configuration Parameter chosen value" )
    private String description;

    public UrlEntityDTO getConfigurationParameter()
    {
        return configurationParameter;
    }

    public void setConfigurationParameter( UrlEntityDTO configurationParameter )
    {
        this.configurationParameter = configurationParameter;
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
