package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "cloudProvider",
        "planIdentifier", "extraIdentifier", "cloudResource",
        "extraStart", "extraEnd", "cloudSpecs",
        "markup", "markupType", "setup", "setupType"
} )
public class CatalogDistributorPricingCsvDTO extends CatalogPricingCsvDTO
{
    private BigDecimal markup;

    private ResellingConfigurationType markupType;

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
                + markup + "\",\""
                + markupType + "\",\""
                + setup + "\",\""
                + setupType
                + '"';
    }
    // endregion
}