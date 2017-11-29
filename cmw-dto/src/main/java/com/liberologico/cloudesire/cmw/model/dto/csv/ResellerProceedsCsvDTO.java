package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "product", "distributor", "reseller", "buyer", "purchased", "vendorIncome", "sellin",
        "netSellout", "vat" } )
public class ResellerProceedsCsvDTO extends ProceedsCsvDTO
{
    private String distributor;

    private String reseller;

    private BigDecimal vendorIncome;

    private BigDecimal sellin;

    private BigDecimal netSellout;

    // region Auto-generated codess

    public String getDistributor()
    {
        return distributor;
    }

    public void setDistributor( String distributor )
    {
        this.distributor = distributor;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
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

    public BigDecimal getVendorIncome()
    {
        return vendorIncome;
    }

    public void setVendorIncome( BigDecimal vendorIncome )
    {
        this.vendorIncome = vendorIncome;
    }

    // endregion
}
