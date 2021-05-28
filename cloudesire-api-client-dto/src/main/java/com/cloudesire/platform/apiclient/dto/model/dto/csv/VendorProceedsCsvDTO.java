package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.common.MathConfiguration;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "invoiceId", "product", "customer", "email", "address", "fiscalCode", "taxCode", "purchased",
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

    public void setVendorIncome( BigDecimal vendorIncome, int scale )
    {
        this.vendorIncome = vendorIncome.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }

    public BigDecimal getCloudCosts()
    {
        return cloudCosts;
    }

    public void setCloudCosts( BigDecimal cloudCosts, int scale )
    {
        this.cloudCosts = cloudCosts.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }

    public BigDecimal getWholesale()
    {
        return wholesale;
    }

    public void setWholesale( BigDecimal wholesale, int scale )
    {
        this.wholesale = wholesale.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }
}
