package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "plan", "planIdentifier", "markup", "markupType", "setup", "setupType" } )
public class CatalogDistributorPricingCsvDTO extends DTO
{
    private String plan;

    private String planIdentifier;

    private BigDecimal markup;

    private ResellingConfigurationType markupType;

    private BigDecimal setup;

    private ResellingConfigurationType setupType;

    // region Getters & Setters
    public String getPlan()
    {
        return plan;
    }

    public void setPlan( String plan )
    {
        this.plan = plan;
    }

    public String getPlanIdentifier()
    {
        return planIdentifier;
    }

    public void setPlanIdentifier( String planIdentifier )
    {
        this.planIdentifier = planIdentifier;
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
                + planIdentifier + "\",\""
                + markup + "\",\""
                + markupType + "\",\""
                + setup + "\",\""
                + setupType
                + '"';
    }
    // endregion
}
