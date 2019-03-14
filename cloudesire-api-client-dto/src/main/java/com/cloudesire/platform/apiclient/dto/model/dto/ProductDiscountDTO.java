package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "Per-product discount of a bundle" )
public class ProductDiscountDTO implements Comparable<ProductDiscountDTO>
{
    @ApiModelProperty( value = "A product in a bundle", readOnly = true )
    private ProductDTO product;

    @ApiModelProperty( value = "Discount percentage for this product", example = "20", readOnly = true )
    private BigDecimal discount;

    public ProductDTO getProduct()
    {
        return product;
    }

    public void setProduct( ProductDTO product )
    {
        this.product = product;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public void setDiscount( BigDecimal discount )
    {
        this.discount = discount;
    }

    public ProductDiscountDTO( ProductDTO product, BigDecimal discount )
    {
        this.product = product;
        this.discount = discount;
    }

    public ProductDiscountDTO()
    {
    }

    @Override
    public int compareTo( ProductDiscountDTO o )
    {
        int byWeight = Integer.compare( this.product.getWeight(), o.product.getWeight() );
        if ( byWeight != 0 ) return byWeight;
        return this.product.getName().compareTo( o.product.getName() );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductDiscountDTO that = (ProductDiscountDTO) o;
        return Objects.equals( product.getName(), that.product.getName() ) && Objects
                .equals( product.getWeight(), that.product.getWeight() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( product );
    }
}
