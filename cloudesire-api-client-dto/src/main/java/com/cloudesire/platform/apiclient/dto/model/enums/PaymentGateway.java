package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "How the customer can pay" )
public enum PaymentGateway
{
    @Schema( description = "PayPal payment gateway", hidden = true )
    @Deprecated
    PAYPAL,

    @Schema( description = "Stripe credit card")
    STRIPE,

    @Schema( description = "Stripe SEPA direct debit")
    STRIPE_SEPA,

    @Schema( description = "Archive the customer's IBAN on his profile for offline usage")
    IBAN,

    @Schema( description = "Pay offline")
    MANUAL
}
