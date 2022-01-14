package com.cloudesire.platform.apiclient.dto.model.external;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude( JsonInclude.Include.NON_NULL )
abstract class BaseExternalOrderValidationDTO
{
    private Integer productId;

    private String productIdentifier;

    private Integer productVersionId;

    private String productVersionIdentifier;

    private Map<String, String> configurationParameters;

    private String language;

    private Integer buyerId;

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

    public Map<String, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<String, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public Integer getBuyerId()
    {
        return buyerId;
    }

    public void setBuyerId( Integer buyerId )
    {
        this.buyerId = buyerId;
    }
}
