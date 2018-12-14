package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum CouponDestination
{
    @ApiModelProperty( "The coupon applies to the license cost only" )
    LICENSE_ONLY,

    @ApiModelProperty( "The coupon applies to the license cost and every extra resource" )
    LICENSE_AND_EXTRAS,

    @ApiModelProperty( "The coupon applies on every cost line" )
    TOTAL
}
