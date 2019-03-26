package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Whether to include or exclude IAAS costs in budget estimate" )
public enum IaasBudget
{
    @ApiModelProperty( "IAAS costs should be included" )
    INCLUDED,

    @ApiModelProperty( "IAAS costs should be excluded" )
    EXCLUDED,

    @ApiModelProperty( "Only IAAS costs should be included" )
    ONLY
}
