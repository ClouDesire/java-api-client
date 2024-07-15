package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "When IAAS costs of a Product Version should be billed" )
public enum IaasBilling
{
    @Schema( description = "IAAS costs should be billed in advance")
    PRE_PAID,

    @Schema( description = "IAAS costs should be billed after actual use")
    PAY_AS_YOU_GO
}
