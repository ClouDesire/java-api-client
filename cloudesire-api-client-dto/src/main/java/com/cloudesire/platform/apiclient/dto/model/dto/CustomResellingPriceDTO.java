package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.CustomCostRuleType;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.singletonList;

public class CustomResellingPriceDTO extends BaseEntityDTO
{
    @Valid
    private UrlEntityDTO resellerPricing;

    @FieldAPI( sinceVersion = ApiVersion.V20201104 )
    @Valid
    private List<VariableResellingPriceDTO> prices;

    @UnsupportedAPI( sinceVersion = ApiVersion.V20201104 )
    @Valid
    private ResellingPriceDTO price;

    @NotNull
    @Size( min = 1, max = 125 )
    private String identifier;

    @FieldAPI( sinceVersion = ApiVersion.V20200513 )
    private CustomCostRuleDTO rule;

    public CustomResellingPriceDTO( CustomCostRuleType ruleType, String identifier, Integer weight, BigDecimal sellout )
    {
        this( identifier, sellout );
        this.rule = new CustomCostRuleDTO( ruleType, weight );
    }

    public CustomResellingPriceDTO( String identifier, BigDecimal sellout )
    {
        this.identifier = identifier;
        this.prices = singletonList( new VariableResellingPriceDTO( sellout ) );
        this.rule = new CustomCostRuleDTO( CustomCostRuleType.EXACT, 0 );
    }

    public CustomResellingPriceDTO()
    {
    }

    public UrlEntityDTO getResellerPricing()
    {
        return resellerPricing;
    }

    public void setResellerPricing( UrlEntityDTO resellerPricing )
    {
        this.resellerPricing = resellerPricing;
    }

    public List<VariableResellingPriceDTO> getPrices()
    {
        return prices;
    }

    public void setPrices( List<VariableResellingPriceDTO> prices )
    {
        this.prices = prices;
    }

    /**
     * @deprecated by {@link #getPrices()}
     */
    @Deprecated
    public ResellingPriceDTO getPrice()
    {
        return price;
    }

    /**
     * @deprecated by {@link #setPrices(List)}
     */
    @Deprecated
    public void setPrice( ResellingPriceDTO price )
    {
        this.price = price;
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CustomResellingPriceDTO that = (CustomResellingPriceDTO) o;
        return Objects.equals( identifier, that.identifier ) && Objects.equals( rule, that.rule );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), identifier, rule );
    }
}
