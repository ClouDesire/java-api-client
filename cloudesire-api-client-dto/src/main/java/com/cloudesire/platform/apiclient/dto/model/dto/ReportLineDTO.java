package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

public abstract class ReportLineDTO extends BaseEntityDTO
{
    protected UrlEntityDTO productVersion;

    @ApiModelProperty( value = "When were the proceeds registered", readOnly = true, example = "2017-05-29" )
    protected Date purchased;

    protected UrlEntityDTO buyer;

    protected UrlEntityDTO invoice;

    private UrlEntityDTO order;

    private OrderType orderType;

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }

    public UrlEntityDTO getBuyer()
    {
        return buyer;
    }

    public void setBuyer( UrlEntityDTO buyer )
    {
        this.buyer = buyer;
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

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void setOrderType( OrderType orderType )
    {
        this.orderType = orderType;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ReportLineDTO ) ) return false;
        ReportLineDTO that = (ReportLineDTO) o;
        return Objects.equals( productVersion, that.productVersion ) && Objects.equals( purchased, that.purchased )
                && Objects.equals( order, that.order ) && Objects.equals( orderType, that.orderType );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, purchased, order, orderType );
    }
}
