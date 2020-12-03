package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class CartItemDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    public CartItemDTO( @NotNull @Valid UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public CartItemDTO()
    {
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CartItemDTO that = (CartItemDTO) o;
        return Objects.equals( productVersion, that.productVersion );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), productVersion );
    }
}
