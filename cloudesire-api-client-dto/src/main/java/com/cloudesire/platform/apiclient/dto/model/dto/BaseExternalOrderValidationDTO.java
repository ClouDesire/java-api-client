package com.cloudesire.platform.apiclient.dto.model.dto;

abstract class BaseExternalOrderValidationDTO implements DTO
{
    private Integer productId;

    private String productIdentifier;

    private Integer productVersionId;

    private String productVersionIdentifier;

    private String language;

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId( Integer productId )
    {
        this.productId = productId;
    }

    public String getProductIdentifier()
    {
        return productIdentifier;
    }

    public void setProductIdentifier( String productIdentifier )
    {
        this.productIdentifier = productIdentifier;
    }

    public Integer getProductVersionId()
    {
        return productVersionId;
    }

    public void setProductVersionId( Integer productVersionId )
    {
        this.productVersionId = productVersionId;
    }

    public String getProductVersionIdentifier()
    {
        return productVersionIdentifier;
    }

    public void setProductVersionIdentifier( String productVersionIdentifier )
    {
        this.productVersionIdentifier = productVersionIdentifier;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }
}
