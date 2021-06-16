package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum SubscriptionsPerProduct
{
    @ApiModelProperty( "One subscription per product per user, regardless of company, at a time is allowed" )
    ONE_PER_USER( true ),

    @ApiModelProperty( "One subscription per product for a whole company at a time is allowed" )
    ONE_PER_COMPANY( true ),

    @ApiModelProperty( "One subscription per product for a company group at a time is allowed" )
    ONE_PER_COMPANY_GROUP( true ),

    @ApiModelProperty( "Only one trial per product" )
    TRIAL( false ),

    @ApiModelProperty( "No check is done" )
    UNLIMITED( false );

    private final boolean limited;

    SubscriptionsPerProduct( boolean limited )
    {
        this.limited = limited;
    }

    public boolean isLimited()
    {
        return limited;
    }
}
