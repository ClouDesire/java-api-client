package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Configuration for the presence of the Billing Item when buying a Subscription" )
public enum BillingItemPresence
{
    @Schema( description = "The Billing Item is optional")
    OPTIONAL,

    @Schema( description = "The Billing Item will be suggested for inclusion on purchase")
    RECOMMENDED,

    @Schema( description = "The Billing Item will be included in every Subscription")
    REQUIRED
}
