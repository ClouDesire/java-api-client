package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ResellerPricingVisibility
{
    @Schema( description = "Product Version is not visible to customer, but is buyable through a reseller")
    EXCLUDED,

    @Schema( description = "Product Version is visible to customer, but not available for buy")
    INCLUDED,

    @Schema( description = "Product Version is available for buy")
    PRICED
}
