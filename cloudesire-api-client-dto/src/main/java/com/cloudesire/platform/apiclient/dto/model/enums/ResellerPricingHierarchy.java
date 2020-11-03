package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellerPricingHierarchy
{
    @ApiModelProperty( "Hide inherited pricings (default)" )
    THIS,

    @ApiModelProperty( "Show inherited pricings" )
    FULL
}
