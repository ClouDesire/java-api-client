package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.ResellingConfigurationType;

import java.math.BigDecimal;

abstract class CatalogPricingCsvDTO extends CatalogCsvDTO
{
    protected String cloudProvider;

    protected String cloudResource;

    protected String cloudSpecs;

    protected BigDecimal setup;

    protected ResellingConfigurationType setupType;

    // region Getters & Setters
    protected CatalogPricingCsvDTO( String plan, String planIdentifier )
    {
        super( plan, planIdentifier );
    }

    public CatalogPricingCsvDTO()
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
    // endregion
}
