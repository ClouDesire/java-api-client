package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.databind.EnumNamingStrategies;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import com.liberologico.cloudesire.common.validators.CurrencyMap;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class ProductPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @Schema( description = "Conversion factors from foreign currencies")
    @CurrencyMap
    private Map<String, BigDecimal> currencyConversion;

    public static ProductPatchDTO enable()
    {
        return new ProductPatchDTO( Action.ENABLED );
    }

    public static ProductPatchDTO disable()
    {
        return new ProductPatchDTO( Action.DISABLED );
    }

    public static ProductPatchDTO approve()
    {
        return new ProductPatchDTO( Action.APPROVE );
    }

    public static ProductPatchDTO saveCurrencyConversion( Map<String, BigDecimal> currencyConversion )
    {
        return new ProductPatchDTO( Action.SAVE_CURRENCY_CONVERSION ).setCurrencyConversion( currencyConversion );
    }

    private ProductPatchDTO( Action action )
    {
        this.action = action;
    }

    public ProductPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public ProductPatchDTO setAction( Action action )
    {
        this.action = action;
        return this;
    }

    public Map<String, BigDecimal> getCurrencyConversion()
    {
        return currencyConversion;
    }

    public ProductPatchDTO setCurrencyConversion( Map<String, BigDecimal> currencyConversion )
    {
        this.currencyConversion = currencyConversion;
        return this;
    }

    @EnumNaming( EnumNamingStrategies.CamelCaseStrategy.class )
    public enum Action
    {
        ENABLED,
        DISABLED,
        APPROVE,
        @Schema( description = "Save currency conversion factors")
        SAVE_CURRENCY_CONVERSION;
    }
}
