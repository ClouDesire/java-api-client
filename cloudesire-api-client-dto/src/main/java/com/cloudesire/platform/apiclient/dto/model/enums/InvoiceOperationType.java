package com.cloudesire.platform.apiclient.dto.model.enums;

public enum InvoiceOperationType
{
    PAID, // Set the Invoice paid
    PAY, // Customer can then pay the invoice!

    /**
     * Download invoice PDF
     */
    PDF,

    /**
     * (re)generate invoice PDF
     */
    MAKE_PDF
}
