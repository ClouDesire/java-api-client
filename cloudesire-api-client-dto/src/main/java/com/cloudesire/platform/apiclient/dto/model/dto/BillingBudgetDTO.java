package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Schema( description = "A budget describes what you expect to spend on your subscriptions in a certain timeframe." )
public class BillingBudgetDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private BillingBudgetFilterDTO filter = new BillingBudgetFilterDTO();

    @NotNull
    @Valid
    private BillingBudgetAmountDTO amount;

    @Valid
    private List<BillingBudgetThresholdDTO> thresholds;

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

    public List<BillingBudgetThresholdDTO> getThresholds()
    {
        return thresholds;
    }

    public void setThresholds( List<BillingBudgetThresholdDTO> thresholds )
    {
        this.thresholds = thresholds;
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
