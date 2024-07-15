package com.cloudesire.platform.apiclient.dto.model.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Deployment status of a subscription" )
public enum DeploymentStatus
{
    @Schema( description = "Waiting for deploy")
    PENDING,
    DEPLOYED,
    UNDEPLOYED,
    STOPPED,
    FAILED,
    POSTPONED,
    @Schema( description = "The approval has been rejected")
    REJECTED,
    @Schema( description = "Requires approval")
    REQUIRES_APPROVAL,
    @Schema( description = "Undeploy request has been sent")
    UNDEPLOY_SENT,
    @Schema( description = "Requires post-configuration")
    POST_CONFIGURATION,
    @Schema( description = "Waiting for invoice payment")
    WAITING_PAYMENT,
    @Schema( description = "Invoice payment time expired")
    PAYMENT_EXPIRED,
    @JsonEnumDefaultValue
    UNKNOWN
}
