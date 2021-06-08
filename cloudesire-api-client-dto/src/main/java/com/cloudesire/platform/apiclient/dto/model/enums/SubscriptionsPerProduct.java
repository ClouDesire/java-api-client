package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum SubscriptionsPerProduct
{
    @ApiModelProperty( "One subscription per product for a whole company at a time is allowed" )
    ONE,

    @ApiModelProperty( "One subscription per product for a company group at a time is allowed" )
    ONE_PER_COMPANY_GROUP,

    @ApiModelProperty( "Only one trial per product" )
    TRIAL,

    @ApiModelProperty( "No check is done" )
    UNLIMITED
}
