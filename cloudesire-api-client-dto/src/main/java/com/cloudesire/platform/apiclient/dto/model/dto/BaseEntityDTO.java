package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.beans.Introspector;
import java.util.Objects;

@JsonPropertyOrder ( { "id" } )
public class BaseEntityDTO implements DTO
{
    @ApiModelProperty( readOnly = true )
    private Integer id;

    @ApiModelProperty( readOnly = true, example = "subscription/123" )
    private String self;

    /**
     * Set to override the guessing of resource name from main DTO class.
     */
    protected String entityToken;

    public String getSelf()
    {
        if ( self != null ) return self;
        if ( id != null ) return getResourceName() + "/" + id;
        else return null;
    }

    @ApiModelProperty( readOnly = true )
    @JsonIgnore
    public String getResourceName()
    {
        if ( this.entityToken == null )
        {
            return Introspector.decapitalize( this.getClass().getSimpleName().replace( "DTO", "" ) );
        }
        else
        {
            return this.entityToken;
        }
    }

    @JsonIgnore
    public void setEntityToken( String entityToken )
    {
        this.entityToken = entityToken;
    }

    @JsonIgnore
    public UrlEntityDTO urlEntity()
    {
        return new UrlEntityDTO( getSelf() );
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public void setSelf( String self )
    {
        this.self = self;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof BaseEntityDTO ) ) return false;
        BaseEntityDTO that = (BaseEntityDTO) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( id );
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "{" + "id=" + id + '}';
    }
}
