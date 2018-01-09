package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PricingPatchDTO extends DTO
{
    @NotNull
    private BigDecimal price;

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }
}
