package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CalendarPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Map;

@ApiModel( description = "A timeframe and filters for calculating a budget." )
public class BillingBudgetFilterDTO implements DTO
{
    @NotNull
    private CalendarPeriod calendarPeriod = CalendarPeriod.MONTH;

    @ApiModelProperty( "Filter by subscription metadata" )
    private Map<String, String> metadata;

    @ApiModelProperty( "Filter by cost tags" )
    private Map<String, String> tags;

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
}
