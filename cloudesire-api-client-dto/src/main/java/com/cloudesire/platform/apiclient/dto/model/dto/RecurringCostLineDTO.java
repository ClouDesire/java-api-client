package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

public class RecurringCostLineDTO extends OrderLineDTO
{
    @JsonInclude( JsonInclude.Include.NON_NULL )
    @Valid
    private UrlEntityDTO subscription;

    public RecurringCostLineDTO( double price, double vat )
    {
        this( BigDecimal.valueOf( price ), vat );
    }

    public RecurringCostLineDTO( BigDecimal price, double vat )
    {
        this.setPrice( new VATPriceDTO().withValue( price ).withVAT( new BigDecimal( vat ) ) );
    }

    public RecurringCostLineDTO()
    {
        super();
    }

    @Override
    public LineType getType()
    {
        return LineType.RECURRINGCOST;
    }

    @Override
    public void setType( LineType type )
    {
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public RecurringCostLineDTO setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        RecurringCostLineDTO that = (RecurringCostLineDTO) o;
        return Objects.equals( subscription, that.subscription );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), subscription );
    }
}
