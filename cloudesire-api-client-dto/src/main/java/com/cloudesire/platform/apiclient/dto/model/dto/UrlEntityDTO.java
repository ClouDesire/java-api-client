package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cloudesire.platform.apiclient.dto.model.utils.BodyParser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel( description = "Reference to a related resource" )
public class UrlEntityDTO
{
    @NotEmpty
    @ApiModelProperty( value = "Reference to another resource", example = "resourceName/ID" )
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

    @ApiModelProperty( hidden = true )
    @JsonIgnore
    public boolean isNull()
    {
        return url == null;
    }

    @ApiModelProperty( hidden = true )
    @JsonIgnore
    public boolean hasId( Integer id )
    {
        return url.substring( url.lastIndexOf( '/' ) + 1 ).equals( id.toString() );
    }

    @ApiModelProperty( hidden = true )
    @JsonIgnore
    public Integer getId()
    {
        return BodyParser.getResourceId( this.url );
    }

    @ApiModelProperty( hidden = true )
    @JsonIgnore
    public String getIdentifier()
    {
        return BodyParser.getResourceIdentifier( this.url );
    }

    @ApiModelProperty( hidden = true )
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
