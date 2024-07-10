package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CalendarPeriod;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Objects;

@Schema( description = "A timeframe and filters for calculating a budget." )
public class BillingBudgetFilterDTO implements DTO
{
    @NotNull
    @Valid
    private BillingBudgetPeriodDTO period = new BillingBudgetPeriodDTO( CalendarPeriod.MONTH );

    @Schema( description = "Filter by single subscription")
    private UrlEntityDTO subscription;

    @Schema( description = "Filter by subscription metadata")
    private Map<String, String> metadata;

    @Schema( description = "Filter by cost tags")
    private Map<String, String> tags;

    public BillingBudgetFilterDTO( CalendarPeriod calendarPeriod )
    {
        this.period = new BillingBudgetPeriodDTO( calendarPeriod );
    }

    public BillingBudgetFilterDTO( CustomPeriodDTO customPeriod )
    {
        this.period = new BillingBudgetPeriodDTO( customPeriod );
    }

    public BillingBudgetFilterDTO()
    {
    }

    public BillingBudgetPeriodDTO getPeriod()
    {
        return period;
    }

    public void setPeriod( BillingBudgetPeriodDTO period )
    {
        this.period = period;
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public Map<String, String> getMetadata()
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }

    public Map<String, String> getTags()
    {
        return tags;
    }

    public void setTags( Map<String, String> tags )
    {
        this.tags = tags;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BillingBudgetFilterDTO that = (BillingBudgetFilterDTO) o;
        return Objects.equals( period, that.period ) && Objects.equals( subscription, that.subscription )
                && Objects.equals( metadata, that.metadata ) && Objects.equals( tags, that.tags );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( period, subscription, metadata, tags );
    }
}
