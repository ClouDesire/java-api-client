package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.Objects;

public class ProductVersionDraftDTO implements ProductVersionL10nDTO
{
    @Valid
    private UrlEntityDTO original;
    private String description;

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void setDescription( String description )
    {
        this.description = description;
    }

    public UrlEntityDTO getOriginal()
    {
        return original;
    }

    public ProductVersionDraftDTO setOriginal( UrlEntityDTO original )
    {
        this.original = original;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductVersionDraftDTO that = (ProductVersionDraftDTO) o;
        return Objects.equals( original, that.original ) && Objects.equals( description, that.description );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( original, description );
    }
}
