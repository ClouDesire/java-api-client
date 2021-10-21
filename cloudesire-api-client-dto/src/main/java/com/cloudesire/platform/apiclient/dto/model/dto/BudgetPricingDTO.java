package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;

public class BudgetPricingDTO implements DTO
{
    private BigDecimal license;

    private BigDecimal setup;

    public BigDecimal getLicense()
    {
        return license;
    }

    public void setLicense( BigDecimal license )
    {
        this.license = license;
    }

    public BigDecimal getSetup()
    {
        return setup;
    }

    public void setSetup( BigDecimal setup )
    {
        this.setup = setup;
    }
}
