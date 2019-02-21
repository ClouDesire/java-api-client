package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class SubscriptionDetailDTO extends SubscriptionDTO
{

    private List<UrlEntityDTO> possibleUpgrades;

    public List<UrlEntityDTO> getPossibleUpgrades()
    {
        return possibleUpgrades;
    }

    public void setPossibleUpgrades( List<UrlEntityDTO> possibleUpgrades )
    {
        this.possibleUpgrades = possibleUpgrades;
    }
}
