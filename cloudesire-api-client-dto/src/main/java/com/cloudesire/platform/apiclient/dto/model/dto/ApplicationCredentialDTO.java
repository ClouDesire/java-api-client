package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ApplicationCredentialDTO
{
    @NotNull
    @Size( min = 1, max = 125 )
    private String key;

    private String value;

    @NotNull
    private Integer weight;

    public ApplicationCredentialDTO( @NotNull String key, @NotNull String value, Integer weight )
    {
        this.key = key;
        this.value = value;
        this.weight = weight;
    }

    public ApplicationCredentialDTO()
    {
    }

    public String getKey()
    {
        return key;
    }

    public void setKey( String key )
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight( Integer weight )
    {
        this.weight = weight;
    }
}
