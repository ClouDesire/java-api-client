package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.dto.changelog.ChangelogDTO;

import java.util.List;

public class SubscriptionDetailDTO extends BaseSubscriptionDetailDTO
{
    private List<SubscriptionConfigurationParameterDTO> configurationParameters;

    private ChangelogDTO changelog;

    public List<SubscriptionConfigurationParameterDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( List<SubscriptionConfigurationParameterDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public ChangelogDTO getChangelog()
    {
        return changelog;
    }

    public void setChangelog( ChangelogDTO changelog )
    {
        this.changelog = changelog;
    }
}
