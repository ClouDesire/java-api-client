package com.cloudesire.platform.apiclient.dto.model.enums;

public enum PaymentGateway
{
    /**
     * PayPal payment gateway
     */
    PAYPAL,

    /**
     * Stripe credit card
     */
    STRIPE,

    /**
     * Stripe SEPA direct debit
     */
    STRIPE_SEPA,

    /**
     * Directly save the customer's IBAN on his profile
     */
    IBAN
}
