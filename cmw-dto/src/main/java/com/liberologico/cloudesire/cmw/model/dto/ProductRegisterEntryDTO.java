package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Date;
import java.util.Map;

public class ProductRegisterEntryDTO extends DTO
{
    private Date date;

    private String editor;

    private Map<String, Map<String, String>> entry;

    //region Auto-generated code
    public Date getDate()
    {
        return date;
    }

    public ProductRegisterEntryDTO setDate( Date date )
    {
        this.date = date;
        return this;
    }

    public String getEditor()
    {
        return editor;
    }

    public ProductRegisterEntryDTO setEditor( String editor )
    {
        this.editor = editor;
        return this;
    }

    public Map<String, Map<String, String>> getEntry()
    {
        return entry;
    }

    public ProductRegisterEntryDTO setEntry( Map<String, Map<String, String>> entry )
    {
        this.entry = entry;
        return this;
    }
    //endregion
}
