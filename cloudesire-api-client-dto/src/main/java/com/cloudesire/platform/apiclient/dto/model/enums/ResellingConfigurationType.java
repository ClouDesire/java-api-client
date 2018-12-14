package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellingConfigurationType
{
    @ApiModelProperty( "The value is a percentage on the previous price of the selling chain" )
    PERCENTAGE,

    @ApiModelProperty( "The value is a price" )
    VALUE
}
