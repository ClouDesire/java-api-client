package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ResellingConfigurationType
{
    @Schema( description = "The value is a percentage on the previous price of the selling chain")
    PERCENTAGE,

    @Schema( description = "The value is a price")
    VALUE
}
