package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Which kind of order" )
public enum OrderType
{
    @Schema( description = "Buy a product")
    NORMAL,
    @Schema( description = "Trial for a product")
    TRIAL,
    @Schema( description = "Test mode for vendors")
    SANDBOX,
    @Hidden
    UPGRADE,
    @Schema( description = "Change values for the available Billing Item")
    BILLING_ITEM_UPGRADE,
    @Hidden
    MONTHLY,
    @Schema( description = "Renew an active subscription")
    RENEWAL,
    @Schema( description = "An order without expiration")
    UNMANAGED,
    @Schema( description = "Request termination of an active subscription")
    TERMINATION,
    @Schema( description = "Stop auto-renewing a subscription")
    UNSUBSCRIBE,
    @Schema( description = "Add one-off costs to an active subscription")
    ONESHOT_COSTS,
    @Schema( description = "Add recurring costs to an active subscription")
    RECURRING_COSTS,
    @Schema( description = "Add unmanaged costs to an active subscription")
    UPSELL,
    @Schema( description = "As UPSELL, but receives lines in chunks")
    CHUNKED,
    @Schema( description = "Refund costs for an active subscription")
    REFUND,
    @Schema( description = "Upgrade disk space, only for managed products")
    DISK_UPGRADE,
    @Schema( description = "Plan upgrade, only for syndicated products")
    SYNDICATED_UPGRADE,
    @Schema( description = "Estimate the total costs of a subscription")
    ESTIMATE
}
