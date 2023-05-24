package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "A budget estimate for an item in a cart" )
public class CartItemBudgetDTO implements DTO
{
    private BudgetDetailDTO budget;

    private Integer id;

    @ApiModelProperty( "Requested quantity for the item" )
    private Integer quantity;

    @ApiModelProperty( "Budget price multiplied quantity for the item" )
    private BigDecimal subTotal;

    @ApiModelProperty( "Budget price multiplied quantity for the item, excluding VAT" )
    private BigDecimal subTotalExcludingVAT;

    public BudgetDetailDTO getBudget()
    {
        return budget;
    }

    public void setBudget( BudgetDetailDTO budget )
    {
        this.budget = budget;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
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

    public BigDecimal getSubTotalExcludingVAT()
    {
        return subTotalExcludingVAT;
    }

    public void setSubTotalExcludingVAT( BigDecimal subTotalExcludingVAT )
    {
        this.subTotalExcludingVAT = subTotalExcludingVAT;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CartItemBudgetDTO that = (CartItemBudgetDTO) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( id );
    }
}
