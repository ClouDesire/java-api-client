package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class CspProductDTO extends ProductDTO
{
    @Schema( description = "The plan or license price when importing a new CSP product")
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CspProductDTO that = (CspProductDTO) o;
        return price.equals( that.price );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), price );
    }
}
