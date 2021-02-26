package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.List;

public class SubscriptionDetailDTO extends SubscriptionDTO
{
    private List<ApplicationCredentialOutputDTO> credentials;

    private List<UrlEntityDTO> possibleUpgrades;

    private List<BillingItemValueDTO> billingItemValues;

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
}
