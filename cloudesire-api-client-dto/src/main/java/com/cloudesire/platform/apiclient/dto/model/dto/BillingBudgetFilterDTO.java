package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CalendarPeriod;
import io.swagger.annotations.ApiModel;

@ApiModel( description = "A timeframe definition for a budget." )
public class BillingBudgetFilterDTO implements DTO
{
    private CalendarPeriod calendarPeriod = CalendarPeriod.MONTH;

    public BillingBudgetFilterDTO( CalendarPeriod calendarPeriod )
    {
        this.calendarPeriod = calendarPeriod;
    }

    public BillingBudgetFilterDTO()
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
}
