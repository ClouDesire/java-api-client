package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "Defines pricing of disk usage of a VM" )
public class DiskSpacePricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "Chosen price" )
    @NotNull
    private BigDecimal price;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        DiskSpacePricingDTO that = (DiskSpacePricingDTO) o;
        return cloudProvider.equals( that.cloudProvider ) && price.equals( that.price );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider, price );
    }
}
