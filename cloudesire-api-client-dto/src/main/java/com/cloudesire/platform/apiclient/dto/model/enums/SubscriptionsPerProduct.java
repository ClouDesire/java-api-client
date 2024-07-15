package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum SubscriptionsPerProduct
{
    @Schema( description = "One subscription per product per user, regardless of company, at a time is allowed")
    ONE_PER_USER( true ),

    @Schema( description = "One subscription per product for a whole company at a time is allowed")
    ONE_PER_COMPANY( true ),

    @Schema( description = "One subscription per product for a company group at a time is allowed")
    ONE_PER_COMPANY_GROUP( true ),

    @Schema( description = "Only one trial per product")
    TRIAL( false ),

    @Schema( description = "No check is done")
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
