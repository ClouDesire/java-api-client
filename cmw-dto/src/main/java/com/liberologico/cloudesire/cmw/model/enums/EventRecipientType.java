package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "If the destination of the event is a company or a platform endpoint" )
public enum EventRecipientType
{
    @ApiModelProperty( "The event recipient is an endpoint defined by the vendor" )
    COMPANY,
    @ApiModelProperty( "The event recipient is a platform endpoint" )
    PLATFORM
}
