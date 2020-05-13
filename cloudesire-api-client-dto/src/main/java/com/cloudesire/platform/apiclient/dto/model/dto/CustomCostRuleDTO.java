package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CustomCostRuleType;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class CustomCostRuleDTO extends DTO
{
    @NotNull
    private CustomCostRuleType ruleType;

    @NotNull
    private Integer weight;

    public CustomCostRuleDTO( CustomCostRuleType ruleType, Integer weight )
    {
        this.ruleType = ruleType;
        this.weight = weight;
    }

    public CustomCostRuleDTO()
    {
    }

    public CustomCostRuleType getRuleType()
    {
        return ruleType;
    }

    public void setRuleType( CustomCostRuleType ruleType )
    {
        this.ruleType = ruleType;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight( Integer weight )
    {
        this.weight = weight;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CustomCostRuleDTO that = (CustomCostRuleDTO) o;
        return ruleType == that.ruleType && Objects.equals( weight, that.weight );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( ruleType, weight );
    }
}
