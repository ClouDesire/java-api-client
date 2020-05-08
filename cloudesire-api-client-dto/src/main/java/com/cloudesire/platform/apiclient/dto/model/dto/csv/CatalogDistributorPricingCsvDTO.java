package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "planIdentifier", "extraIdentifier", "extraStart", "extraEnd",
        "markup", "markupType", "setup", "setupType"
} )
public class CatalogDistributorPricingCsvDTO extends DTO
{
    private String plan;

    private String extra;

    private String planIdentifier;

    private String extraIdentifier;

    private Integer extraStart;

    private Integer extraEnd;

    private BigDecimal markup;

    private ResellingConfigurationType markupType;

    private BigDecimal setup;

    private ResellingConfigurationType setupType;

    public CatalogDistributorPricingCsvDTO copyVersion()
    {
        return new CatalogDistributorPricingCsvDTO( plan, planIdentifier );
    }

    // region Getters & Setters
    private CatalogDistributorPricingCsvDTO( String plan, String planIdentifier )
    {
        this.plan = plan;
        this.planIdentifier = planIdentifier;
    }

    public CatalogDistributorPricingCsvDTO()
    {
    }

    public String getPlan()
    {
        return plan;
    }

    public void setPlan( String plan )
    {
        this.plan = plan;
    }

    public String getExtra()
    {
        return extra;
    }

    public void setExtra( String extra )
    {
        this.extra = extra;
    }

    public String getPlanIdentifier()
    {
        return planIdentifier;
    }

    public String getExtraIdentifier()
    {
        return extraIdentifier;
    }

    public void setExtraIdentifier( String extraIdentifier )
    {
        this.extraIdentifier = extraIdentifier;
    }

    public Integer getExtraStart()
    {
        return extraStart;
    }

    public void setExtraStart( Integer extraStart )
    {
        this.extraStart = extraStart;
    }

    public Integer getExtraEnd()
    {
        return extraEnd;
    }

    public void setExtraEnd( Integer extraEnd )
    {
        this.extraEnd = extraEnd;
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
                + extra + "\",\""
                + planIdentifier + "\",\""
                + extraIdentifier + "\",\""
                + extraStart + "\",\""
                + extraEnd + "\",\""
                + markup + "\",\""
                + markupType + "\",\""
                + setup + "\",\""
                + setupType
                + '"';
    }
    // endregion
}
