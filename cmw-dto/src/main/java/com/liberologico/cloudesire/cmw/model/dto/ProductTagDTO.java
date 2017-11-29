package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Objects;

public class ProductTagDTO extends DTO
{
    private String tag;

    private String type;

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
    //endregion
}
