package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ResellerPricingPatchDTO extends DTO
{
    @NotNull
    private Action action;

    private BigDecimal percentage;

    public ResellerPricingPatchDTO( Action action )
    {
        this.action = action;
    }

    public ResellerPricingPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction( Action action )
    {
        this.action = action;
    }

    public BigDecimal getPercentage()
    {
        return percentage;
    }

    public void setPercentage( BigDecimal percentage )
    {
        this.percentage = percentage;
    }

    public enum Action
    {
        MASS_UPDATE_CLOUD_PRICINGS
    }
}
