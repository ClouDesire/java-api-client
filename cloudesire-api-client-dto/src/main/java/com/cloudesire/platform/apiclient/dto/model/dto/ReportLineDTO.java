package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

public abstract class ReportLineDTO extends BaseEntityDTO
{
    @ApiModelProperty( value = "The version of the product sold", readOnly = true )
    protected UrlEntityDTO productVersion;

    @ApiModelProperty( value = "When were the proceeds registered", readOnly = true, example = "2017-05-29" )
    protected Date purchased;

    @ApiModelProperty( value = "The user who bought this", readOnly = true )
    protected UrlEntityDTO buyer;

    @ApiModelProperty( value = "The invoice generating this", readOnly = true )
    protected UrlEntityDTO invoice;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ReportLineDTO ) ) return false;
        ReportLineDTO that = (ReportLineDTO) o;
        return Objects.equals( productVersion, that.productVersion ) && Objects.equals( purchased, that.purchased )
                && Objects.equals( buyer, that.buyer ) && Objects.equals( invoice, that.invoice );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( productVersion, purchased, buyer );
    }
}
