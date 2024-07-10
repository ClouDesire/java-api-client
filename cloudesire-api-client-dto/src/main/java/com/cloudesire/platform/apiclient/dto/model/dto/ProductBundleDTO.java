package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@Schema( description = "A bundle of different products" )
public class ProductBundleDTO extends ProductDTO
{
    @Schema( description = "Products included in this bundle with their discount", readOnly = true )
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
