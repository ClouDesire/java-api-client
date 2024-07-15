package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Invoice payment status" )
public enum InvoiceStatus
{
    @Schema( description = "Payment required") UNPAID,
    @Schema( description = "Payment processing") PENDING,
    @Schema( description = "Payment will be executed later") DELAYED,
    @Schema( description = "Payment is waiting for user authentication") REQUIRES_ACTION,
    @Schema( description = "Payment is authorized") REQUIRES_CAPTURE,
    @Schema( description = "Payment expired") EXPIRED,
    @Schema( description = "Payment received") PAID;

    public static InvoiceStatus[] paid()
    {
        return new InvoiceStatus[] { DELAYED, PAID };
    }

    public static InvoiceStatus[] unpaid()
    {
        return new InvoiceStatus[] { PENDING, REQUIRES_ACTION, REQUIRES_CAPTURE, UNPAID, EXPIRED };
    }
}
