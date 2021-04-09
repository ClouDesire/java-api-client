package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

@ApiModel( description = "A budget estimate for a cart" )
public class CartBudgetDTO extends DTO
{
    private List<CartItemBudgetDTO> items;

    @ApiModelProperty( "Total price of all the items in cart" )
    private BigDecimal total;

    public List<CartItemBudgetDTO> getItems()
    {
        return items;
    }

    public void setItems( List<CartItemBudgetDTO> items )
    {
        this.items = items;
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public void setTotal( BigDecimal total )
    {
        this.total = total;
    }
}
