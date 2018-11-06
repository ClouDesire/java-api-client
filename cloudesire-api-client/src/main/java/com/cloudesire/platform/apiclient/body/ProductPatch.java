package com.cloudesire.platform.apiclient.body;

import com.liberologico.cloudesire.cmw.model.enums.FeaturedType;

public class ProductPatch
{
    private FeaturedType action;
    private String privacy;

    public ProductPatch setAction( FeaturedType value )
    {
        this.action = value;
        return this;
    }

    public ProductPatch setPrivacy( String value )
    {
        this.privacy = value;
        return this;
    }
}
