package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel( description = "Company data of a business customer" )
public class UserCompanyDTO extends CompanyDTO
{
    private VatExemptionDTO vatExemption;

    @ApiModelProperty( "If this customer can pay later" )
    private boolean delayedPayment;

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

    public boolean isDelayedPayment()
    {
        return delayedPayment;
    }

    public void setDelayedPayment( boolean delayedPayment )
    {
        this.delayedPayment = delayedPayment;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        UserCompanyDTO that = (UserCompanyDTO) o;
        return delayedPayment == that.delayedPayment && Objects.equals( vatExemption, that.vatExemption );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), vatExemption, delayedPayment );
    }
}
