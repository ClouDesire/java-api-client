package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Pricing model of an extra resource" )
public enum BillingItemType
{
    VOLUME,
    STAIRSTEP,
    TIERED
}
