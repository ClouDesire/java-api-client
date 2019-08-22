package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.EndpointType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class EndpointPatternDTO extends BaseEntityDTO
{
    @ApiModelProperty( "The URL representation that must contain {nodename} as hostname placeholder" )
    @NotBlank
    @Size( max = 4096 )
    private String name;

    @NotNull
    private EndpointType category = EndpointType.APP;

    private String description;

    public EndpointPatternDTO()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
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
        return name.equals( that.name ) && category == that.category;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), name, category );
    }

    @Override
    public String toString()
    {
        return "EndpointPatternDTO{" +
                "name=" + name +
                ", category=" + category +
                ", description='" + description +
                '\'' + '}';
    }
}
