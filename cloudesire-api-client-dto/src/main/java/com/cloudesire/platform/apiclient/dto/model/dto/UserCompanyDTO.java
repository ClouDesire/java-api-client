package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel( description = "Company data of a business customer" )
public class UserCompanyDTO extends CompanyDTO
{
    private VatExemptionDTO vatExemption;

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

    public VatExemptionDTO getVatExemption()
    {
        return vatExemption;
    }

    public void setVatExemption( VatExemptionDTO vatExemption )
    {
        this.vatExemption = vatExemption;
    }
}
