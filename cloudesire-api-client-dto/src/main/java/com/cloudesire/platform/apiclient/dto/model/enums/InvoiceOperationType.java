package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum InvoiceOperationType
{
    @ApiModelProperty( "Set the invoice to paid" )
    PAID,

    @ApiModelProperty( "Pay the invoice" )
    PAY,

    @ApiModelProperty( "Download invoice PDF" )
    PDF,

    @ApiModelProperty( "(re)generate invoice PDF" )
    MAKE_PDF,

    @ApiModelProperty( "Reissue the invoice" )
    REISSUE
}
