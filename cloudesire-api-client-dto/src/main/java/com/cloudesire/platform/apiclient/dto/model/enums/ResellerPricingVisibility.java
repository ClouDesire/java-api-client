package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellerPricingVisibility
{
    @ApiModelProperty( "Product Version is not visible to customer" )
    EXCLUDED,

    @ApiModelProperty( "Product Version is visible to customer, but not available for buy" )
    INCLUDED,

    @ApiModelProperty( "Product Version is available for buy" )
    PRICED
}
