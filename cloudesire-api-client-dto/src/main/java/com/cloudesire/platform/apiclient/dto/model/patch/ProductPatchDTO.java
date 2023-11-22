package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class ProductPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @ApiModelProperty( "Conversion factors from foreign currencies" )
    private Map<String, BigDecimal> currencyConversion;

    public ProductPatchDTO( Action action )
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

    public enum Action
    {
        ENABLED,
        DISABLED,
        APPROVE,
        @ApiModelProperty( "Save currency conversion factors" )
        SAVE_CURRENCY_CONVERSION;
    }
}
