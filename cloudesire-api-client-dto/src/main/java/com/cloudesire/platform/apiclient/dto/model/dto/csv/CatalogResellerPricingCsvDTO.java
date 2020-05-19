package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "cloudProvider",
        "planIdentifier", "extraIdentifier", "cloudResource",
        "extraStart", "extraEnd", "cloudSpecs",
        "sellout", "selloutType", "setup", "setupType"
} )
public class CatalogResellerPricingCsvDTO extends CatalogPricingCsvDTO
{
    private BigDecimal sellout;

    private ResellingConfigurationType selloutType;

    @Override
    public CatalogResellerPricingCsvDTO copyVersion()
    {
        return new CatalogResellerPricingCsvDTO( plan, planIdentifier );
    }

    // region Getters & Setters
    private CatalogResellerPricingCsvDTO( String plan, String planIdentifier )
    {
        super( plan, planIdentifier );
    }

    public CatalogResellerPricingCsvDTO()
    {
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }

    public ResellingConfigurationType getSelloutType()
    {
        return selloutType;
    }

    public void setSelloutType( ResellingConfigurationType selloutType )
    {
        this.selloutType = selloutType;
    }

    @Override
    public String toString()
    {
        return '"'
                + plan + "\",\""
                + extra + "\",\""
                + cloudProvider + "\",\""
                + planIdentifier + "\",\""
                + extraIdentifier + "\",\""
                + cloudResource + "\",\""
                + extraStart + "\",\""
                + extraEnd + "\",\""
                + cloudSpecs + "\",\""
                + sellout + "\",\""
                + selloutType + "\",\""
                + setup + "\",\""
                + setupType
                + '"';
    }
    // endregion
}
