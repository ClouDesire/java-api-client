package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderStatus;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Response of a PATCH action on a Subscription" )
public class SubscriptionPatchResponseDTO implements DTO
{
    @Schema( description = "Outcome of a Subscription upgrade")
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
