package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
