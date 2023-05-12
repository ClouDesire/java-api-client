package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@JsonPropertyOrder( {
        "subscription", "productVersion", "subscriptionName", "orderType", "orders", "typeCode", "description",
        "start", "end", "purchased", "nominee", "operator", "reseller", "quantity", "currency", "cost", "platformCost"
} )
public class CostCsvDTO implements DTO
{
    @JsonProperty( "Subscription ID" )
    private Integer subscription;

    @JsonProperty( "Product version" )
    private String productVersion;

    @JsonProperty( "Subscription name" )
    private String subscriptionName;

    @JsonProperty( "Order type" )
    private OrderType orderType;

    @JsonProperty( "Order ID" )
    private Set<Integer> orders;

    @JsonProperty( "Cost ID" )
    private String typeCode;

    @JsonProperty( "Cost description" )
    private String description;

    @JsonProperty( "Start date" )
    private Date start;

    @JsonProperty( "End date" )
    private Date end;

    @JsonProperty( "Company" )
    private String nominee;

    @JsonProperty( "Buyer" )
    private String operator;

    @JsonProperty( "Reseller" )
    private String reseller;

    @JsonProperty( "Purchase date" )
    private Date purchased;

    @JsonProperty( "Quantity" )
    private BigDecimal quantity;

    @JsonProperty( "Currency" )
    private String currency;

    @JsonProperty( "Revenues" )
    private BigDecimal cost;

    @JsonProperty( "Costs" )
    private BigDecimal platformCost;

    private Map<String, String> metadata;

    public Integer getSubscription()
    {
        return subscription;
    }

    public void setSubscription( Integer subscription )
    {
        this.subscription = subscription;
    }

    public String getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( String productVersion )
    {
        this.productVersion = productVersion;
    }

    public String getSubscriptionName()
    {
        return subscriptionName;
    }

    public void setSubscriptionName( String subscriptionName )
    {
        this.subscriptionName = subscriptionName;
    }

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void setOrderType( OrderType orderType )
    {
        this.orderType = orderType;
    }

    public Set<Integer> getOrders()
    {
        return orders;
    }

    public void setOrders( Set<Integer> orders )
    {
        this.orders = orders;
    }

    public String getTypeCode()
    {
        return typeCode;
    }

    public void setTypeCode( String typeCode )
    {
        this.typeCode = typeCode;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public Date getStart()
    {
        return start;
    }

    public void setStart( Date start )
    {
        this.start = start;
    }

    public Date getEnd()
    {
        return end;
    }

    public void setEnd( Date end )
    {
        this.end = end;
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

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity( BigDecimal quantity )
    {
        this.quantity = quantity;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }

    public BigDecimal getPlatformCost()
    {
        return platformCost;
    }

    public void setPlatformCost( BigDecimal platformCost )
    {
        this.platformCost = platformCost;
    }

    @JsonAnyGetter
    public Map<String, String> getMetadata()
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }
}
