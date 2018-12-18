package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Objects;

public class ProductFilePatchDTO extends FileDTO
{
    private UrlEntityDTO product = UrlEntityDTO.empty();

    public boolean isProductNulled()
    {
        return product == null || product.isNull();
    }

    public UrlEntityDTO getProduct()
    {
        if ( product != null && product.isNull() ) return null;
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof ProductFilePatchDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        ProductFilePatchDTO that = (ProductFilePatchDTO) o;
        return Objects.equals( product, that.product );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), product );
    }
}
