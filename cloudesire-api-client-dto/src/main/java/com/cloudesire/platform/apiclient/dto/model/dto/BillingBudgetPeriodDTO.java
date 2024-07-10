package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CalendarPeriod;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

@Schema( description = "Timeframe definition for a billing budget. Either a calendar or a custom period can be defined." )
public class BillingBudgetPeriodDTO implements DTO
{
    private CalendarPeriod calendarPeriod;

    @Valid
    private CustomPeriodDTO customPeriod;

    public BillingBudgetPeriodDTO( CalendarPeriod calendarPeriod )
    {
        this.calendarPeriod = calendarPeriod;
    }

    public BillingBudgetPeriodDTO( CustomPeriodDTO customPeriod )
    {
        this.customPeriod = customPeriod;
    }

    public BillingBudgetPeriodDTO()
    {
    }

    public CalendarPeriod getCalendarPeriod()
    {
        return calendarPeriod;
    }

    public void setCalendarPeriod( CalendarPeriod calendarPeriod )
    {
        this.calendarPeriod = calendarPeriod;
    }

    public CustomPeriodDTO getCustomPeriod()
    {
        return customPeriod;
    }

    public void setCustomPeriod( CustomPeriodDTO customPeriod )
    {
        this.customPeriod = customPeriod;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BillingBudgetPeriodDTO that = (BillingBudgetPeriodDTO) o;
        return calendarPeriod == that.calendarPeriod && Objects.equals( customPeriod, that.customPeriod );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( calendarPeriod, customPeriod );
    }
}
