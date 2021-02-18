package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "cloudProvider",
        "planIdentifier", "extraIdentifier", "cloudResource",
        "extraStart", "extraEnd", "cloudSpecs",
        "markup", "markupType", "setup", "setupType",
        "recommendedSelloutPercentage"
} )
public class CatalogDistributorPricingCsvDTO extends CatalogPricingCsvDTO
{
    private BigDecimal markup;

    private ResellingConfigurationType markupType;

    private BigDecimal recommendedSelloutPercentage;

    @Override
    public CatalogDistributorPricingCsvDTO copyVersion()
    {
        return new CatalogDistributorPricingCsvDTO( plan, planIdentifier );
    }

    // region Getters & Setters
    private CatalogDistributorPricingCsvDTO( String plan, String planIdentifier )
    {
        super( plan, planIdentifier );
    }

    public CatalogDistributorPricingCsvDTO()
    {
    }

    public BigDecimal getMarkup()
    {
        return markup;
    }

    public void setMarkup( BigDecimal markup )
    {
        this.markup = markup;
    }

    public ResellingConfigurationType getMarkupType()
    {
        return markupType;
    }

    public void setMarkupType( ResellingConfigurationType markupType )
    {
        this.markupType = markupType;
    }

    public BigDecimal getRecommendedSelloutPercentage()
    {
        return recommendedSelloutPercentage;
    }

    public void setRecommendedSelloutPercentage( BigDecimal recommendedSelloutPercentage )
    {
        this.recommendedSelloutPercentage = recommendedSelloutPercentage;
    }

    @Override
    public String toString()
    {
        String separator = "\",\"";
        return '"'
                + plan + separator
                + extra + separator
                + cloudProvider + separator
                + planIdentifier + separator
                + extraIdentifier + separator
                + cloudResource + separator
                + extraStart + separator
                + extraEnd + separator
                + cloudSpecs + separator
                + markup + separator
                + markupType + separator
                + setup + separator
                + setupType + separator
                + recommendedSelloutPercentage
                + '"';
    }
    // endregion
}
