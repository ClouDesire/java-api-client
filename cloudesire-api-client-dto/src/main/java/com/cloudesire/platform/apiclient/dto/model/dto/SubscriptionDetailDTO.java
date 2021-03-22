package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SubscriptionDetailDTO extends SubscriptionDTO
{
    private List<ApplicationCredentialOutputDTO> credentials;

    private List<UrlEntityDTO> possibleUpgrades;

    private List<BillingItemValueDTO> billingItemValues;

    private List<OneshotCostLineDTO> oneshotCosts;

    private List<RecurringCostLineDTO> recurringCosts;

    @ApiModelProperty( "Vault path for the customer cloud credentials for the subscription" )
    private String customerCredentialsPath;

    public List<ApplicationCredentialOutputDTO> getCredentials()
    {
        return credentials;
    }

    public void setCredentials( List<ApplicationCredentialOutputDTO> credentials )
    {
        this.credentials = credentials;
    }

    public List<UrlEntityDTO> getPossibleUpgrades()
    {
        return possibleUpgrades;
    }

    public void setPossibleUpgrades( List<UrlEntityDTO> possibleUpgrades )
    {
        this.possibleUpgrades = possibleUpgrades;
    }

    public List<BillingItemValueDTO> getBillingItemValues()
    {
        return billingItemValues;
    }

    public void setBillingItemValues( List<BillingItemValueDTO> billingItemValues )
    {
        this.billingItemValues = billingItemValues;
    }

    public String getCustomerCredentialsPath()
    {
        return customerCredentialsPath;
    }

    public void setCustomerCredentialsPath( String customerCredentialsPath )
    {
        this.customerCredentialsPath = customerCredentialsPath;
    }

    public List<OneshotCostLineDTO> getOneshotCosts()
    {
        return oneshotCosts;
    }

    public void setOneshotCosts( List<OneshotCostLineDTO> oneshotCosts )
    {
        this.oneshotCosts = oneshotCosts;
    }

    public List<RecurringCostLineDTO> getRecurringCosts()
    {
        return recurringCosts;
    }

    public void setRecurringCosts( List<RecurringCostLineDTO> recurringCosts )
    {
        this.recurringCosts = recurringCosts;
    }
}
