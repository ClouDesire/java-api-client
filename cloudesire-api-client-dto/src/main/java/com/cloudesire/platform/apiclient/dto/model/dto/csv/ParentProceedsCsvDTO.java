package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "invoiceId", "product", "distributor", "vendor", "customer", "email", "address", "fiscalCode",
        "taxCode", "purchased", "lineId", "type", "description", "quantity", "vendorIncome", "cloudCosts",
        "wholesale"
} )
public class ParentProceedsCsvDTO extends CustomerDetailsProceedsCsvDTO
{
    private String distributor;

    private BigDecimal vendorIncome;

    private BigDecimal cloudCosts;

    private BigDecimal wholesale;

    // region Auto-generated codess
    public String getDistributor()
    {
        return distributor;
    }

    public void setDistributor( String distributor )
    {
        this.distributor = distributor;
    }

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
    // endregion
}
