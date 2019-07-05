package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel( description = "Company data of a business customer" )
public class UserCompanyDTO extends CompanyDTO
{
    @ApiModelProperty( "The reference number of a VAT Exemption document valid under Italian laws" )
    private String vatExemptionDeclarationNumber;

    @ApiModelProperty( "The declaration date of a VAT Exemption document valid under Italian laws" )
    private Date vatExemptionDeclarationDate;

    @ApiModelProperty( "The internal protocol number of a VAT Exemption document valid under Italian laws" )
    private String vatExemptionInternalProtocolNumber;

    public UserCompanyDTO( String name, String email )
    {
        super( name );
        setEmailAddress( email );
    }

    public UserCompanyDTO( String name )
    {
        super( name );
    }

    public UserCompanyDTO()
    {
        super();
    }

    public String getVatExemptionDeclarationNumber()
    {
        return vatExemptionDeclarationNumber;
    }

    public void setVatExemptionDeclarationNumber( String vatExemptionDeclarationNumber )
    {
        this.vatExemptionDeclarationNumber = vatExemptionDeclarationNumber;
    }

    public Date getVatExemptionDeclarationDate()
    {
        return vatExemptionDeclarationDate;
    }

    public void setVatExemptionDeclarationDate( Date vatExemptionDeclarationDate )
    {
        this.vatExemptionDeclarationDate = vatExemptionDeclarationDate;
    }

    public String getVatExemptionInternalProtocolNumber()
    {
        return vatExemptionInternalProtocolNumber;
    }

    public void setVatExemptionInternalProtocolNumber( String vatExemptionInternalProtocolNumber )
    {
        this.vatExemptionInternalProtocolNumber = vatExemptionInternalProtocolNumber;
    }
}
