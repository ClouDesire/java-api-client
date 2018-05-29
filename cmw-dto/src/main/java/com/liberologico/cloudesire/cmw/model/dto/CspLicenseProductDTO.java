package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;

public class CspLicenseProductDTO extends CspProductDTO
{
    @ApiModelProperty( "The CSP offer id for importing a license-based product" )
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
}
