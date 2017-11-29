package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ResellingTotalsDTO extends DTO
{
    @ApiModelProperty( value = "The total proceeds for the distributor", readOnly = true )
    private BigDecimal sellin;

    @ApiModelProperty( value = "The total proceeds for the reseller", readOnly = true )
    private BigDecimal netSellout;

    public ResellingTotalsDTO( BigDecimal sellin, BigDecimal netSellout )
    {
        this.sellin = sellin;
        this.netSellout = netSellout;
    }

    public ResellingTotalsDTO()
    {
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getNetSellout()
    {
        return netSellout;
    }

    public void setNetSellout( BigDecimal netSellout )
    {
        this.netSellout = netSellout;
    }
}
