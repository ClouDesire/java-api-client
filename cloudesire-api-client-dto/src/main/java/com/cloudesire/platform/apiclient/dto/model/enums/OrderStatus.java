package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum OrderStatus
{
    @ApiModelProperty( "An upgrade order has been deferred for the next billing period" )
    DEFERRED,

    @ApiModelProperty( "The upgrade order was free of charge" )
    FREE,

    @ApiModelProperty( "The upgrade has been applied and an Invoice has been emitted" )
    PAID,

    @ApiModelProperty( "The approval has been rejected" )
    REJECTED,

    @ApiModelProperty( "An order is waiting for approval" )
    REQUIRES_APPROVAL
}
