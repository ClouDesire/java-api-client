package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

@JsonPropertyOrder ( { "id", "name", "cost" } )
public class PricedEntityDTO extends NamedEntityDTO implements INamedEntityDTO
{
    @ApiModelProperty( value = "The sub-total price of the resource" )
    @NotEmpty
    private BigDecimal cost;

    public PricedEntityDTO()
    {
    }

    public PricedEntityDTO(BigDecimal cost)
    {
        this.cost = cost;
    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost( BigDecimal cost )
    {
        this.cost = cost;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        PricedEntityDTO that = (PricedEntityDTO) o;
        return Objects.equals( cost, that.cost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cost );
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "{" + "id=" + getId() + " name=" + getName() + " cost=" + getCost() + '}';
    }
}
