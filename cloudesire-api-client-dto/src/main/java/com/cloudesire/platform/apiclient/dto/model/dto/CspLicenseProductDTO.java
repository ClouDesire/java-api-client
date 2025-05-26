package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class CspLicenseProductDTO extends CspProductDTO
{
    @Schema( description = "The CSP offer id for importing a license-based product")
    @NotEmpty
    private String offerId;

    public CspLicenseProductDTO( String name, String identifier, BigDecimal price, UrlEntityDTO company )
    {
        super( name, identifier, CspProductType.LICENSE_BASED, price, company );
    }

    public CspLicenseProductDTO()
    {
    }

    public String getOfferId()
    {
        return offerId;
    }

    public void setOfferId( String offerId )
    {
        this.offerId = offerId;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CspLicenseProductDTO that = (CspLicenseProductDTO) o;
        return Objects.equals( offerId, that.offerId );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), offerId );
    }
}
