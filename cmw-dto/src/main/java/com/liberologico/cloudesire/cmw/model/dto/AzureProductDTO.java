package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.MicrosoftProduct;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;

import java.math.BigDecimal;

public class AzureProductDTO extends ProductDTO
{
    private BigDecimal price;

    private String offerId;

    public AzureProductDTO( String name, String identifier, MicrosoftProduct type )
    {
        super( name, identifier, ProductType.CSP );
        setMicrosoftProductType( type );
    }

    public AzureProductDTO()
    {
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
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
