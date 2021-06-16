package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Response of a PATCH action on a Subscription" )
public class SubscriptionPatchResponseDTO implements DTO
{
    @ApiModelProperty( "Outcome of a Subscription upgrade" )
    private OrderStatus upgrade;

    private UrlEntityDTO invoice;

    private UrlEntityDTO order;

    public OrderStatus getUpgrade()
    {
        return upgrade;
    }

    public void setUpgrade( OrderStatus upgrade )
    {
        this.upgrade = upgrade;
    }

    public UrlEntityDTO getInvoice()
    {
        return invoice;
    }

    public void setInvoice( UrlEntityDTO invoice )
    {
        this.invoice = invoice;
    }

    public UrlEntityDTO getOrder()
    {
        return order;
    }

    public void setOrder( UrlEntityDTO order )
    {
        this.order = order;
    }
}
