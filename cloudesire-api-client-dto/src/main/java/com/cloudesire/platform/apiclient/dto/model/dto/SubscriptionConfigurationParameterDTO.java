package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

public class SubscriptionConfigurationParameterDTO implements DTO
{
    private UrlEntityDTO configurationParameter;

    @ApiModelProperty( "The current value for this billing item" )
    private String value;

    @ApiModelProperty( "Whether the billing item has been already bought for the Subscription" )
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