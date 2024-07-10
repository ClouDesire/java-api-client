package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum CustomInvoiceType
{
    @Schema( description = "The customer has to pay for the custom invoice")
    UPSELL,

    @Schema( description = "As in UPSELL, but the invoice can receive new lines before being marked for completion")
    CHUNKED,

    @Schema( description = "The total amount of the custom invoice has already been collected outside the platform")
    CASHED,

    @Schema( description = "The custom invoice is a partial or total refund of a previous one")
    REFUND
}
