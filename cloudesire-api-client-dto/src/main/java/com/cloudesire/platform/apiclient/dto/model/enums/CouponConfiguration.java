package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Coupon configuration for a product version" )
public enum CouponConfiguration
{
    @ApiModelProperty( "A coupon can be used to buy this plan" )
    ALLOWED,

    @ApiModelProperty( "A coupon is required to buy this plan" )
    MANDATORY,

    @ApiModelProperty( "Coupons are not allowed on this plan" )
    NOT_ALLOWED
}
