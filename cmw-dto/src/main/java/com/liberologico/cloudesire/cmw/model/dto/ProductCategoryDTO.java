package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( "A category of products" )
public class ProductCategoryDTO extends NamedEntityDTO
{
    @ApiModelProperty( "How many products for the category are present" )
    private Long productCount = 0L;

    @Override
    public String getResourceName()
    {
        if ( this.entityToken == null ) return "category";
        return this.entityToken;
    }

    public Long getProductCount()
    {
        return productCount;
    }

    public void setProductCount( Long productCount )
    {
        this.productCount = productCount;
    }
}
