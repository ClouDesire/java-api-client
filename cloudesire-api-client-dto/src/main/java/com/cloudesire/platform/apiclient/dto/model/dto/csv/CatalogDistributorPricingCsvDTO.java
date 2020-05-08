package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "planIdentifier", "extraIdentifier", "extraStart", "extraEnd",
        "markup", "markupType", "setup", "setupType"
} )
public class CatalogDistributorPricingCsvDTO extends CatalogCsvDTO
{
    private BigDecimal markup;

    private ResellingConfigurationType markupType;

    private BigDecimal setup;

    private ResellingConfigurationType setupType;

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

    public BigDecimal getSetup()
    {
        return setup;
    }

    public void setSetup( BigDecimal setup )
    {
        this.setup = setup;
    }

    public ResellingConfigurationType getSetupType()
    {
        return setupType;
    }

    public void setSetupType( ResellingConfigurationType setupType )
    {
        this.setupType = setupType;
    }

    @Override
    public String toString()
    {
        return super.toString() + ",\""
                + markup + "\",\""
                + markupType + "\",\""
                + setup + "\",\""
                + setupType
                + '"';
    }
    // endregion
}
