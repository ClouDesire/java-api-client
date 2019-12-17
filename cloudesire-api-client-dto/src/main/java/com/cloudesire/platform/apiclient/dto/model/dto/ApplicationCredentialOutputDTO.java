package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Objects;

public class ApplicationCredentialOutputDTO extends ApplicationCredentialDTO
{
    private String description;

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ApplicationCredentialOutputDTO that = (ApplicationCredentialOutputDTO) o;
        return Objects.equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), description );
    }
}
