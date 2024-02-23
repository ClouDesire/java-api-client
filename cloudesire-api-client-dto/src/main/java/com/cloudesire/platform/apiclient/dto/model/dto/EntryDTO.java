package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;

@ApiModel( description = "A name/value pair" )
public class EntryDTO implements DTO
{
    @NotNull
    private String name;

    private String value;

    public EntryDTO()
    {
    }

    public EntryDTO( String name, String value )
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }
}
