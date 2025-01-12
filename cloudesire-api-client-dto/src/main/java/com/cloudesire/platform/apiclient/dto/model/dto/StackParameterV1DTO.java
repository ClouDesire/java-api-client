package com.cloudesire.platform.apiclient.dto.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class StackParameterV1DTO extends BaseStackParameterDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO nodeRole;

    public UrlEntityDTO getNodeRole()
    {
        return nodeRole;
    }

    public void setNodeRole( UrlEntityDTO nodeRole )
    {
        this.nodeRole = nodeRole;
    }
}
