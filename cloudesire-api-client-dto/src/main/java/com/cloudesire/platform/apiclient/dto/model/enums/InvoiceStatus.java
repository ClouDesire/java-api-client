package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Invoice payment status" )
public enum InvoiceStatus
{
    @ApiModelProperty( "Payment required" ) UNPAID,
    @ApiModelProperty( "Payment processing" ) PENDING,
    @ApiModelProperty( "Payment will be executed later" ) DELAYED,
    @ApiModelProperty( "Payment is waiting for user authentication" ) REQUIRES_ACTION,
    @ApiModelProperty( "Payment is authorized" ) REQUIRES_CAPTURE,
    @ApiModelProperty( "Payment expired" ) EXPIRED,
    @ApiModelProperty( "Payment received" ) PAID;

    public static InvoiceStatus[] unpaid()
    {
        return new InvoiceStatus[] { PENDING, REQUIRES_ACTION, REQUIRES_CAPTURE, UNPAID, EXPIRED };
    }
}
