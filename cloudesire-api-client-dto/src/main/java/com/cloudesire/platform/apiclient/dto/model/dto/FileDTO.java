package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.common.validators.ApplicationFileURL;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@Schema( description = "A managed file for the marketplace" )
public class FileDTO extends BaseEntityDTO
{
    @Schema( description = "Link to the static resource")
    @ApplicationFileURL
    private String objectUrl;

    @Schema( description = "SHA-512 of the uploaded file", readOnly = true )
    private String sha512;

    @Schema( description = "alt property for an image")
    @Size( max = 125, message = INVALID_SIZE )
    private String alt;

    @Schema( description = "title property for an image")
    @Size( max = 125, message = INVALID_SIZE )
    private String title;

    @Schema( description = "Size of the uploaded file", readOnly = true )
    private Integer size;

    @Schema( description = "When the file has been uploaded", readOnly = true )
    private Date loadDate;

    @Valid
    private UrlEntityDTO ownerCompany;

    @Schema( description = "Original name of the uploaded file", readOnly = true )
    private String originalFilename;

    @Schema( description = "Tag for a ProductFile")
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String tag;

    @Schema( description = "Weight order for displaying on the marketplace")
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Integer weight;

    public String getObjectUrl()
    {
        return objectUrl;
    }

    public void setObjectUrl( String objectUrl )
    {
        this.objectUrl = objectUrl;
    }

    public String getSha512()
    {
        return sha512;
    }

    public void setSha512( String sha512 )
    {
        this.sha512 = sha512;
    }

    public Integer getSize()
    {
        if ( size != null ) return size > 1 ? size : 0;
        return null;
    }

    public void setSize( Integer size )
    {
        this.size = size;
    }

    public Date getLoadDate()
    {
        return loadDate;
    }

    public void setLoadDate( Date loadDate )
    {
        if ( loadDate == null ) this.loadDate = new Date( 0L );
        else this.loadDate = loadDate;
    }

    public UrlEntityDTO getOwnerCompany()
    {
        return ownerCompany;
    }

    public void setOwnerCompany( UrlEntityDTO ownerCompany )
    {
        this.ownerCompany = ownerCompany;
    }

    public String getOriginalFilename()
    {
        return originalFilename;
    }

    public void setOriginalFilename( String originalFilename )
    {
        this.originalFilename = originalFilename;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public String getAlt()
    {
        return alt;
    }

    public void setAlt( String alt )
    {
        this.alt = alt;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public FileDTO setWeight( Integer weight )
    {
        this.weight = weight;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof FileDTO ) ) return false;
        FileDTO fileDTO = (FileDTO) o;
        return Objects.equals( objectUrl, fileDTO.objectUrl ) && Objects.equals( sha512, fileDTO.sha512 ) && Objects
                .equals( alt, fileDTO.alt ) && Objects.equals( title, fileDTO.title ) && Objects
                .equals( size, fileDTO.size ) && Objects.equals( loadDate, fileDTO.loadDate ) && Objects
                .equals( ownerCompany, fileDTO.ownerCompany ) && Objects
                .equals( originalFilename, fileDTO.originalFilename ) && Objects.equals( tag, fileDTO.tag ) && Objects
                .equals( weight, fileDTO.weight );
    }

    @Override
    public int hashCode()
    {
        return Objects
                .hash( objectUrl, sha512, alt, title, size, loadDate, ownerCompany, originalFilename, tag, weight );
    }
}
