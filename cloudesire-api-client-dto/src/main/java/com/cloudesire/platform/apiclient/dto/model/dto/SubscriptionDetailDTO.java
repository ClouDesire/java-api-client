package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class SubscriptionDetailDTO extends SubscriptionDTO
{
    private List<ApplicationCredentialDTO> credentials;

    private List<UrlEntityDTO> possibleUpgrades;

    public List<ApplicationCredentialDTO> getCredentials()
    {
        return credentials;
    }

    public void setCredentials( List<ApplicationCredentialDTO> credentials )
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
