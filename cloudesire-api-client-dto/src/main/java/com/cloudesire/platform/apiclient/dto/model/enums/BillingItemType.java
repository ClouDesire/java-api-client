package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "Pricing model of an extra resource" )
public enum BillingItemType
{
    VOLUME,
    STAIRSTEP,
    TIERED
}
