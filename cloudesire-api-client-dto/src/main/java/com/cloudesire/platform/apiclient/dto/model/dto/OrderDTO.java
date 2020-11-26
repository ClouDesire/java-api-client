package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderOperationType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderStatus;

import java.util.List;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.ApiVersion.V20201126;

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

    @UnsupportedAPI( sinceVersion = V20201126 )
    private Boolean deferred;

    @FieldAPI( sinceVersion = V20201126 )
    private OrderStatus status;

    @FieldAPI( sinceVersion = V20201126 )
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

    /**
     * @deprecated by {@link #getStatus()}
     */
    @Deprecated
    public Boolean getDeferred()
    {
        return deferred;
    }

    /**
     * @deprecated by {@link #setStatus(OrderStatus)}
     */
    @Deprecated
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
