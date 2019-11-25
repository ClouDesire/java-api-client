package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;
import java.util.Map;

public class SubscriptionDetailDTO extends SubscriptionDTO
{
    private Map<String, String> credentials;

    private List<UrlEntityDTO> possibleUpgrades;

    public Map<String, String> getCredentials()
    {
        return credentials;
    }

    public void setCredentials( Map<String, String> credentials )
    {
        this.credentials = credentials;
    }

    public List<UrlEntityDTO> getPossibleUpgrades()
    {
        return possibleUpgrades;
    }

    public void setPossibleUpgrades( List<UrlEntityDTO> possibleUpgrades )
    {
        this.possibleUpgrades = possibleUpgrades;
    }
}
