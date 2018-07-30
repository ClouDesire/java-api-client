package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public abstract class CspProductDTO extends ProductDTO
{
    @ApiModelProperty( "The plan or license price when importing a new CSP product" )
    @NotNull
    private BigDecimal price;

    CspProductDTO( String name, String identifier, CspProductType type, BigDecimal price, UrlEntityDTO company )
    {
        super( name, identifier, ProductType.CSP, company );
        setCspProductType( type );
        this.price = price;
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
