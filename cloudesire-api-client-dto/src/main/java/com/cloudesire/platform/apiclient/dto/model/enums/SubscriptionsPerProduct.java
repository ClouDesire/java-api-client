package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum SubscriptionsPerProduct
{
    @ApiModelProperty( "One subscription per product at a time is allowed" )
    ONE,

    @ApiModelProperty( "Only one trial per product" )
    TRIAL,

    @ApiModelProperty( "No check is done" )
    UNLIMITED
}
