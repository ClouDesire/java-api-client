package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "When IAAS costs of a Product Version should be billed" )
public enum IaasBilling
{
    @ApiModelProperty( "IAAS costs should be billed in advance" )
    PRE_PAID,

    @ApiModelProperty( "IAAS costs should be billed after actual use" )
    PAY_AS_YOU_GO
}
