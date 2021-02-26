package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;
import java.util.List;

@ApiModel( description = "The product type" )
public enum ProductType
{
    @ApiModelProperty( "This product is billed per API call" )
    API,

    @ApiModelProperty( "This product is a bundle of other products" )
    BUNDLE,

    @ApiModelProperty( "Like syndicated, but requires cloud credentials" )
    CLOUD_SERVICE,

    @ApiModelProperty( "This product is imported from the Azure catalog" )
    CSP,

    @ApiModelProperty( "Provisioning is made by us" )
    MANAGED,

    @ApiModelProperty( "Provisioning is handled externally" )
    SERVICE,

    @ApiModelProperty( "Provisioning is handled programmatically" )
    SYNDICATED,

    @ApiModelProperty( "This product provisions a bare virtual machine" )
    VM;

    public static List<ProductType> syndicated()
    {
        return Arrays.asList( API, CLOUD_SERVICE, CSP, SERVICE, SYNDICATED );
    }
}
