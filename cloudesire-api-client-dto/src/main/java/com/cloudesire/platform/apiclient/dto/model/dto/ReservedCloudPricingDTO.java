package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class ReservedCloudPricingDTO implements DTO
{
    @Schema( description = "One-time upfront cost")
    @NotNull
    private BigDecimal upfront;

    @Schema( description = "Monthly price")
    @NotNull
    private BigDecimal price;

    @Schema( description = "Monthly cost")
    @NotNull
    private BigDecimal cost;

    public ReservedCloudPricingDTO( @NotNull BigDecimal upfront, @NotNull BigDecimal price, @NotNull BigDecimal cost )
    {
        this.upfront = upfront;
        this.price = price;
        this.cost = cost;
    }

    public ReservedCloudPricingDTO( @NotNull BigDecimal upfront, @NotNull BigDecimal price )
    {
        this( upfront, price, price );
    }

    public ReservedCloudPricingDTO( @NotNull BigDecimal price )
    {
        this( new BigDecimal( "0.000000" ), price );
    }

    public ReservedCloudPricingDTO()
    {
    }

    public BigDecimal getUpfront()
    {
        return upfront;
    }

    public void setUpfront( BigDecimal upfront )
    {
        this.upfront = upfront;
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
        ReservedCloudPricingDTO that = (ReservedCloudPricingDTO) o;
        return Objects.equals( upfront, that.upfront ) && Objects.equals( price, that.price );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( upfront, price );
    }

    @Override
    public String toString()
    {
        return "ReservedCloudPricingDTO{" + "upfront=" + upfront + ", price=" + price + '}';
    }
}
