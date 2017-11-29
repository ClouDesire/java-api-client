package com.liberologico.cloudesire.cmw.model.dto;

public class ProductCategoryDTO extends NamedEntityDTO
{
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
