package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Schema( description = "Budget estimate with line detail" )
public class BudgetDetailDTO extends BudgetDTO
{
    @Schema( description = "Billable entries for the estimate")
    private List<OrderLineDTO> lines = new LinkedList<>();

    @Schema( description = "Lines billed at the end of the billing period")
    private List<OrderLineDTO> postLines;

    public List<OrderLineDTO> getLines()
    {
        return lines;
    }

    public void setLines( List<OrderLineDTO> lines )
    {
        this.lines = lines;
    }

    public List<OrderLineDTO> getPostLines()
    {
        return postLines;
    }

    public void setPostLines( List<OrderLineDTO> postLines )
    {
        this.postLines = postLines;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        BudgetDetailDTO that = (BudgetDetailDTO) o;
        return Objects.equals( lines, that.lines );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), lines );
    }
}
