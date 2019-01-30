package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

public abstract class BillingItemCostLineDTO extends DTO
{
    private UrlEntityDTO billingItem;

    @ApiModelProperty( value = "Requested billing item maximum quantity", example = "15", readOnly = true )
    private Integer maximum;

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public Integer getMaximum()
    {
        return maximum;
    }

    public void setMaximum( Integer maximum )
    {
        this.maximum = maximum;
    }
}
