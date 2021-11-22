package com.cloudesire.platform.apiclient.dto.model.dto.request;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UrlEntityDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

public class ExternalConfigurationParameterValuesRequestDTO implements DTO
{
    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private Map<UrlEntityDTO, String> configurationParameters;

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }
}
