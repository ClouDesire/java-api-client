package com.liberologico.cloudesire.cmw.model.filters;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.enums.DeploymentStatusEnum;
import com.liberologico.cloudesire.cmw.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;

public final class SubscriptionFilter extends PageRequestDTO
{
    @ApiModelProperty( "Fuzzy match by buyer, product or company" )
    private String filter;

    @ApiModelProperty( "Filter by deployment status" )
    private DeploymentStatusEnum status;

    @ApiModelProperty( "Filter by Order type" )
    private OrderType type;

    @ApiModelProperty( "Filter by Product ID" )
    private Integer product;

    public String getFilter()
    {
        return filter;
    }

    public void setFilter( String filter )
    {
        this.filter = filter;
    }

    public DeploymentStatusEnum getStatus()
    {
        return status;
    }

    public void setStatus( DeploymentStatusEnum status )
    {
        this.status = status;
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public Integer getProduct()
    {
        return product;
    }

    public void setProduct( Integer product )
    {
        this.product = product;
    }
}
