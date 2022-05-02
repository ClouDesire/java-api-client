package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class SubscriptionDetailDTO extends BaseSubscriptionDetailDTO
{
    private List<SubscriptionConfigurationParameterDTO> configurationParameters;

    public List<SubscriptionConfigurationParameterDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( List<SubscriptionConfigurationParameterDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }
}
