package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

@ApiModel( description = "An identification document for a user" )
public class IdentificationDocumentDTO extends DTO implements Serializable
{
    @ApiModelProperty( "The identification document type" )
    private String type;

    @ApiModelProperty( "The number of the identification document" )
    private String number;

    @ApiModelProperty( "Who issued the identification document" )
    private String issuer;

    public IdentificationDocumentDTO( String type, String number, String issuer )
    {
        this.type = type;
        this.number = number;
        this.issuer = issuer;
    }

    public IdentificationDocumentDTO()
    {
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber( String number )
    {
        this.number = number;
    }

    public String getIssuer()
    {
        return issuer;
    }

    public void setIssuer( String issuer )
    {
        this.issuer = issuer;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        IdentificationDocumentDTO that = (IdentificationDocumentDTO) o;
        return Objects.equals( type, that.type ) && Objects.equals( number, that.number ) && Objects
                .equals( issuer, that.issuer );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( type, number, issuer );
    }
}
