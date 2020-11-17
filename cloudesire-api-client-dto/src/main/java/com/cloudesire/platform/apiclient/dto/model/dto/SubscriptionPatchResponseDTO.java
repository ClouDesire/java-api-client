package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderUpgradeStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Response of a PATCH action on a Subscription" )
public class SubscriptionPatchResponseDTO extends DTO
{
    @ApiModelProperty( "Outcome of a Subscription upgrade" )
    private OrderUpgradeStatus upgrade;

    private UrlEntityDTO invoice;

    private UrlEntityDTO order;

    public OrderUpgradeStatus getUpgrade()
    {
        return upgrade;
    }

    public void setUpgrade( OrderUpgradeStatus upgrade )
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
