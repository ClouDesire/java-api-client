package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Deployment status of a subscription" )
public enum DeploymentStatusEnum
{
    @ApiModelProperty( "Waiting for deploy" )
    PENDING,
    DEPLOYED,
    UNDEPLOYED,
    STOPPED,
    FAILED,
    @ApiModelProperty( "Requires approval by admin" )
    REQUIRES_APPROVAL,
    UNDEPLOY_SENT,
    @ApiModelProperty( "Requires post-configuration" )
    POST_CONFIGURATION,
    @ApiModelProperty( "Only for normal orders, when invoice gets paid becomes PENDING" )
    WAITING_PAYMENT,
    @ApiModelProperty( "Invoice payment time expired" )
    PAYMENT_EXPIRED
}
