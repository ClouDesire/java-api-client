package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public abstract class CspProductDTO extends ProductDTO
{
    @NotNull
    private BigDecimal price;

    CspProductDTO( String name, String identifier, CspProductType type, BigDecimal price, UrlEntityDTO company )
    {
        super( name, identifier, ProductType.CSP );
        setCspProductType( type );
        this.price = price;
        setCompany( company );
    }

    CspProductDTO()
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
}
