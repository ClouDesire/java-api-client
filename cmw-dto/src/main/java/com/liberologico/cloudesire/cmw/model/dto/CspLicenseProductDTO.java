package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CspLicenseProductDTO extends CspProductDTO
{
    @NotNull
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
