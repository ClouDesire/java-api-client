package com.cloudesire.platform.apiclient.dto.model.external;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder( {
        "productId", "productIdentifier", "productVersionId", "productVersionIdentifier", "configurationParameter",
        "configurationParameters", "cloudCredentialId", "language", "buyerId"
} )
public class ExternalConfigurationParameterValuesRequestDTO extends BaseExternalOrderValidationDTO
{
    private String configurationParameter;

    public String getConfigurationParameter()
    {
        return configurationParameter;
    }

    public void setConfigurationParameter( String configurationParameter )
    {
        this.configurationParameter = configurationParameter;
    }
}
