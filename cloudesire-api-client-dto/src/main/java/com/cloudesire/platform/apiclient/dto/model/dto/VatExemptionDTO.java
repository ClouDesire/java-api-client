package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel( description = "Details of a VAT Exemption document valid under Italian laws" )
public class VatExemptionDTO implements DTO
{
    @ApiModelProperty( "The reference number of the document" )
    private String declarationNumber;

    @ApiModelProperty( "The declaration date of the document" )
    private Date declarationDate;

    @ApiModelProperty( "The internal protocol number of the document" )
    private String internalProtocolNumber;

    public VatExemptionDTO( String declarationNumber, Date declarationDate, String internalProtocolNumber )
    {
        this( declarationNumber );
        this.declarationDate = declarationDate;
        this.internalProtocolNumber = internalProtocolNumber;
    }

    public VatExemptionDTO( String declarationNumber )
    {
        this.declarationNumber = declarationNumber;
    }

    public VatExemptionDTO()
    {
    }

    public String getDeclarationNumber()
    {
        return declarationNumber;
    }

    public void setDeclarationNumber( String declarationNumber )
    {
        this.declarationNumber = declarationNumber;
    }

    public Date getDeclarationDate()
    {
        return declarationDate;
    }

    public void setDeclarationDate( Date declarationDate )
    {
        this.declarationDate = declarationDate;
    }

    public String getInternalProtocolNumber()
    {
        return internalProtocolNumber;
    }

    public void setInternalProtocolNumber( String internalProtocolNumber )
    {
        this.internalProtocolNumber = internalProtocolNumber;
    }
}
