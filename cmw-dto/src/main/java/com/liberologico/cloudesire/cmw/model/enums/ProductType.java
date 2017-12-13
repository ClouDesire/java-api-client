package com.liberologico.cloudesire.cmw.model.enums;

public enum ProductType
{
    /**
     * Provisioning is made by us
     */
    MANAGED,

    /**
     * Provisioning is handled programmatically
     */
    SYNDICATED,

    /**
     * Provisioning is handled externally
     */
    SERVICE,

    /**
     * This product is a bundle of other products
     */
    BUNDLE
}
