package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

/**
 * This is the output DTO for order
 *
 * @see OrderInputDTO the input DTO
 */
@SuppressWarnings( "squid:S2160" )
public class OrderDTO extends BaseOrderDTO
{
    private UrlEntityDTO distributor;

    private UrlEntityDTO reseller;

    private List<SubscriptionBillingItemDTO> billingItems;

    private Boolean customerCloudCredential;

    public UrlEntityDTO getDistributor()
    {
        return distributor;
    }

    public void setDistributor( UrlEntityDTO distributor )
    {
        this.distributor = distributor;
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public List<SubscriptionBillingItemDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<SubscriptionBillingItemDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Boolean getCustomerCloudCredential()
    {
        return customerCloudCredential;
    }

    public void setCustomerCloudCredential( Boolean customerCloudCredential )
    {
        this.customerCloudCredential = customerCloudCredential;
    }
}
