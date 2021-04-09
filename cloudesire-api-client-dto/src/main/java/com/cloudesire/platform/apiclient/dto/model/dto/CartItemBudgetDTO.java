package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "A budget estimate for an item in a cart" )
public class CartItemBudgetDTO extends DTO
{
    private BudgetDTO budget;

    @ApiModelProperty( "Requested quantity for the item" )
    private Integer quantity;

    @ApiModelProperty( "Budget price multiplied quantity for the item" )
    private BigDecimal subTotal;

    public BudgetDTO getBudget()
    {
        return budget;
    }

    public void setBudget( BudgetDTO budget )
    {
        this.budget = budget;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal()
    {
        return subTotal;
    }

    public void setSubTotal( BigDecimal subTotal )
    {
        this.subTotal = subTotal;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CartItemBudgetDTO that = (CartItemBudgetDTO) o;
        return Objects.equals( budget, that.budget ) && Objects.equals( quantity, that.quantity ) && Objects.equals(
                subTotal, that.subTotal );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( budget, quantity, subTotal );
    }
}
