package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "A CalendarPeriod represents the abstract concept of a time period that has a canonical start. All calendar times begin at 12 AM UTC." )
public enum CalendarPeriod
{
    @Schema( description = "A Month starts on the first day of each month")
    MONTH,

    @Schema( description = "A Quarter starts on dates January 1, April 1, July 1, and October 1 of each year")
    QUARTER,

    @Schema( description = "A Year starts on January 1")
    YEAR
}
