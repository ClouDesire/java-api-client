package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "subscription", "productVersion", "subscriptionName", "orderType", "orders", "typeCode", "description",
        "start", "end", "aggregationStart", "purchased", "nominee", "operator", "quantity", "currency",
        "sellin", "sellout"
} )
public class ResellerEarningsCsvDTO extends CostCsvDTO
{
    @JsonProperty( "Company" )
    private String nominee;

    @JsonProperty( "Buyer" )
    private String operator;

    @JsonProperty( "Sellin" )
    private BigDecimal sellin;

    @JsonProperty( "Sellout" )
    private BigDecimal sellout;

    @JsonIgnore
    @Override
    public String getReseller()
    {
        return null;
    }

    public String getNominee()
    {
        return nominee;
    }

    public void setNominee( String nominee )
    {
        this.nominee = nominee;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator( String operator )
    {
        this.operator = operator;
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
}
