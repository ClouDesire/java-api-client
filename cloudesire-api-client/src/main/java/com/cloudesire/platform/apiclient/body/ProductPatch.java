package com.cloudesire.platform.apiclient.body;

public class ProductPatch
{
    private ProductPatchAction action;
    private String syndicatedEndpoint;

    public ProductPatch setAction( ProductPatchAction value )
    {
        this.action = value;
        return this;
    }

    public ProductPatch setSyndicatedEndpoint( String syndicatedEndpoint )
    {
        this.syndicatedEndpoint = syndicatedEndpoint;
        return this;
    }
}
