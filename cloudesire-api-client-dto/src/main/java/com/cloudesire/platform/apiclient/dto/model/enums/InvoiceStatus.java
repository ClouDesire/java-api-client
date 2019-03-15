package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Invoice payment status" )
public enum InvoiceStatus
{
    @ApiModelProperty( "Payment required" ) UNPAID,
    @ApiModelProperty( "Payment processing" ) PENDING,
    @ApiModelProperty( "Payment successfull" ) PAID
}
