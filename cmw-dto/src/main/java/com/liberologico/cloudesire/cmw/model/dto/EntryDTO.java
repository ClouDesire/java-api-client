package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.NotNull;

public class EntryDTO
{
    @NotNull
    private String key;
    private String value;

    public EntryDTO()
    {
    }

    public EntryDTO( String key, String value )
    {
        this.key = key;
        this.value = value;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey( String key )
    {
        this.key = key;
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
