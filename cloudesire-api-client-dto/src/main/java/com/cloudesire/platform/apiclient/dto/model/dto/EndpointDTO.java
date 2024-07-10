package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.EndpointType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

public class EndpointDTO extends BaseEntityDTO
{
    @Schema( description = "Endpoint URL")
    @NotNull
    @Size( min = 1, max = 2000 )
    @URL
    private String endpoint;

    private EndpointType category;

    @Schema( description = "Endpoint description")
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

    /**
     * @deprecated use {@link #getEndpoint()}
     */
    @Schema( hidden = true )
    @Deprecated
    public String getName()
    {
        return getEndpoint();
    }

    /**
     * @deprecated use {@link #setEndpoint(String)}
     */
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
