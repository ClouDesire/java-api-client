package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static com.liberologico.cloudesire.cmw.model.dto.ResellerPricingPatchDTO.Action.MASS_UPDATE;
import static com.liberologico.cloudesire.cmw.model.dto.ResellerPricingPatchDTO.Action.MASS_UPDATE_CLOUD_PRICINGS;

public class ResellerPricingPatchDTO extends DTO
{
    @NotNull
    private Action action;

    private BigDecimal percentage;

    public ResellerPricingPatchDTO( Action action )
    {
        this.action = action;
    }

    @AssertTrue( message = "Missing percentage value" )
    public boolean isValidAction()
    {
        if ( action == MASS_UPDATE || action == MASS_UPDATE_CLOUD_PRICINGS ) return percentage != null;

        return true;
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
        MASS_UPDATE, MASS_UPDATE_CLOUD_PRICINGS
    }
}
