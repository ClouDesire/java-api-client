package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Consumption calculation for an extra resource" )
public enum BillingItemValueType
{
    @ApiModelProperty( "Consumption of the extra resource gets calculated every billing period" )
    PAY_AS_YOU_GO,

    @ApiModelProperty( "Consumption of the extra resource gets billed in its entirety in advance" )
    PRE_PAID,

    @ApiModelProperty( "Consumption of the extra resource gets billed at the end of the billing period" )
    POST_PAID
}
