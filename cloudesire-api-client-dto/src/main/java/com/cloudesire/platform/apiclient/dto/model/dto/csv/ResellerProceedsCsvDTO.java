package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "product", "distributor", "vendor", "buyer", "purchased", "type", "description", "quantity", "sellin", "sellout" } )
public class ResellerProceedsCsvDTO extends ResellingProceedsCsvDTO
{
    private String distributor;

    private String buyer;

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

    public String getBuyer()
    {
        return buyer;
    }

    public void setBuyer( String buyer )
    {
        this.buyer = buyer;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }
    // endregion
}
