package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.List;

public class BudgetPricingDTO implements DTO
{
    private BigDecimal license;

    private BigDecimal setup;

    private List<BudgetBillingItemPricingDTO> billingItems;

    private List<BudgetCloudPricingDTO> cloudPricings;

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

    public List<BudgetBillingItemPricingDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<BudgetBillingItemPricingDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public List<BudgetCloudPricingDTO> getCloudPricings()
    {
        return cloudPricings;
    }

    public void setCloudPricings( List<BudgetCloudPricingDTO> cloudPricings )
    {
        this.cloudPricings = cloudPricings;
    }
}
