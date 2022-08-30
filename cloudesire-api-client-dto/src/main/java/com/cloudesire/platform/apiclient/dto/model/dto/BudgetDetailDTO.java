package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedList;
import java.util.List;

@ApiModel( description = "Budget estimate with line detail" )
public class BudgetDetailDTO extends BudgetDTO
{
    @ApiModelProperty( "Billable entries for the estimate" )
    private List<OrderLineDTO> lines = new LinkedList<>();

    @ApiModelProperty( "Lines billed at the end of the billing period" )
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
}
