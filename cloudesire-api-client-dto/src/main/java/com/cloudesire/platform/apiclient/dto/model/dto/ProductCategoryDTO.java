package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "A category of products" )
public class ProductCategoryDTO extends NamedEntityDTO
{
    @ApiModelProperty( value = "How many products for the category are present", readOnly = true )
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
