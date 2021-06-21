package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "invoiceId", "subscriptionId", "product", "customer", "email", "address", "fiscalCode", "taxCode", "purchased",
        "vendorIncome", "cloudCosts", "wholesale"
} )
public class VendorProceedsCsvDTO extends CustomerDetailsProceedsCsvDTO
{
    private BigDecimal vendorIncome;

    private BigDecimal cloudCosts;

    private BigDecimal wholesale;

    public BigDecimal getVendorIncome()
    {
        return vendorIncome;
    }

    public void setVendorIncome( BigDecimal vendorIncome )
    {
        this.vendorIncome = vendorIncome;
    }

    public BigDecimal getCloudCosts()
    {
        return cloudCosts;
    }

    public void setCloudCosts( BigDecimal cloudCosts )
    {
        this.cloudCosts = cloudCosts;
    }

    public BigDecimal getWholesale()
    {
        return wholesale;
    }

    public void setWholesale( BigDecimal wholesale )
    {
        this.wholesale = wholesale;
    }
}
