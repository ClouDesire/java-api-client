package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Map;

public class CloudCredentialPayloadDTO extends DTO
{
    private Object secret;

    private Map<String, String> clear;

    public CloudCredentialPayloadDTO( Object secret, Map<String, String> clear )
    {
        this( secret );
        this.clear = clear;
    }

    public CloudCredentialPayloadDTO( Object secret )
    {
        this.secret = secret;
    }

    public CloudCredentialPayloadDTO()
    {
    }

    public Object getSecret()
    {
        return secret;
    }

    public void setSecret( Object secret )
    {
        this.secret = secret;
    }

    public Map<String, String> getClear()
    {
        return clear;
    }

    public void setClear( Map<String, String> clear )
    {
        this.clear = clear;
    }
}
