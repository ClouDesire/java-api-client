package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.dto.ActionDTO;

import java.util.Set;

public class SubscriptionDTO extends SubscriptionListDTO
{
    private Set<ActionDTO> availableOperations = null;

    public Set<ActionDTO> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<ActionDTO> availableOperations )
    {
        this.availableOperations = availableOperations;
    }

}
