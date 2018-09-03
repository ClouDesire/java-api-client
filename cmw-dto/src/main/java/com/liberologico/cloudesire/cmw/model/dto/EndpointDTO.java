package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.EndpointType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Size;
import java.util.Objects;

import static com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys.INVALID_SIZE;

public class EndpointDTO extends BaseEntityDTO
{
    @ApiModelProperty( "Endpoint URL" )
    @URL
    private String endpoint;

    private EndpointType category;

    @ApiModelProperty( "Endpoint description" )
    @Size( max = 1024, message = INVALID_SIZE )
    private String description;

    public EndpointDTO( String endpoint, String description )
    {
        this( endpoint );
        this.description = description;
    }

    public EndpointDTO( String endpoint )
    {
        this.endpoint = endpoint;
    }

    public EndpointDTO()
    {
    }

    @ApiModelProperty( hidden = true )
    @Deprecated
    public String getName()
    {
        return getEndpoint();
    }

    @Deprecated
    public EndpointDTO setName( String name )
    {
        return setEndpoint( name );
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public EndpointDTO setEndpoint( String endpoint )
    {
        this.endpoint = endpoint;
        return this;
    }

    public EndpointType getCategory()
    {
        return category;
    }

    public EndpointDTO setCategory( EndpointType category )
    {
        this.category = category;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public EndpointDTO setDescription( String description )
    {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        EndpointDTO that = (EndpointDTO) o;
        return Objects.equals( endpoint, that.endpoint );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( endpoint );
    }

    @Override
    public String toString()
    {
        return endpoint + " [" + category +  "] (" + description + ")";
    }
}
