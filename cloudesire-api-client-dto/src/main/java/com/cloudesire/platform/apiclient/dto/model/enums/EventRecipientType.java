package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "The destination of the event" )
public enum EventRecipientType
{
    @ApiModelProperty( "The event recipient is an endpoint defined by the vendor" )
    COMPANY,
    @ApiModelProperty( "The event recipient is a platform endpoint" )
    PLATFORM
}
