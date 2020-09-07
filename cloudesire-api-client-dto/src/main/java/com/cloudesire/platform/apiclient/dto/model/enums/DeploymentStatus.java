package com.cloudesire.platform.apiclient.dto.model.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Deployment status of a subscription" )
public enum DeploymentStatus
{
    @ApiModelProperty( "Waiting for deploy" )
    PENDING,
    DEPLOYED,
    UNDEPLOYED,
    STOPPED,
    FAILED,
    @ApiModelProperty( "Requires approval by admin" )
    REQUIRES_APPROVAL,
    @ApiModelProperty( "Undeploy request has been sent" )
    UNDEPLOY_SENT,
    @ApiModelProperty( "Requires post-configuration" )
    POST_CONFIGURATION,
    @ApiModelProperty( "Waiting for invoice payment" )
    WAITING_PAYMENT,
    @ApiModelProperty( "Invoice payment time expired" )
    PAYMENT_EXPIRED,
    @JsonEnumDefaultValue
    UNKNOWN
}
