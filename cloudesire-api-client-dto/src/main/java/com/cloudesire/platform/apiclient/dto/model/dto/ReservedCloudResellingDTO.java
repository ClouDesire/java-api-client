package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;

public class ReservedCloudResellingDTO extends DTO
{
    @NotNull
    private ResellingPriceDTO price;

    public ReservedCloudResellingDTO( @NotNull ResellingPriceDTO price )
    {
        this.price = price;
    }

    public ReservedCloudResellingDTO()
    {
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }
}
