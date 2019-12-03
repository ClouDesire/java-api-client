package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class BillingItemResellingPriceDTO extends BaseResellingPriceDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO billingItemValue;

    @Valid
    private ResellingPriceDTO setup;

    public BillingItemResellingPriceDTO( int billingItemValueId, BigDecimal sellout )
    {
        this( billingItemValueId );
        this.price = new ResellingPriceDTO( null, sellout );
    }

    public BillingItemResellingPriceDTO( int billingItemValueId )
    {
        this.billingItemValue = new UrlEntityDTO( "billingItemValue/" + billingItemValueId );
    }

    // region Auto-generated code
    public BillingItemResellingPriceDTO()
    {
    }

    public UrlEntityDTO getBillingItemValue()
    {
        return billingItemValue;
    }

    public void setBillingItemValue( UrlEntityDTO billingItemValue )
    {
        this.billingItemValue = billingItemValue;
    }

    public ResellingPriceDTO getSetup()
    {
        return setup;
    }

    public void setSetup( ResellingPriceDTO setup )
    {
        this.setup = setup;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        BillingItemResellingPriceDTO that = (BillingItemResellingPriceDTO) o;
        return Objects.equals( billingItemValue, that.billingItemValue );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), billingItemValue );
    }
    // endregion
}
