package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;
import java.util.Objects;

/**
 * This is the output DTO for order
 *
 * @see OrderInputDTO the input DTO
 */
public class OrderDTO extends BaseOrderDTO
{
    private UrlEntityDTO distributor;

    private UrlEntityDTO reseller;

    private List<SubscriptionBillingItemDTO> billingItems;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals( distributor, orderDTO.distributor ) && Objects.equals( reseller, orderDTO.reseller );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), distributor, reseller );
    }
}
