package com.cloudesire.platform.apiclient.dto.model.filters;

import com.cloudesire.platform.apiclient.dto.model.dto.PageRequestDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatusEnum;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;
import java.util.Set;

public final class SubscriptionFilter extends PageRequestDTO
{
    @ApiModelProperty( "Fuzzy match by buyer, product or company" )
    private String filter;

    @ApiModelProperty( "Filter by customer metadata" )
    private Map<String, String> metadata;

    @ApiModelProperty( "Filter by deployment status" )
    private Set<DeploymentStatusEnum> status;

    @ApiModelProperty( "Filter by Order type" )
    private OrderType type;

    @ApiModelProperty( "Filter by Product ID" )
    private Integer product;

    private ProductType productType;

    public String getFilter()
    {
        return filter;
    }

    public void setFilter( String filter )
    {
        this.filter = filter;
    }

    public Map<String, String> getMetadata()
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }

    public Set<DeploymentStatusEnum> getStatus()
    {
        return status;
    }

    public void setStatus( Set<DeploymentStatusEnum> status )
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

    public ProductType getProductType()
    {
        return productType;
    }

    public void setProductType( ProductType productType )
    {
        this.productType = productType;
    }
}
