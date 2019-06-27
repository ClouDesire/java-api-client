package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@SuppressWarnings( "squid:S2637" )
abstract class CloudPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "Wholesale price" )
    @NotNull
    private BigDecimal price;

    @ApiModelProperty( "Cost for the platform owner" )
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
