package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;

@ApiModel( description = "A budget describes what you expect to spend on your subscriptions in a certain timeframe." )
public class BillingBudgetDTO extends NamedEntityDTO
{
    private BillingBudgetFilterDTO filter = new BillingBudgetFilterDTO();

    @ApiModelProperty( value = "The current spending for the budget", accessMode = READ_ONLY )
    private BigDecimal currentSpending;

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

    public BigDecimal getCurrentSpending()
    {
        return currentSpending;
    }

    public void setCurrentSpending( BigDecimal currentSpending )
    {
        this.currentSpending = currentSpending;
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
