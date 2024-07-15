package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum InvoiceOperationType
{
    @Schema( description = "Set the invoice to paid")
    PAID,

    @Schema( description = "Pay the invoice")
    PAY,

    @Schema( description = "Download invoice PDF")
    PDF,

    @Schema( description = "(re)generate invoice PDF")
    MAKE_PDF,

    @Schema( description = "Reissue the invoice")
    REISSUE
}
