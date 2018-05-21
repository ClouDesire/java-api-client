package com.liberologico.cloudesire.cmw.model.enums;

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
     * Provisioning is made by us
     */
    MANAGED,

    /**
     * This product is imported from the Azure catalog
     */
    MICROSOFT,

    /**
     * Provisioning is handled externally
     */
    SERVICE,

    /**
     * Provisioning is handled programmatically
     */
    SYNDICATED
}
