package com.cloudesire.platform.apiclient.dto.model.external;

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
