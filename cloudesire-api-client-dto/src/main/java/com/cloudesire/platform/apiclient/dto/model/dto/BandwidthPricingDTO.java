package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "Defines pricing of bandwidth used by a VM" )
public class BandwidthPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "Chosen price" )
    @Min ( 0 )
    @NotNull
    private BigDecimal price;

    @ApiModelProperty( "Bandwidth sizing" )
    @Min ( 0 )
    @NotNull
    private BigDecimal traffic;

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

    public BigDecimal getTraffic()
    {
        return traffic;
    }

    public void setTraffic( BigDecimal traffic )
    {
        this.traffic = traffic;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        BandwidthPricingDTO that = (BandwidthPricingDTO) o;
        return cloudProvider.equals( that.cloudProvider ) && price.equals( that.price ) && traffic
                .equals( that.traffic );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider, price, traffic );
    }
}
