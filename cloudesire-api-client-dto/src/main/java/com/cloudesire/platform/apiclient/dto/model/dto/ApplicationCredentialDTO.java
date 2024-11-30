package com.cloudesire.platform.apiclient.dto.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

abstract class ApplicationCredentialDTO
{
    @NotNull
    @Size( min = 1, max = 125 )
    private String key;

    private String value;

    @NotNull
    private Integer weight;

    ApplicationCredentialDTO( @NotNull String key, String value, Integer weight )
    {
        this.key = key;
        this.value = value;
        this.weight = weight;
    }

    ApplicationCredentialDTO()
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ApplicationCredentialDTO ) ) return false;
        ApplicationCredentialDTO that = (ApplicationCredentialDTO) o;
        return Objects.equals( key, that.key ) && Objects.equals( value, that.value );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( key, value );
    }
}
