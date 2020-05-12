package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomResellingPriceDTO extends BaseResellingPriceDTO
{
    @NotNull
    private CustomCostRuleDTO rule;

    public CustomResellingPriceDTO( String identifier, BigDecimal sellout )
    {
        this.rule = new CustomCostRuleDTO( identifier );
        this.price = new ResellingPriceDTO( null, sellout );
    }

    public CustomResellingPriceDTO()
    {
    }

    public CustomCostRuleDTO getRule()
    {
        return rule;
    }

    public void setRule( CustomCostRuleDTO rule )
    {
        this.rule = rule;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CustomResellingPriceDTO that = (CustomResellingPriceDTO) o;
        return Objects.equals( rule, that.rule );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), rule );
    }
}
