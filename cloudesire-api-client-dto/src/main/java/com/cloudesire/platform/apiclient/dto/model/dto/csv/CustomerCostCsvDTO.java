package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "subscription", "productVersion", "subscriptionName", "orderType", "orders", "typeCode", "description",
        "start", "end", "purchased", "reseller", "quantity", "currency", "cost"
} )
public class CustomerCostCsvDTO extends CostCsvDTO
{
    @JsonProperty( "Costs" )
    private BigDecimal cost;

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }
}
