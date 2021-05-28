package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.common.MathConfiguration;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "invoiceId", "product", "distributor", "vendor", "customer", "email", "address", "fiscalCode",
        "taxCode", "purchased", "lineId", "type", "description", "quantity", "sellin", "sellout"
} )
public class ResellerProceedsCsvDTO extends CustomerDetailsProceedsCsvDTO
{
    private String distributor;

    private BigDecimal sellin;

    private BigDecimal sellout;

    // region Auto-generated codess
    public String getDistributor()
    {
        return distributor;
    }

    public void setDistributor( String distributor )
    {
        this.distributor = distributor;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin, int scale )
    {
        this.sellin = sellin.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout, int scale )
    {
        this.sellout = sellout.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }
    // endregion
}
