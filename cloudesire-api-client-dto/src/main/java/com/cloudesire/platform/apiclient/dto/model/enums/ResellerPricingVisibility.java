package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

import java.util.EnumSet;
import java.util.Set;

public enum ResellerPricingVisibility
{
    @ApiModelProperty( "Product Version is not visible to customer, but is buyable through a reseller" )
    EXCLUDED,

    @ApiModelProperty( "Product Version is visible to customer, but not available for buy" )
    INCLUDED,

    @ApiModelProperty( "Product Version is available for buy" )
    PRICED;

    public static Set<ResellerPricingVisibility> buyable( UserRole role )
    {
        Set<ResellerPricingVisibility> visibility = EnumSet.of( ResellerPricingVisibility.PRICED );
        if ( role == UserRole.ROLE_RESELLER ) visibility.add( ResellerPricingVisibility.EXCLUDED );
        return visibility;
    }
}
