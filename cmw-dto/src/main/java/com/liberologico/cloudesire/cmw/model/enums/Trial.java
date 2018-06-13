package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "Trial configuration for a product version" )
public enum Trial
{
    @ApiModelProperty( "The trial is not permitted" )
    NOT_ALLOWED,

    @ApiModelProperty( "The trial is permitted but a payment method will be asked" )
    ALLOWED,

    @ApiModelProperty( "The trial is permitted without asking for a payment method" )
    ALLOWED_WO_PAYMENT_METHOD
}
