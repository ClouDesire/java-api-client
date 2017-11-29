package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class BandwidthPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Min ( 0 )
    @NotNull
    private BigDecimal price;

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
}
