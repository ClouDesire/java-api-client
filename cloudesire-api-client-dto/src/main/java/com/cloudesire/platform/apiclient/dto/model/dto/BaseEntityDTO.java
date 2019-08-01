package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@JsonPropertyOrder ( { "id" } )
public abstract class BaseEntityDTO extends DTO implements IBaseEntityDTO
{
    @ApiModelProperty( readOnly = true )
    private Integer id;

    @ApiModelProperty( readOnly = true, example = "subscription/123" )
    private String self;

    @JsonIgnore
    public UrlEntityDTO urlEntity()
    {
        return new UrlEntityDTO( getSelf() );
    }

    @Override
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getSelf()
    {
        return self;
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
