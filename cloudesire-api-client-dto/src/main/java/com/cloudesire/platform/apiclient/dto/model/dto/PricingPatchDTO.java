package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel( "Request a price change for a cloud price" )
public class PricingPatchDTO extends DTO
{
    @ApiModelProperty( "The new price" )
    private BigDecimal price;

    public PricingPatchDTO( @NotNull BigDecimal price )
    {
        this.price = price;
    }

    public PricingPatchDTO()
    {
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }
}