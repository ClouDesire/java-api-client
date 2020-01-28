package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

public class RecurringCostLineDTO extends OrderLineDTO
{
    @JsonInclude( JsonInclude.Include.NON_NULL )
    @Valid
    private UrlEntityDTO subscription;

    public RecurringCostLineDTO( BigDecimal price )
    {
        this( price, null );
    }

    public RecurringCostLineDTO( BigDecimal price, BigDecimal vat )
    {
        this.setPrice( new VATPriceDTO().withValue( price ).withVAT( vat ) );
    }

    public RecurringCostLineDTO()
    {
    }

    @Override
    public LineType getType()
    {
        return LineType.RECURRINGCOST;
    }

    @Override
    public void setType( LineType type )
    {
        // not required
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
        if ( ! super.equals( o ) ) return false;
        RecurringCostLineDTO that = (RecurringCostLineDTO) o;
        return Objects.equals( subscription, that.subscription );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), subscription );
    }
}
