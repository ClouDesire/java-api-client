package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static com.cloudesire.platform.apiclient.dto.model.dto.PercentagePricingPatchDTO.Action.MASS_UPDATE;
import static com.cloudesire.platform.apiclient.dto.model.dto.PercentagePricingPatchDTO.Action.MASS_UPDATE_CLOUD_PRICINGS;

@Schema( description = "Mass actions for resold pricings" )
public class PercentagePricingPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @Schema( description = "Price change in percentage")
    private BigDecimal percentage;

    public PercentagePricingPatchDTO( Action action )
    {
        this.action = action;
    }

    @Schema( hidden = true )
    @AssertTrue( message = "Missing percentage value" )
    public boolean isValidAction()
    {
        if ( action == MASS_UPDATE || action == MASS_UPDATE_CLOUD_PRICINGS ) return percentage != null;

        return true;
    }

    public PercentagePricingPatchDTO()
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

    @Schema( description = "The defined action" )
    public enum Action
    {
        @Schema( description = "Update price and setup of every pricing")
        MASS_UPDATE,

        @Schema( description = "Update price of every cloud pricing defined in the pricings")
        MASS_UPDATE_CLOUD_PRICINGS
    }
}
