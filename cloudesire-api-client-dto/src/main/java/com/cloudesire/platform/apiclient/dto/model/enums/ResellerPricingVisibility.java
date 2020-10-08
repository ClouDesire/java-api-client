package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellerPricingVisibility
{
    @ApiModelProperty( "Pricing is not visible to customer" )
    EXCLUDED,

    @ApiModelProperty( "Pricing is visible to customer, but not available for buy" )
    INCLUDED,

    @ApiModelProperty( "Pricing is available for buy" )
    PRICED
}
