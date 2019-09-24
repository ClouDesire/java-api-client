package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@ApiModel( description = "Configure pricing according to order minimum duration" )
public class HourlyCloudPricingDTO extends BaseEntityDTO
{
    private BigDecimal upfront;

    private Map<Integer, BigDecimal> prices;

    public BigDecimal getUpfront()
    {
        return upfront;
    }

    public void setUpfront( BigDecimal upfront )
    {
        this.upfront = upfront;
    }

    public Map<Integer, BigDecimal> getPrices()
    {
        return prices;
    }

    public void setPrices( Map<Integer, BigDecimal> prices )
    {
        this.prices = prices;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        HourlyCloudPricingDTO that = (HourlyCloudPricingDTO) o;
        return Objects.equals( upfront, that.upfront ) && Objects.equals( prices, that.prices );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), upfront, prices );
    }
}
