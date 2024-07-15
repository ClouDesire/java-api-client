package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;
import java.util.List;

@Schema( description = "The product type" )
public enum ProductType
{
    @Schema( description = "This product is billed per API call")
    API,

    @Schema( description = "This product is a bundle of other products")
    BUNDLE,

    @Schema( description = "Like syndicated, but requires cloud credentials")
    CLOUD_SERVICE,

    @Schema( description = "This product is imported from the Azure catalog")
    CSP,

    @Schema( description = "Provisioning is made by us")
    MANAGED,

    @Schema( description = "Provisioning is handled externally")
    SERVICE,

    @Schema( description = "Provisioning is handled programmatically")
    SYNDICATED,

    @Schema( description = "This product provisions a bare virtual machine")
    VM;

    public static List<ProductType> syndicated()
    {
        return Arrays.asList( API, CLOUD_SERVICE, CSP, SERVICE, SYNDICATED );
    }
}
