package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.EndpointType;

import java.util.Objects;

public class EndpointPatternDTO extends NamedEntityDTO
{
    private EndpointType category;

    private String description;

    public EndpointPatternDTO()
    {
    }

    public EndpointPatternDTO( String name, EndpointType category, String description )
    {
        super( name );
        this.category = category;
        this.description = description;
    }

    public EndpointType getCategory()
    {
        return category;
    }

    public void setCategory( EndpointType category )
    {
        this.category = category;
    }

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
        EndpointPatternDTO that = (EndpointPatternDTO) o;
        return Objects.equals( getName(), that.getName() )
                && category == that.category
                && Objects.equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( getName(), category, description );
    }

    @Override
    public String toString()
    {
        return "EndpointPatternDTO{" +
                "name=" + getName() +
                ", category=" + category +
                ", description='" + description +
                '\'' + '}';
    }
}
