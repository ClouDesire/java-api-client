package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ProceedsTotalsDTO extends DTO
{
    @ApiModelProperty( value = "The total earnings", readOnly = true )
    private BigDecimal earnings;

    @ApiModelProperty( value = "The total costs", readOnly = true )
    private BigDecimal costs;

    public ProceedsTotalsDTO( BigDecimal earnings, BigDecimal costs )
    {
        this.earnings = earnings;
        this.costs = costs;
    }

    public ProceedsTotalsDTO()
    {
    }

    public BigDecimal getEarnings()
    {
        return earnings;
    }

    public void setEarnings( BigDecimal earnings )
    {
        this.earnings = earnings;
    }

    public BigDecimal getCosts()
    {
        return costs;
    }

    public void setCosts( BigDecimal costs )
    {
        this.costs = costs;
    }
}
