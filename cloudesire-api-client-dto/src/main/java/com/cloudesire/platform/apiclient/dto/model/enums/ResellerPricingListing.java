package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ResellerPricingListing
{
    @Schema( description = "Reseller Pricing is listed but not published")
    DRAFT,

    @Schema( description = "Reseller Pricing is listed and published")
    PUBLISHED,

    @Schema( description = "Reseller Pricing is neither listed or published")
    DEPRECATED
}
