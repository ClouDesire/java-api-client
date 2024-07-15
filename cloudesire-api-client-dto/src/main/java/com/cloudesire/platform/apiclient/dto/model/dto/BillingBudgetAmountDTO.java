package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;

@Schema( description = "Budgeted amount." )
public class BillingBudgetAmountDTO implements DTO
{
    @Schema( description = "A specified amount to use as the budget")
    @Min( 0 )
    @NotNull
    private BigDecimal specifiedAmount;

    @Schema( description = "The current amount for the budget", accessMode = READ_ONLY )
    private BigDecimal currentAmount;

    public BillingBudgetAmountDTO( BigDecimal specifiedAmount )
    {
        this.specifiedAmount = specifiedAmount;
    }

    public BillingBudgetAmountDTO()
    {
    }

    public BigDecimal getSpecifiedAmount()
    {
        return specifiedAmount;
    }

    public void setSpecifiedAmount( BigDecimal specifiedAmount )
    {
        this.specifiedAmount = specifiedAmount;
    }

    public BigDecimal getCurrentAmount()
    {
        return currentAmount;
    }

    public void setCurrentAmount( BigDecimal currentAmount )
    {
        this.currentAmount = currentAmount;
    }
}
