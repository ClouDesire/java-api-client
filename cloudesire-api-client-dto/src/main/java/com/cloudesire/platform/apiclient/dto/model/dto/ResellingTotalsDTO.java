package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * @deprecated by headers in GET /proceedsReport
 */
@Deprecated
public class ResellingTotalsDTO implements DTO
{
    @ApiModelProperty( value = "The total earnings", readOnly = true )
    private BigDecimal earnings;

    @ApiModelProperty( value = "The total costs", readOnly = true )
    private BigDecimal costs;

    public ResellingTotalsDTO( BigDecimal earnings, BigDecimal costs )
    {
        this.earnings = earnings;
        this.costs = costs;
    }

    public ResellingTotalsDTO()
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
