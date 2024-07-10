package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "The destination of the event" )
public enum EventRecipientType
{
    @Schema( description = "The event recipient is an endpoint defined by the vendor")
    COMPANY,
    @Schema( description = "The event recipient is an endpoint relative to the product")
    PRODUCT,
    @Schema( description = "The event recipient is a platform endpoint")
    PLATFORM
}
