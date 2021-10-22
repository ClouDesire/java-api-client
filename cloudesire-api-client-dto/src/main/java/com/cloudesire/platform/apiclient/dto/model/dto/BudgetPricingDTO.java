package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.Set;

public class BudgetPricingDTO implements DTO
{
    private BigDecimal license;

    private BigDecimal setup;

    private Set<BudgetBillingItemPricingDTO> billingItems;

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

    public Set<BudgetBillingItemPricingDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Set<BudgetBillingItemPricingDTO> billingItems )
    {
        this.billingItems = billingItems;
    }
}
