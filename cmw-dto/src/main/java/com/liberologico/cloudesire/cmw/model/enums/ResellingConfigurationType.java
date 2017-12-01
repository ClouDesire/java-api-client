package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellingConfigurationType
{
    @ApiModelProperty( "The value is a percentage on the original price" )
    PERCENTAGE,

    @ApiModelProperty( "The value is a new price" )
    VALUE
}
