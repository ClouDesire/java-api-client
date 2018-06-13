package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@ApiModel( "A bundle of different products" )
public class ProductBundleDTO extends ProductDTO
{
    @ApiModelProperty( value = "Products included in this bundle with their discount", readOnly = true )
    private final Set<ProductDiscountDTO> bundled = new TreeSet<>();

    public void addBundled( ProductDTO product, BigDecimal discount )
    {
        bundled.add( new ProductDiscountDTO( product, discount ) );
    }

    public Set<ProductDiscountDTO> getBundled()
    {
        return bundled;
    }

    public void setBundled( Set<ProductDiscountDTO> bundled )
    {
        this.bundled.clear();
        if ( bundled == null ) return;
        this.bundled.addAll( bundled );
    }
}
