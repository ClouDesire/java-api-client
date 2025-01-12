package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

abstract class CloudPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Schema( description = "Wholesale price")
    @NotNull
    private BigDecimal price;

    @Schema( description = "Cost for the platform owner")
    @NotNull
    private BigDecimal cost;

    CloudPricingDTO( @NotNull UrlEntityDTO cloudProvider, @NotNull BigDecimal price )
    {
        this.cloudProvider = cloudProvider;
        this.price = price;
    }

    CloudPricingDTO()
    {
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CloudPricingDTO that = (CloudPricingDTO) o;
        return cloudProvider.equals( that.cloudProvider ) && price.equals( that.price ) && cost.equals( that.cost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider, price, cost );
    }
}
