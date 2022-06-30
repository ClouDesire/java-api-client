package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.dto.changelog.ChangeLogDTO;

import java.util.List;

public class SubscriptionDetailDTO extends BaseSubscriptionDetailDTO
{
    private List<SubscriptionConfigurationParameterDTO> configurationParameters;

    private ChangeLogDTO changelog;

    public List<SubscriptionConfigurationParameterDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( List<SubscriptionConfigurationParameterDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public ChangeLogDTO getChangelog()
    {
        return changelog;
    }

    public void setChangelog( ChangeLogDTO changelog )
    {
        this.changelog = changelog;
    }
}
