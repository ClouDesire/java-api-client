package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

@Schema( description = "Request a price change for a cloud price" )
public class PricingPatchDTO implements DTO
{
    @Schema( description = "The new price")
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
