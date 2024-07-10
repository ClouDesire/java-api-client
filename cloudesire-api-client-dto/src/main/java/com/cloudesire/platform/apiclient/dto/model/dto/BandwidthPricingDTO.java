package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Schema( description = "Defines pricing of bandwidth used by a VM" )
public class BandwidthPricingDTO extends CloudPricingDTO
{
    @Schema( description = "Bandwidth sizing")
    @Min ( 0 )
    @NotNull
    private BigDecimal traffic;

    public BigDecimal getTraffic()
    {
        return traffic;
    }

    public void setTraffic( BigDecimal traffic )
    {
        this.traffic = traffic;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        BandwidthPricingDTO that = (BandwidthPricingDTO) o;
        return traffic.equals( that.traffic );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), traffic );
    }
}
