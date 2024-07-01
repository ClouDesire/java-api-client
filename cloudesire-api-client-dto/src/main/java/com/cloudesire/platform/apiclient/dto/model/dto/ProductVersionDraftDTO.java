package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import java.util.Objects;

@Schema( description = "A draft of a product version description" )
public class ProductVersionDraftDTO implements ProductVersionL10nDTO
{
    @Valid
    private UrlEntityDTO original;

    @Schema( description = "Description of the product version")
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
