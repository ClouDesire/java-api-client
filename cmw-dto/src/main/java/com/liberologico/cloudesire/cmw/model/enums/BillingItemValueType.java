package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Consumption calculation for an extra resource" )
public enum BillingItemValueType
{
    @ApiModelProperty( "Consumption of the extra resource gets calculated every billing period" )
    PAY_AS_YOU_GO,

    @ApiModelProperty( "Consumption of the extra resource gets billed in its entirety in advance" )
    PRE_PAID
}
