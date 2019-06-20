package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Response of a PATCH action on a Subscription" )
public class SubscriptionPatchResponseDTO extends DTO
{
    @ApiModelProperty( "Outcome of a Subscription upgrade" )
    private Upgrade upgrade;

    private UrlEntityDTO invoice;

    private UrlEntityDTO order;

    public Upgrade getUpgrade()
    {
        return upgrade;
    }

    public void setUpgrade( Upgrade upgrade )
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

    public enum Upgrade
    {
        @ApiModelProperty( "An upgrade order has been deferred for the next billing period" )
        DEFERRED,

        @ApiModelProperty( "The upgrade order was free of charge" )
        FREE,

        @ApiModelProperty( "The upgrade has been applied and an Invoice has been emitted" )
        PAID
    }
}
