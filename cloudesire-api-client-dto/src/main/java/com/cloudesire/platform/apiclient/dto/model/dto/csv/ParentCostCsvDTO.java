package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "subscription", "productVersion", "subscriptionName", "orderType", "orders", "typeCode", "description",
        "start", "end", "aggregationStart", "purchased", "nominee", "operator", "reseller", "quantity", "currency",
        "vendorIncome", "cloudCosts", "wholesale", "sellin", "sellout"
} )
public class ParentCostCsvDTO extends CostCsvDTO
{
    @JsonProperty( "Company" )
    private String nominee;

    @JsonProperty( "Buyer" )
    private String operator;

    @JsonProperty( "Vendor income" )
    private BigDecimal vendorIncome;

    @JsonProperty( "Cloud costs" )
    private BigDecimal cloudCosts;

    @JsonProperty( "Wholesale" )
    private BigDecimal wholesale;

    @JsonProperty( "Sellin" )
    private BigDecimal sellin;

    @JsonProperty( "Sellout" )
    private BigDecimal sellout;

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
