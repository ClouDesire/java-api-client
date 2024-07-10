package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@Schema( description = "Defines pricing of disk usage of a VM" )
public class DiskSpacePricingDTO extends CloudPricingDTO
{
    @Schema( description = "Configure tiered pricing per disk size")
    private Map<Integer, BigDecimal> tiers;

    public Map<Integer, BigDecimal> getTiers()
    {
        return tiers;
    }

    public void setTiers( Map<Integer, BigDecimal> tiers )
    {
        this.tiers = tiers;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        DiskSpacePricingDTO that = (DiskSpacePricingDTO) o;
        return Objects.equals( tiers, that.tiers );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), tiers );
    }
}
