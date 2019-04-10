package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class BillingItemSellinPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO distributorPricing;

    @NotNull
    @Valid
    private UrlEntityDTO billingItemValue;

    @Valid
    protected ResellingPriceDTO price;

    @Valid
    private ResellingPriceDTO setup;

    @ApiModelProperty( hidden = true )
    @Deprecated
    @Valid
    private ResellingPriceDTO recurring;

    public BillingItemSellinPriceDTO( int billingItemValueId, String markup )
    {
        this( billingItemValueId );
        this.price = new ResellingPriceDTO( new BigDecimal( markup ) );
    }

    public BillingItemSellinPriceDTO( int billingItemValueId )
    {
        this.billingItemValue = new UrlEntityDTO( "billingItemValue/" + billingItemValueId );
    }

    // region Auto-generated code
    public BillingItemSellinPriceDTO()
    {
    }

    public UrlEntityDTO getDistributorPricing()
    {
        return distributorPricing;
    }

    public void setDistributorPricing( UrlEntityDTO distributorPricing )
    {
        this.distributorPricing = distributorPricing;
    }

    public UrlEntityDTO getBillingItemValue()
    {
        return billingItemValue;
    }

    public void setBillingItemValue( UrlEntityDTO billingItemValue )
    {
        this.billingItemValue = billingItemValue;
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }

    public ResellingPriceDTO getSetup()
    {
        return setup;
    }

    public void setSetup( ResellingPriceDTO setup )
    {
        this.setup = setup;
    }

    @Deprecated
    public ResellingPriceDTO getRecurring()
    {
        return recurring;
    }

    @Deprecated
    public void setRecurring( ResellingPriceDTO recurring )
    {
        this.recurring = recurring;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BillingItemSellinPriceDTO that = (BillingItemSellinPriceDTO) o;
        return Objects.equals( distributorPricing, that.distributorPricing ) && Objects.equals( billingItemValue, that.billingItemValue );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( distributorPricing, billingItemValue );
    }
    // endregion
}
