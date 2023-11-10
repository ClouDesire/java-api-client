package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class ProductVersionPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @ApiModelProperty( "Conversion factors from foreign currencies" )
    private Map<String, BigDecimal> currencyConversion;

    public ProductVersionPatchDTO( Action action )
    {
        this.action = action;
    }

    public ProductVersionPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public ProductVersionPatchDTO setAction( Action action )
    {
        this.action = action;
        return this;
    }

    public Map<String, BigDecimal> getCurrencyConversion()
    {
        return currencyConversion;
    }

    public ProductVersionPatchDTO setCurrencyConversion( Map<String, BigDecimal> currencyConversion )
    {
        this.currencyConversion = currencyConversion;
        return this;
    }

    public enum Action
    {
        @ApiModelProperty( "Save currency conversion factors" )
        SAVE_CURRENCY_CONVERSION;
    }
}
