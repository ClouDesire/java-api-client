package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Consumption calculation for an extra resource" )
public enum BillingItemValueType
{
    @Schema( description = "Consumption of the extra resource gets calculated every billing period")
    PAY_AS_YOU_GO,

    @Schema( description = "Consumption of the extra resource gets billed in its entirety in advance")
    PRE_PAID,

    @Schema( description = "Consumption of the extra resource gets billed at the end of the billing period")
    POST_PAID
}
