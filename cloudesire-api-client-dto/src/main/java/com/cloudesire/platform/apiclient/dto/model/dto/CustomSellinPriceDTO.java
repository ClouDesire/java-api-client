package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomSellinPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO distributorPricing;

    @NotNull
    private CustomCostRuleDTO rule;

    @Valid
    private ResellingPriceDTO price;

    public CustomSellinPriceDTO( String identifier, BigDecimal markup )
    {
        this.rule = new CustomCostRuleDTO( identifier );
        this.price = new ResellingPriceDTO( markup );
    }

    // region Auto-generated code
    public CustomSellinPriceDTO()
    {
    }

    public UrlEntityDTO getDistributorPricing()
    {
        return distributorPricing;
    }

    public void setDistributorPricing( UrlEntityDTO distributorPricing )
    {
        this.distributorPricing = distributorPricing;
    }

    public CustomCostRuleDTO getRule()
    {
        return rule;
    }

    public void setRule( CustomCostRuleDTO rule )
    {
        this.rule = rule;
    }

    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CustomSellinPriceDTO that = (CustomSellinPriceDTO) o;
        return Objects.equals( distributorPricing, that.distributorPricing ) && Objects
                .equals( rule, that.rule );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( distributorPricing, rule );
    }
    // endregion
}
