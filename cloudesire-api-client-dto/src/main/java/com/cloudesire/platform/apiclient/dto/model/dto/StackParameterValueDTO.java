package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class StackParameterValueDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO stackParameter;
    @NotNull
    @Valid
    private UrlEntityDTO dependency;

    @NotNull
    private String value;

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public UrlEntityDTO getStackParameter()
    {
        return stackParameter;
    }

    public void setStackParameter( UrlEntityDTO stackParameter )
    {
        this.stackParameter = stackParameter;
    }

    public UrlEntityDTO getDependency()
    {
        return dependency;
    }

    public void setDependency( UrlEntityDTO dependency )
    {
        this.dependency = dependency;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        StackParameterValueDTO that = (StackParameterValueDTO) o;
        return Objects.equals( stackParameter, that.stackParameter ) &&
                Objects.equals( dependency, that.dependency ) &&
                Objects.equals( value, that.value );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( stackParameter, dependency, value );
    }
}
