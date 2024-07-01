package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.CustomCostRuleType;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

public class CustomSellinPriceDTO extends BaseEntityDTO
{
    @Valid
    protected UrlEntityDTO distributorPricing;

    @NotNull
    @Size( min = 1, max = 125 )
    private String identifier;

    @FieldAPI( sinceVersion = ApiVersion.V20200513 )
    private CustomCostRuleDTO rule;

    @Valid
    private ResellingPriceDTO price;

    public CustomSellinPriceDTO( CustomCostRuleType ruleType, String identifier, Integer weight, BigDecimal markup )
    {
        this.identifier = identifier;
        this.rule = new CustomCostRuleDTO( ruleType, weight );
        this.price = new ResellingPriceDTO( markup );
    }

    public CustomSellinPriceDTO( String identifier, BigDecimal markup )
    {
        this.identifier = identifier;
        this.rule = new CustomCostRuleDTO( CustomCostRuleType.EXACT, 0 );
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

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
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
        return Objects.equals( distributorPricing, that.distributorPricing ) && Objects.equals( identifier,
                that.identifier ) && Objects.equals( rule, that.rule );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( distributorPricing, identifier, rule );
    }
    // endregion
}
