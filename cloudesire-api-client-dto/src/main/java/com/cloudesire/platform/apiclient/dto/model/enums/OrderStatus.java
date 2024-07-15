package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum OrderStatus
{
    @Schema( description = "An upgrade order has been deferred for the next billing period")
    DEFERRED,

    @Schema( description = "The upgrade order was free of charge")
    FREE,

    @Schema( description = "The upgrade has been applied and an Invoice has been emitted")
    PAID,

    @Schema( description = "The upgrade is postponed to a later date")
    POSTPONED,

    @Schema( description = "The approval has been rejected")
    REJECTED,

    @Schema( description = "An order is waiting for approval")
    REQUIRES_APPROVAL
}
