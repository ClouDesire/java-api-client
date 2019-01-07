package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Map;

@ApiModel( "Logs an edit of a product" )
public class ProductRegisterEntryDTO extends DTO
{
    @ApiModelProperty( "When the edit occurred" )
    private Date date;

    @ApiModelProperty( "Username of the editor" )
    private String editor;

    @ApiModelProperty( "Edited data" )
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
