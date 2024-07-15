package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Schema( description = "Custom period definition, alternative to CalendarPeriod." )
public class CustomPeriodDTO implements DTO
{
    @Schema( description = "Custom period start date, inclusive")
    @NotNull
    private LocalDate startDate;

    @Schema( description = "Custom period end date, exclusive. If null, period streches to now")
    private LocalDate endDate;

    public CustomPeriodDTO( LocalDate startDate, LocalDate endDate )
    {
        this( startDate );
        this.endDate = endDate;
    }

    public CustomPeriodDTO( LocalDate startDate )
    {
        this.startDate = startDate;
    }

    public CustomPeriodDTO()
    {
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate( LocalDate startDate )
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate( LocalDate endDate )
    {
        this.endDate = endDate;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CustomPeriodDTO that = (CustomPeriodDTO) o;
        return Objects.equals( startDate, that.startDate ) && Objects.equals( endDate, that.endDate );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( startDate, endDate );
    }
}
