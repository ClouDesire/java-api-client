package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SubscriptionDTO extends BaseSubscriptionDTO
{
    @ApiModelProperty( value = "Extra resources for this subscription", readOnly = true )
    private List<SubscriptionBillingItemDTO> billingItems;

    public List<SubscriptionBillingItemDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<SubscriptionBillingItemDTO> billingItems )
    {
        this.billingItems = billingItems;
    }
}
