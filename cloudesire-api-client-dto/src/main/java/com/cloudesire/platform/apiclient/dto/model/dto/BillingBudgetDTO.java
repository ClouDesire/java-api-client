package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel( description = "A budget describes what you expect to spend on your subscriptions in a certain timeframe." )
public class BillingBudgetDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private BillingBudgetFilterDTO filter = new BillingBudgetFilterDTO();

    @NotNull
    @Valid
    private BillingBudgetAmountDTO amount;

    public BillingBudgetDTO( String name )
    {
        super( name );
    }

    public BillingBudgetDTO()
    {
    }

    public BillingBudgetFilterDTO getFilter()
    {
        return filter;
    }

    public void setFilter( BillingBudgetFilterDTO filter )
    {
        this.filter = filter;
    }

    public BillingBudgetAmountDTO getAmount()
    {
        return amount;
    }

    public void setAmount( BillingBudgetAmountDTO amount )
    {
        this.amount = amount;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        BillingBudgetDTO that = (BillingBudgetDTO) o;
        return Objects.equals( filter, that.filter );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), filter );
    }
}
