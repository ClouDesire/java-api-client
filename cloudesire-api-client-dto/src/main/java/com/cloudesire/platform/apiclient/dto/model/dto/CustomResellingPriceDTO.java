package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomResellingPriceDTO extends BaseResellingPriceDTO
{
    @Size( min = 1, max = 125 )
    private String identifier;

    public CustomResellingPriceDTO( String identifier, BigDecimal sellout )
    {
        this.identifier = identifier;
        this.price = new ResellingPriceDTO( null, sellout );
    }

    public CustomResellingPriceDTO()
    {
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CustomResellingPriceDTO that = (CustomResellingPriceDTO) o;
        return Objects.equals( identifier, that.identifier );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), identifier );
    }
}
