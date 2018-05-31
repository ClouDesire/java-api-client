package com.liberologico.cloudesire.cmw.model.dto;

import java.util.List;

public class SubscriptionDTO extends BaseSubscriptionDTO
{
    private List<SubscriptionBillingItemDTO> billingItems;

    private List<SubscriptionApiEndpointDTO> apiEndpoints;

    public List<SubscriptionBillingItemDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<SubscriptionBillingItemDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public List<SubscriptionApiEndpointDTO> getApiEndpoints()
    {
        return apiEndpoints;
    }

    public void setApiEndpoints( List<SubscriptionApiEndpointDTO> apiEndpoints )
    {
        this.apiEndpoints = apiEndpoints;
    }
}
