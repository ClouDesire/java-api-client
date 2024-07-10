package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.Map;

@Schema( description = "Logs an edit of a product" )
public class ProductRegisterEntryDTO implements DTO
{
    @Schema( description = "When the edit occurred")
    private Date date;

    @Schema( description = "Username of the editor")
    private String editor;

    @Schema( description = "Edited data")
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
