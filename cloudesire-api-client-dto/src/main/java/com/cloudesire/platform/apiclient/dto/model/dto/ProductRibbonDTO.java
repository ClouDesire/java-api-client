package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel( description = "Configuration for the ribbon functionality in marketplace" )
public class ProductRibbonDTO
{
    @ApiModelProperty( "Label for the ribbon" )
    @NotNull
    @Size( max = 125 )
    private String text;

    @ApiModelProperty( "Color of the ribbon" )
    @Size( max = 125 )
    private String color;

    public ProductRibbonDTO( String text )
    {
        this.text = text;
    }

    public ProductRibbonDTO()
    {
    }

    public String getText()
    {
        return text;
    }

    public void setText( String text )
    {
        this.text = text;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }
}
