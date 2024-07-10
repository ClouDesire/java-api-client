package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ResellerPricingHierarchy
{
    @Schema( description = "Hide inherited pricings (default)")
    THIS,

    @Schema( description = "Show inherited pricings")
    FULL
}
