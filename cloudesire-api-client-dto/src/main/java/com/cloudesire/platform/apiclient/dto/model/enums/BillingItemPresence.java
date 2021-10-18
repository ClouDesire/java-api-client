package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Configuration for the presence of the Billing Item when buying a Subscription" )
public enum BillingItemPresence
{
    @ApiModelProperty( "The Billing Item is optional" )
    OPTIONAL,

    @ApiModelProperty( "The Billing Item will be suggested for inclusion on purchase" )
    RECOMMENDED,

    @ApiModelProperty( "The Billing Item will be included in every Subscription" )
    REQUIRED
}
