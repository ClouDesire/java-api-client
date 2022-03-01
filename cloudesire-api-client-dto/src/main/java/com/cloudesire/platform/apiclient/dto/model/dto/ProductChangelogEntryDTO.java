package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "A changelog entry for a product" )
public class ProductChangelogEntryDTO extends BaseEntityDTO
{
    @ApiModelProperty( "Product version number" )
    @NotNull
    private String version;

    @ApiModelProperty( "Descriptive text of the changelog entry" )
    @NotNull
    @Size( max = 65536, message = INVALID_SIZE )
    private String text;

    @ApiModelProperty( "Changelog entry date" )
    private Date date = new Date();

    public String getVersion()
    {
        return version;
    }

    public void setVersion( String version )
    {
        this.version = version;
    }

    public String getText()
    {
        return text;
    }

    public void setText( String text )
    {
        this.text = text;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductChangelogEntryDTO that = (ProductChangelogEntryDTO) o;
        return Objects.equals( version, that.version ) && Objects.equals( text, that.text );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( version, text );
    }
}
