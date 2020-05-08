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
public class CatalogDistributorPricingCsvDTO extends CatalogCsvDTO
{
    private String cloudProvider;

    private String cloudResource;

    private String cloudSpecs;

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

    public String getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( String cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public String getCloudResource()
    {
        return cloudResource;
    }

    public void setCloudResource( String cloudResource )
    {
        this.cloudResource = cloudResource;
    }

    public String getCloudSpecs()
    {
        return cloudSpecs;
    }

    public void setCloudSpecs( String cloudSpecs )
    {
        this.cloudSpecs = cloudSpecs;
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
