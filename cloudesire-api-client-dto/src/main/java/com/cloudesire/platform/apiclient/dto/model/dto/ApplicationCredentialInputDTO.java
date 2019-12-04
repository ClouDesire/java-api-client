package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Objects;

public class ApplicationCredentialInputDTO extends ApplicationCredentialDTO
{
    private Map<String, String> description;

    public ApplicationCredentialInputDTO( @NotNull String key, String value, Integer weight,
            Map<String, String> description )
    {
        super( key, value, weight );
        this.description = description;
    }

    public ApplicationCredentialInputDTO()
    {
    }

    public Map<String, String> getDescription()
    {
        return description;
    }

    public void setDescription( Map<String, String> description )
    {
        this.description = description;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ApplicationCredentialInputDTO that = (ApplicationCredentialInputDTO) o;
        return Objects.equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), description );
    }
}
