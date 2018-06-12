package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "The product type" )
public enum ProductType
{
    /**
     * This product is billed per API call
     */
    API,

    /**
     * This product is a bundle of other products
     */
    BUNDLE,

    /**
     * This product is imported from the Azure catalog
     */
    CSP,

    /**
     * Provisioning is made by us
     */
    MANAGED,

    /**
     * Provisioning is handled externally
     */
    SERVICE,

    /**
     * Provisioning is handled programmatically
     */
    SYNDICATED
}
