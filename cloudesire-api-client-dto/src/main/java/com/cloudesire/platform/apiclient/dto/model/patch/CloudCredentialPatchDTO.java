package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import javax.validation.constraints.NotNull;

@SuppressWarnings( "squid:S2637" )
public class CloudCredentialPatchDTO extends DTO
{
    @NotNull
    private Action action;

    @NotNull
    private Object payload;

    public CloudCredentialPatchDTO( Action action )
    {
        this.action = action;
    }

    public CloudCredentialPatchDTO()
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

    public Object getPayload()
    {
        return payload;
    }

    public void setPayload( Object payload )
    {
        this.payload = payload;
    }

    public enum Action
    {
        SAVE_CUSTOM_CREDENTIALS
    }
}