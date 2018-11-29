package com.cloudesire.platform.apiclient.body;

import io.swagger.annotations.ApiModelProperty;

public class FilePatch
{
    @ApiModelProperty( "alt property for an image" )
    private String alt;

    @ApiModelProperty( "title property for an image" )
    private String title;

    public String getAlt()
    {
        return alt;
    }

    public FilePatch setAlt( String alt )
    {
        this.alt = alt;
        return this;
    }

    public String getTitle()
    {
        return title;
    }

    public FilePatch setTitle( String title )
    {
        this.title = title;
        return this;
    }
}
