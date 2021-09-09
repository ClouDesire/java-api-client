package com.cloudesire.platform.apiclient.dto.model.dto;

public class CostDescriptionDTO implements DTO
{
    private String description;

    public CostDescriptionDTO( String description )
    {
        this.description = description;
    }

    public CostDescriptionDTO()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }
}
