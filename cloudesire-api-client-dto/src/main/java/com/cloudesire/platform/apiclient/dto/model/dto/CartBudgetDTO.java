package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Schema( description = "A budget estimate for a cart" )
public class CartBudgetDTO implements DTO
{
    private List<CartItemBudgetDTO> items;

    @Schema( description = "Total price of all the items in cart")
    private BigDecimal total;

    @Schema( description = "Total price of all the items in cart, excluding VAT")
    private BigDecimal totalExcludingVAT;

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

    public BigDecimal getTotalExcludingVAT()
    {
        return totalExcludingVAT;
    }

    public void setTotalExcludingVAT( BigDecimal totalExcludingVAT )
    {
        this.totalExcludingVAT = totalExcludingVAT;
    }
}
