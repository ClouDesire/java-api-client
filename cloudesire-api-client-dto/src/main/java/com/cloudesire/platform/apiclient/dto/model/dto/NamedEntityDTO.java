package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonPropertyOrder ( { "id", "name" } )
public class NamedEntityDTO extends BaseEntityDTO implements INamedEntityDTO
{
    public static final String NAME_FIELD = "name";

    @NotEmpty
    @Size( max = 255 )
    @ApiModelProperty( "A descriptive name of the resource" )
    private String name;

    public NamedEntityDTO()
    {
    }

    public NamedEntityDTO( String name )
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof NamedEntityDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        NamedEntityDTO that = (NamedEntityDTO) o;
        return Objects.equals( name, that.name );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), name );
    }
}
