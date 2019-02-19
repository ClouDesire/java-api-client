package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SubscriptionListDTO extends BaseSubscriptionDTO
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
