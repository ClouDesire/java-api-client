package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import jakarta.validation.constraints.NotNull;

public class UserPatchDTO implements DTO
{
    @NotNull
    private Action action;

    public UserPatchDTO( Action action )
    {
        this.action = action;
    }

    public UserPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction( Action action )
    {
        this.action = action;
    }

    public enum Action
    {
        ACTIVATE,
        APPROVE,
        BLOCK,
        UNBLOCK
    }
}
