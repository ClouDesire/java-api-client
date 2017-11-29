package com.liberologico.cloudesire.cmw.model.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class StatisticsDTO extends DTO
{
    // region Customer fields
    private BigDecimal iaasExpenses;

    private BigDecimal licenseExpenses;
    // endregion

    // region root/supervisor/vendor fields
    private BigDecimal earnings;

    private BigDecimal grossEarnings;

    private BigDecimal normalExpenses;

    private BigDecimal trialExpenses;

    private BigDecimal sandboxExpenses;

    private Long customersCount;

    private Long companiesCount;

    private Long subscriptionsCount;

    private Long deployedSubscriptionsCount;

    private Long pendingSubscriptionsCount;

    private Long failedSubscriptionsCount;

    private Long productsCount;

    private Long publishedProductsCount;

    private Long normalOrdersCount;

    private Long trialOrdersCount;

    private Long renewalOrdersCount;

    private Long upsellOrdersCount;
    // endregion

    public BigDecimal getIaasExpenses()
    {
        return iaasExpenses;
    }

    public void setIaasExpenses( BigDecimal iaasExpenses )
    {
        this.iaasExpenses = iaasExpenses;
    }

    public BigDecimal getLicenseExpenses()
    {
        return licenseExpenses;
    }

    public void setLicenseExpenses( BigDecimal licenseExpenses )
    {
        this.licenseExpenses = licenseExpenses;
    }

    public BigDecimal getEarnings()
    {
        return earnings;
    }

    public void setEarnings( BigDecimal earnings )
    {
        this.earnings = earnings;
    }

    public BigDecimal getGrossEarnings()
    {
        return grossEarnings;
    }

    public void setGrossEarnings( BigDecimal grossEarnings )
    {
        this.grossEarnings = grossEarnings;
    }

    public BigDecimal getNormalExpenses()
    {
        return normalExpenses;
    }

    public void setNormalExpenses( BigDecimal normalExpenses )
    {
        this.normalExpenses = normalExpenses;
    }

    public BigDecimal getTrialExpenses()
    {
        return trialExpenses;
    }

    public void setTrialExpenses( BigDecimal trialExpenses )
    {
        this.trialExpenses = trialExpenses;
    }

    public BigDecimal getSandboxExpenses()
    {
        return sandboxExpenses;
    }

    public void setSandboxExpenses( BigDecimal sandboxExpenses )
    {
        this.sandboxExpenses = sandboxExpenses;
    }

    public Long getCustomersCount()
    {
        return customersCount;
    }

    public void setCustomersCount( Long customersCount )
    {
        this.customersCount = customersCount;
    }

    public Long getCompaniesCount()
    {
        return companiesCount;
    }

    public void setCompaniesCount( Long companiesCount )
    {
        this.companiesCount = companiesCount;
    }

    public Long getSubscriptionsCount()
    {
        return subscriptionsCount;
    }

    public void setSubscriptionsCount( Long subscriptionsCount )
    {
        this.subscriptionsCount = subscriptionsCount;
    }

    public Long getDeployedSubscriptionsCount()
    {
        return deployedSubscriptionsCount;
    }

    public void setDeployedSubscriptionsCount( Long deployedSubscriptionsCount )
    {
        this.deployedSubscriptionsCount = deployedSubscriptionsCount;
    }

    public Long getPendingSubscriptionsCount()
    {
        return pendingSubscriptionsCount;
    }

    public void setPendingSubscriptionsCount( Long pendingSubscriptionsCount )
    {
        this.pendingSubscriptionsCount = pendingSubscriptionsCount;
    }

    public Long getFailedSubscriptionsCount()
    {
        return failedSubscriptionsCount;
    }

    public void setFailedSubscriptionsCount( Long failedSubscriptionsCount )
    {
        this.failedSubscriptionsCount = failedSubscriptionsCount;
    }

    public Long getProductsCount()
    {
        return productsCount;
    }

    public void setProductsCount( Long productsCount )
    {
        this.productsCount = productsCount;
    }

    public Long getPublishedProductsCount()
    {
        return publishedProductsCount;
    }

    public void setPublishedProductsCount( Long publishedProductsCount )
    {
        this.publishedProductsCount = publishedProductsCount;
    }

    public Long getNormalOrdersCount()
    {
        return normalOrdersCount;
    }

    public void setNormalOrdersCount( Long normalOrdersCount )
    {
        this.normalOrdersCount = normalOrdersCount;
    }

    public Long getTrialOrdersCount()
    {
        return trialOrdersCount;
    }

    public void setTrialOrdersCount( Long trialOrdersCount )
    {
        this.trialOrdersCount = trialOrdersCount;
    }

    public Long getRenewalOrdersCount()
    {
        return renewalOrdersCount;
    }

    public void setRenewalOrdersCount( Long renewalOrdersCount )
    {
        this.renewalOrdersCount = renewalOrdersCount;
    }

    public Long getUpsellOrdersCount()
    {
        return upsellOrdersCount;
    }

    public void setUpsellOrdersCount( Long upsellOrdersCount )
    {
        this.upsellOrdersCount = upsellOrdersCount;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        StatisticsDTO that = (StatisticsDTO) o;
        return Objects.equals( iaasExpenses, that.iaasExpenses )
                && Objects.equals( licenseExpenses, that.licenseExpenses )
                && Objects.equals( earnings, that.earnings )
                && Objects.equals( normalExpenses, that.normalExpenses )
                && Objects.equals( trialExpenses, that.trialExpenses )
                && Objects.equals( sandboxExpenses, that.sandboxExpenses )
                && Objects.equals( customersCount, that.customersCount )
                && Objects.equals( subscriptionsCount, that.subscriptionsCount )
                && Objects.equals( deployedSubscriptionsCount, that.deployedSubscriptionsCount )
                && Objects.equals( pendingSubscriptionsCount, that.pendingSubscriptionsCount )
                && Objects.equals( failedSubscriptionsCount, that.failedSubscriptionsCount )
                && Objects.equals( productsCount, that.productsCount )
                && Objects.equals( publishedProductsCount, that.publishedProductsCount )
                && Objects.equals( normalOrdersCount, that.normalOrdersCount )
                && Objects.equals( trialOrdersCount, that.trialOrdersCount )
                && Objects.equals( renewalOrdersCount, that.renewalOrdersCount )
                && Objects.equals( upsellOrdersCount, that.upsellOrdersCount );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                iaasExpenses, licenseExpenses, earnings, normalExpenses, trialExpenses, sandboxExpenses,
                customersCount, companiesCount, subscriptionsCount, deployedSubscriptionsCount,
                pendingSubscriptionsCount, failedSubscriptionsCount, productsCount, publishedProductsCount,
                normalOrdersCount, trialOrdersCount, renewalOrdersCount, upsellOrdersCount
        );
    }
}
