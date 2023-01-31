package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class CloudProviderPatchDTO implements DTO
{
    @NotNull
    private Action action;

    @ApiModelProperty( "Conversion factors from foreign currencies" )
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
        @ApiModelProperty( "Enable a cloud provider" )
        ENABLE,

        @ApiModelProperty( "Disable a cloud provider" )
        DISABLE,

        @ApiModelProperty( "Save currency conversion factors" )
        SAVE_CURRENCY_CONVERSION;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
