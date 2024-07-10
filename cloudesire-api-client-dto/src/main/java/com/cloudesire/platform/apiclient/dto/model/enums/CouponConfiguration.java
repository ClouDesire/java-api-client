package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Coupon configuration for a product version" )
public enum CouponConfiguration
{
    @Schema( description = "A coupon can be used to buy this plan")
    ALLOWED,

    @Schema( description = "A coupon is required to buy this plan")
    MANDATORY,

    @Schema( description = "Coupons are not allowed on this plan")
    NOT_ALLOWED
}
