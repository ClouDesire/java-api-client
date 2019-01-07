package com.cloudesire.platform.apiclient.dto.model.dto;

/**
 * This is the output DTO for order
 *
 * @see OrderInputDTO the input DTO
 */
public class OrderDTO extends BaseOrderDTO
{
    private UrlEntityDTO distributor;

    private UrlEntityDTO reseller;

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
}
