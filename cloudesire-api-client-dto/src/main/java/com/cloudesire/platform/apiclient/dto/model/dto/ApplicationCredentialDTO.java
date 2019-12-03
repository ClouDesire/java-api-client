package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class ApplicationCredentialDTO
{
    @NotNull
    @Size( min = 1, max = 125 )
    private String key;

    private String value;

    private String description;

    @NotNull
    private Integer weight;

    public ApplicationCredentialDTO( @NotNull String key, String value, String description, Integer weight )
    {
        this.key = key;
        this.value = value;
        this.description = description;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
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
        if ( o == null || getClass() != o.getClass() ) return false;
        ApplicationCredentialDTO that = (ApplicationCredentialDTO) o;
        return Objects.equals( key, that.key ) && Objects.equals( value, that.value ) && Objects
                .equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( key, value, description );
    }
}
