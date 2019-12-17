package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class SubscriptionDetailDTO extends SubscriptionDTO
{
    private List<ApplicationCredentialOutputDTO> credentials;

    private List<UrlEntityDTO> possibleUpgrades;

    public List<ApplicationCredentialOutputDTO> getCredentials()
    {
        return credentials;
    }

    public void setCredentials( List<ApplicationCredentialOutputDTO> credentials )
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
