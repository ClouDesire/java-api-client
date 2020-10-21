package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class ProductDetailDTO extends ProductDTO
{
    @ApiModelProperty( hidden = true )
    private MinimumCostDTO minimumCost;

    public MinimumCostDTO getMinimumCost()
    {
        return minimumCost;
    }

    public void setMinimumCost( MinimumCostDTO minimumCost )
    {
        this.minimumCost = minimumCost;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ProductDetailDTO ) ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductDetailDTO that = (ProductDetailDTO) o;
        return Objects.equals( minimumCost, that.minimumCost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), minimumCost );
    }
}
