package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

@Schema( description = "A category of products" )
public class ProductCategoryDTO extends NamedEntityDTO
{
    private String slug;

    private UrlEntityDTO reseller;

    private Integer weight;

    @Schema( description = "How many products for the category are present", readOnly = true )
    private Long productCount = 0L;

    public ProductCategoryDTO( String name )
    {
        super( name );
    }

    public ProductCategoryDTO()
    {
    }

    @Override
    public String getResourceName()
    {
        if ( this.entityToken == null ) return "category";
        return this.entityToken;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug( String slug )
    {
        this.slug = slug;
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight( Integer weight )
    {
        this.weight = weight;
    }

    public Long getProductCount()
    {
        return productCount;
    }

    public void setProductCount( Long productCount )
    {
        this.productCount = productCount;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductCategoryDTO that = (ProductCategoryDTO) o;
        return Objects.equals( weight, that.weight ) && Objects.equals( productCount, that.productCount );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), weight, productCount );
    }
}
