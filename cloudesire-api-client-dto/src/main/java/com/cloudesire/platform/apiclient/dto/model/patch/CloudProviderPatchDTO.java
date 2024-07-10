package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.liberologico.cloudesire.common.validators.CurrencyMap;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class CloudProviderPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @Schema( description = "Conversion factors from foreign currencies")
    @CurrencyMap
    private Map<String, BigDecimal> currencyConversion;

    public CloudProviderPatchDTO( Action action )
    {
        this.action = action;
    }

    public CloudProviderPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public CloudProviderPatchDTO setAction( Action action )
    {
        this.action = action;
        return this;
    }

    public Map<String, BigDecimal> getCurrencyConversion()
    {
        return currencyConversion;
    }

    public CloudProviderPatchDTO setCurrencyConversion( Map<String, BigDecimal> currencyConversion )
    {
        this.currencyConversion = currencyConversion;
        return this;
    }

    public enum Action
    {
        @Schema( description = "Enable a cloud provider")
        ENABLE,

        @Schema( description = "Disable a cloud provider")
        DISABLE,

        @Schema( description = "Save currency conversion factors")
        SAVE_CURRENCY_CONVERSION;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
