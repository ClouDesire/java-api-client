package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import java.util.Objects;

@Schema( description = "Company data of a business customer" )
public class UserCompanyDTO extends CompanyDTO
{
    private VatExemptionDTO vatExemption;

    @Valid
    private ItalianElectronicInvoicingDTO italianElectronicInvoicing;

    @Schema( description = "Mark this Company as public administration")
    private Boolean publicAdministration;

    @Schema( description = "If this customer can pay later, only for admin/reseller")
    private Boolean delayedPayment;

    @Schema( description = "The reseller catalog associated to the company")
    @Valid
    private UrlEntityDTO resellerCatalog;

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

    public ItalianElectronicInvoicingDTO getItalianElectronicInvoicing()
    {
        return italianElectronicInvoicing;
    }

    public void setItalianElectronicInvoicing( ItalianElectronicInvoicingDTO italianElectronicInvoicing )
    {
        this.italianElectronicInvoicing = italianElectronicInvoicing;
    }

    public Boolean getPublicAdministration()
    {
        return publicAdministration;
    }

    public void setPublicAdministration( Boolean publicAdministration )
    {
        this.publicAdministration = publicAdministration;
    }

    public Boolean isDelayedPayment()
    {
        return delayedPayment;
    }

    public void setDelayedPayment( Boolean delayedPayment )
    {
        this.delayedPayment = delayedPayment;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        UserCompanyDTO that = (UserCompanyDTO) o;
        return Objects.equals( vatExemption, that.vatExemption ) && Objects
                .equals( delayedPayment, that.delayedPayment );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), vatExemption, delayedPayment );
    }
}
