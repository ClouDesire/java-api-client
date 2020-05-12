package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CustomCostRuleType;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomResellingPriceDTO extends BaseResellingPriceDTO
{
    @NotNull
    private CustomCostRuleDTO rule;

    public CustomResellingPriceDTO( CustomCostRuleType ruleType, String identifier, Integer weight, BigDecimal sellout )
    {
        this( sellout );
        this.rule = new CustomCostRuleDTO( ruleType, identifier, weight );
    }

    public CustomResellingPriceDTO( String identifier, BigDecimal sellout )
    {
        this( sellout );
        this.rule = new CustomCostRuleDTO( identifier );
    }

    private CustomResellingPriceDTO( BigDecimal sellout )
    {
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
