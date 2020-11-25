package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderOperationType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderStatus;

import java.util.List;
import java.util.Set;

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

    private List<BillingItemValueDTO> billingItemValues;

    private Boolean customerCloudCredential;

    private Boolean deferred;

    private OrderStatus status;

    private Set<OrderOperationType> availableOperations;

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

    public List<BillingItemValueDTO> getBillingItemValues()
    {
        return billingItemValues;
    }

    public void setBillingItemValues( List<BillingItemValueDTO> billingItemValues )
    {
        this.billingItemValues = billingItemValues;
    }

    public Boolean getCustomerCloudCredential()
    {
        return customerCloudCredential;
    }

    public void setCustomerCloudCredential( Boolean customerCloudCredential )
    {
        this.customerCloudCredential = customerCloudCredential;
    }

    public Boolean getDeferred()
    {
        return deferred;
    }

    public void setDeferred( Boolean deferred )
    {
        this.deferred = deferred;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus( OrderStatus status )
    {
        this.status = status;
    }

    public Set<OrderOperationType> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<OrderOperationType> availableOperations )
    {
        this.availableOperations = availableOperations;
    }
}
