package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomSellinPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO distributorPricing;

    @Size( min = 1, max = 125 )
    private String identifier;

    @Valid
    private ResellingPriceDTO price;

    public CustomSellinPriceDTO( String identifier, BigDecimal markup )
    {
        this.identifier = identifier;
        this.price = new ResellingPriceDTO( markup );
    }

    // region Auto-generated code
    public CustomSellinPriceDTO()
    {
    }

    public UrlEntityDTO getDistributorPricing()
    {
        return distributorPricing;
    }

    public void setDistributorPricing( UrlEntityDTO distributorPricing )
    {
        this.distributorPricing = distributorPricing;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CustomSellinPriceDTO that = (CustomSellinPriceDTO) o;
        return Objects.equals( distributorPricing, that.distributorPricing ) && Objects
                .equals( identifier, that.identifier );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( distributorPricing, identifier );
    }
    // endregion
}
