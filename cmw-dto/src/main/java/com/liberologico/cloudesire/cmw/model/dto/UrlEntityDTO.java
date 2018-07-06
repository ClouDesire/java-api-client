package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.cmw.model.utils.BodyParser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@ApiModel( "Reference to a related resource" )
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

    public UrlEntityDTO( BaseEntityDTO entityDTO )
    {
        this.url = entityDTO.getSelf();
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
    public int hashCode()
    {
        return url != null ? url.hashCode() : 0;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        UrlEntityDTO that = (UrlEntityDTO) o;

        if ( url != null ? !url.equals( that.url ) : that.url != null ) return false;

        return true;
    }

    @Override
    public String toString()
    {
        return url;
    }

    @JsonIgnore
    public boolean isNull()
    {
        return url == null;
    }

    @JsonIgnore
    public boolean hasId( Integer id )
    {
        return url.substring( url.lastIndexOf( '/' ) + 1 ).equals( id.toString() );
    }

    @JsonIgnore
    public Integer getId()
    {
        return BodyParser.getResourceId( this.url );
    }

    @JsonIgnore
    public String getIdentifier()
    {
        return BodyParser.getResourceIdentifier( this.url );
    }

    @JsonIgnore
    public String getResource()
    {
        if ( url == null ) return null;

        return url.substring( 0, url.indexOf( '/' ) );
    }
}
