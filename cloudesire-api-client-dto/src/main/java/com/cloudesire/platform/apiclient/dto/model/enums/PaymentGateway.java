package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "How the customer can pay" )
public enum PaymentGateway
{
    @ApiModelProperty( "PayPal payment gateway" )
    PAYPAL,

    @ApiModelProperty( "Stripe credit card" )
    STRIPE,

    @ApiModelProperty( "Stripe SEPA direct debit" )
    STRIPE_SEPA,

    @ApiModelProperty( "Archive the customer's IBAN on his profile for offline usage" )
    IBAN,

    @ApiModelProperty( "Pay offline" )
    MANUAL
}
