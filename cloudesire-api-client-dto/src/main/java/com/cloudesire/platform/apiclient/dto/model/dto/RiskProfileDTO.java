package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class RiskProfileDTO extends NamedEntityDTO
{
    private BigDecimal limit;

    public BigDecimal getLimit()
    {
        return limit;
    }

    public void setLimit( BigDecimal limit )
    {
        this.limit = limit;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        RiskProfileDTO that = (RiskProfileDTO) o;
        return Objects.equals( limit, that.limit );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), limit );
    }
}
