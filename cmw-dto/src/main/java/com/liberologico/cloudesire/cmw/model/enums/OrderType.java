package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Which kind of order")
public enum OrderType
{
    @ApiModelProperty( "Buy a product" )
    NORMAL,
    @ApiModelProperty( "Trial for a product" )
    TRIAL,
    @ApiModelProperty( "Test mode for vendors" )
    SANDBOX,
    @ApiModelProperty( value = "Deprecated", hidden = true )
    UPGRADE,
    @ApiModelProperty( "Change values for the available Billing Item" )
    BILLING_ITEM_UPGRADE,
    @ApiModelProperty( "Renew an active subscription" )
    RENEWAL,
    @ApiModelProperty( "An order without expiration" )
    UNMANAGED,
    @ApiModelProperty( "Request termination of an active subscription" )
    TERMINATION,
    @ApiModelProperty( "Add unmanaged costs to an active subscription" )
    UPSELL,
    @ApiModelProperty( "Upgrade disk space, only for managed products" )
    DISK_UPGRADE,
    @ApiModelProperty( "Plan upgrade, only for syndicated products" )
    SYNDICATED_UPGRADE
}
