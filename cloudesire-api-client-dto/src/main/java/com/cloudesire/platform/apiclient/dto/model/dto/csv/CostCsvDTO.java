package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "subscription", "subscriptionName", "type", "billingItem", "identifier", "description", "start", "end",
        "purchased", "nominee", "operator", "currency", "cost"
} )
public class CostCsvDTO implements DTO
{
    private Integer subscription;

    private String subscriptionName;

    private LineType type;

    private String billingItem;

    private String identifier;

    private String description;

    private Date start;

    private Date end;

    private String nominee;

    private String operator;

    private Date purchased;

    private String currency;

    private BigDecimal cost;

    public Integer getSubscription()
    {
        return subscription;
    }

    public void setSubscription( Integer subscription )
    {
        this.subscription = subscription;
    }

    public String getSubscriptionName()
    {
        return subscriptionName;
    }

    public void setSubscriptionName( String subscriptionName )
    {
        this.subscriptionName = subscriptionName;
    }

    public LineType getType()
    {
        return type;
    }

    public void setType( LineType type )
    {
        this.type = type;
    }

    public String getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( String billingItem )
    {
        this.billingItem = billingItem;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
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

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
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
}
