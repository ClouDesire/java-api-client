package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum CouponDestination
{
    @Schema( description = "The coupon applies to the license cost only")
    LICENSE_ONLY,

    @Schema( description = "The coupon applies to the license cost and every extra resource")
    LICENSE_AND_EXTRAS,

    @Schema( description = "The coupon applies on every cost line")
    TOTAL
}
