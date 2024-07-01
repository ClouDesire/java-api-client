package com.cloudesire.platform.apiclient.dto.model.dto;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class VariableResellingPriceDTO extends NamedEntityDTO
{
    @NotNull
    private Integer duration;

    private BigDecimal sellout;

    // region Auto-generated code
    public VariableResellingPriceDTO( String name, Integer duration, BigDecimal sellout )
    {
        super( name );
        this.duration = duration;
        this.sellout = sellout;
    }

    public VariableResellingPriceDTO( BigDecimal sellout )
    {
        this( "Default", 0, sellout );
    }

    public VariableResellingPriceDTO()
    {
    }

    public Integer getDuration()
    {
        return duration;
    }

    public void setDuration( Integer duration )
    {
        this.duration = duration;
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        VariableResellingPriceDTO that = (VariableResellingPriceDTO) o;
        return Objects.equals( duration, that.duration ) && Objects.equals( sellout, that.sellout );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), duration, sellout );
    }
    // endregion
}
