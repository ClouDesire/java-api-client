package com.cloudesire.platform.apiclient.dto.model.dto.request;

public class UserActivationDTO
{
    private String tag;

    public UserActivationDTO( String tag )
    {
        this.tag = tag;
    }

    public UserActivationDTO()
    {
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }
}
