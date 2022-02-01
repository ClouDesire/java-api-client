package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResellerPricingListing
{
    @ApiModelProperty( "Reseller Pricing is listed but not published" )
    DRAFT,

    @ApiModelProperty( "Reseller Pricing is listed and published" )
    PUBLISHED,

    @ApiModelProperty( "Reseller Pricing is neither listed or published" )
    DEPRECATED
}
