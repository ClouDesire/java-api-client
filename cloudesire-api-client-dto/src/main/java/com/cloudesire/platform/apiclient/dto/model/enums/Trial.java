package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Trial configuration for a product version" )
public enum Trial
{
    @Schema( description = "The trial is not permitted")
    NOT_ALLOWED,

    @Schema( description = "The trial is permitted but a payment method will be asked")
    ALLOWED,

    @Schema( description = "The trial is permitted without asking for a payment method")
    ALLOWED_WO_PAYMENT_METHOD
}
