package com.liberologico.cloudesire.cmw.model.dto;

import java.util.List;

public class SubscriptionDTO extends BaseSubscriptionDTO
{
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
