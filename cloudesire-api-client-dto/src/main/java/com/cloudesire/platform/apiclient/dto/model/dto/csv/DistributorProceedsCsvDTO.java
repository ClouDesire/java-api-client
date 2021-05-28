package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.common.MathConfiguration;

import java.math.BigDecimal;

@JsonPropertyOrder( { "invoiceId", "product", "reseller", "vendor", "purchased", "lineId", "type", "description", "quantity", "wholesale", "sellin" } )
public class DistributorProceedsCsvDTO extends ProceedsCsvDTO
{
    private String reseller;

    private BigDecimal wholesale;

    private BigDecimal sellin;

    // region Auto-generated codess
    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }

    public BigDecimal getWholesale()
    {
        return wholesale;
    }

    public void setWholesale( BigDecimal wholesale, int scale )
    {
        this.wholesale = wholesale.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin, int scale )
    {
        this.sellin = sellin.setScale( scale, MathConfiguration.ROUNDING_MODE );
    }
    // endregion
}
