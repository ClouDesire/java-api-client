package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum CustomInvoiceType
{
    @ApiModelProperty( "The customer has to pay for the custom invoice" )
    UPSELL,

    @ApiModelProperty( "The total amount of the custom invoice has already been collected outside the platform" )
    CASHED,

    @ApiModelProperty( "The custom invoice is a partial or total refund of a previous one" )
    REFUND
}
