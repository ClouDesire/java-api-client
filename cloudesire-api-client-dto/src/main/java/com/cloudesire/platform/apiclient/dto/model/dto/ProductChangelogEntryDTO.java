package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@Schema( description = "A changelog entry for a product" )
public class ProductChangelogEntryDTO extends BaseEntityDTO
{
    @Schema( description = "Product version number")
    @NotNull
    private String version;

    @Schema( description = "Descriptive text of the changelog entry")
    @NotNull
    @Size( max = 65536, message = INVALID_SIZE )
    private String text;

    @Schema( description = "Changelog entry date")
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
