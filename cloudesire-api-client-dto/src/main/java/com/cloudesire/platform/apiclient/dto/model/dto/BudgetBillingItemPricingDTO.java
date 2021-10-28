package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;

public class BudgetBillingItemPricingDTO implements DTO
{
    private UrlEntityDTO billingItem;

    private Integer start;

    private Integer end;

    private BigDecimal price;

    private BigDecimal setup;

    private BigDecimal proportionalSetup;

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public Integer getStart()
    {
        return start;
    }

    public void setStart( Integer start )
    {
        this.start = start;
    }

    public Integer getEnd()
    {
        return end;
    }

    public void setEnd( Integer end )
    {
        this.end = end;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getSetup()
    {
        return setup;
    }

    public void setSetup( BigDecimal setup )
    {
        this.setup = setup;
    }

    public BigDecimal getProportionalSetup()
    {
        return proportionalSetup;
    }

    public void setProportionalSetup( BigDecimal proportionalSetup )
    {
        this.proportionalSetup = proportionalSetup;
    }
}
