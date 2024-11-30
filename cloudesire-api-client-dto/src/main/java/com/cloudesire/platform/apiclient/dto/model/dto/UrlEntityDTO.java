package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.utils.BodyParser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Objects;

@Schema( description = "Reference to a related resource" )
public class UrlEntityDTO implements DTO
{
    @Schema( description = "Reference to another resource", required = true, example = "resourceName/ID" )
    @NotEmpty
    @Size( max = 255 )
    private String url;

    public UrlEntityDTO()
    {
    }

    public UrlEntityDTO( int id )
    {
        this.url = "/" + id;
    }

    public UrlEntityDTO( String url )
    {
        this.url = url;
    }

    public static UrlEntityDTO empty()
    {
        return new UrlEntityDTO();
    }

    public static UrlEntityDTO of( String url )
    {
        return new UrlEntityDTO( url );
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return url;
    }

    @Schema( hidden = true )
    @JsonIgnore
    public boolean isNull()
    {
        return url == null;
    }

    @Schema( hidden = true )
    @JsonIgnore
    public boolean hasId( Integer id )
    {
        return url.substring( url.lastIndexOf( '/' ) + 1 ).equals( id.toString() );
    }

    @Schema( hidden = true )
    @JsonIgnore
    public Integer getId()
    {
        return BodyParser.getResourceId( this.url );
    }

    @Schema( hidden = true )
    @JsonIgnore
    public String getIdentifier()
    {
        return BodyParser.getResourceIdentifier( this.url );
    }

    @Schema( hidden = true )
    @JsonIgnore
    public String getResource()
    {
        if ( url == null ) return null;

        return url.substring( 0, url.indexOf( '/' ) );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        UrlEntityDTO that = (UrlEntityDTO) o;
        return Objects.equals( url, that.url );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( url );
    }
}
