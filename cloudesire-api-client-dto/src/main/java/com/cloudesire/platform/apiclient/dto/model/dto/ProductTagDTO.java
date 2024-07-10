package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;

@Schema( description = "A label to tag a product" )
public class ProductTagDTO implements DTO
{
    @Schema( description = "Tag description")
    private String tag;

    @Schema( description = "Tag type")
    private String type;

    @Schema( description = "How many products for the tag are present", accessMode = READ_ONLY )
    private Long productCount = 0L;

    //region Auto-generated code
    public ProductTagDTO( String tag, String type )
    {
        this( tag );
        this.type = type;
    }

    public ProductTagDTO( String tag )
    {
        this.tag = tag;
    }

    public ProductTagDTO()
    {
    }

    public String getTag()
    {
        return tag;
    }

    public ProductTagDTO setTag( String tag )
    {
        this.tag = tag;
        return this;
    }

    public String getType()
    {
        return type;
    }

    public ProductTagDTO setType( String type )
    {
        this.type = type;
        return this;
    }

    public Long getProductCount()
    {
        return productCount;
    }

    public ProductTagDTO setProductCount( Long productCount )
    {
        this.productCount = productCount;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductTagDTO that = (ProductTagDTO) o;
        return Objects.equals( tag, that.tag ) && Objects.equals( type, that.type );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( tag, type );
    }

    @Override
    public String toString()
    {
        return "ProductTagDTO{" + "tag='" + tag + '\'' + ", type='" + type + '\'' + '}';
    }
    //endregion
}
