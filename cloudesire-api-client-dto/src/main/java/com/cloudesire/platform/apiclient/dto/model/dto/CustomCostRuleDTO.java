package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CustomCostRuleType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class CustomCostRuleDTO extends DTO
{
    @NotNull
    private CustomCostRuleType ruleType;

    @NotNull
    @Size( min = 1, max = 125 )
    private String identifier;

    @NotNull
    private Integer weight;

    public CustomCostRuleDTO( CustomCostRuleType ruleType, String identifier, Integer weight )
    {
        this.ruleType = ruleType;
        this.identifier = identifier;
        this.weight = weight;
    }

    public CustomCostRuleDTO( String identifier )
    {
        this( CustomCostRuleType.EXACT, identifier, 0 );
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

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
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
        return ruleType == that.ruleType && Objects.equals( identifier, that.identifier ) && Objects.equals( weight,
                that.weight );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( ruleType, identifier, weight );
    }
}
