package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class StatisticsDTO implements DTO
{
    @ApiModelProperty( "IAAS expenses for customer" )
    private BigDecimal iaasExpenses;

    @ApiModelProperty( "License expenses for customer" )
    private BigDecimal licenseExpenses;

    @ApiModelProperty( "Difference between earnings and costs" )
    private BigDecimal margin;

    @ApiModelProperty( "Total earnings" )
    private BigDecimal earnings;

    @ApiModelProperty( "Total costs" )
    private BigDecimal costs;

    @ApiModelProperty( "Expenses for NORMAL orders" )
    private BigDecimal normalExpenses;

    @ApiModelProperty( "Expenses for TRIAL orders" )
    private BigDecimal trialExpenses;

    @ApiModelProperty( "Expenses for SANDBOX orders" )
    private BigDecimal sandboxExpenses;

    @ApiModelProperty( "Active customers" )
    private Long customersCount;

    @ApiModelProperty( "Registered companies" )
    private Long companiesCount;

    @ApiModelProperty( "Active subscriptions" )
    private Long subscriptionsCount;

    @ApiModelProperty( "Subscriptions in DEPLOYED status" )
    private Long deployedSubscriptionsCount;

    @ApiModelProperty( "Subscriptions in PENDING status" )
    private Long pendingSubscriptionsCount;

    @ApiModelProperty( "Subscriptions in FAILED status" )
    private Long failedSubscriptionsCount;

    @ApiModelProperty( "Products count" )
    private Long productsCount;

    @ApiModelProperty( "Published products count" )
    private Long publishedProductsCount;

    @ApiModelProperty( "Paid NORMAL orders" )
    private Long normalOrdersCount;

    @ApiModelProperty( "Trial orders" )
    private Long trialOrdersCount;

    @ApiModelProperty( "Renewal orders" )
    private Long renewalOrdersCount;

    @ApiModelProperty( "Upsell orders" )
    private Long upsellOrdersCount;

    @ApiModelProperty( "Most sold product versions" )
    private List<SellingStatisticDTO> mostSoldProductVersions;

    @ApiModelProperty( "Most profitable product versions" )
    private List<SellingStatisticDTO> mostProfitableProductVersions;

    @ApiModelProperty( "Most activated product versions" )
    private List<SellingStatisticDTO> mostActivatedProductVersions;

    @ApiModelProperty( "Top spending customers" )
    private List<SellingStatisticDTO> mostProfitableCustomers;

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

    public BigDecimal getMargin()
    {
        return margin;
    }

    public void setMargin( BigDecimal margin )
    {
        this.margin = margin;
    }

    public BigDecimal getEarnings()
    {
        return earnings;
    }

    public void setEarnings( BigDecimal earnings )
    {
        this.earnings = earnings;
    }

    public BigDecimal getCosts()
    {
        return costs;
    }

    public void setCosts( BigDecimal costs )
    {
        this.costs = costs;
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

    public List<SellingStatisticDTO> getMostSoldProductVersions()
    {
        return mostSoldProductVersions;
    }

    public void setMostSoldProductVersions( List<SellingStatisticDTO> mostSoldProductVersions )
    {
        this.mostSoldProductVersions = mostSoldProductVersions;
    }

    public List<SellingStatisticDTO> getMostProfitableProductVersions()
    {
        return mostProfitableProductVersions;
    }

    public void setMostProfitableProductVersions( List<SellingStatisticDTO> mostProfitableProductVersions )
    {
        this.mostProfitableProductVersions = mostProfitableProductVersions;
    }

    public List<SellingStatisticDTO> getMostActivatedProductVersions()
    {
        return mostActivatedProductVersions;
    }

    public void setMostActivatedProductVersions( List<SellingStatisticDTO> mostActivatedProductVersions )
    {
        this.mostActivatedProductVersions = mostActivatedProductVersions;
    }

    public List<SellingStatisticDTO> getMostProfitableCustomers()
    {
        return mostProfitableCustomers;
    }

    public void setMostProfitableCustomers( List<SellingStatisticDTO> mostProfitableCustomers )
    {
        this.mostProfitableCustomers = mostProfitableCustomers;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        StatisticsDTO that = (StatisticsDTO) o;
        return Objects.equals( iaasExpenses, that.iaasExpenses )
                && Objects.equals( licenseExpenses, that.licenseExpenses )
                && Objects.equals( margin, that.margin )
                && Objects.equals( earnings, that.earnings )
                && Objects.equals( costs, that.costs )
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
                && Objects.equals( upsellOrdersCount, that.upsellOrdersCount )
                && Objects.equals( mostSoldProductVersions, that.mostSoldProductVersions )
                && Objects.equals( mostProfitableCustomers, that.mostProfitableCustomers );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                iaasExpenses, licenseExpenses, earnings, costs, margin, normalExpenses, trialExpenses, sandboxExpenses,
                customersCount, companiesCount, subscriptionsCount, deployedSubscriptionsCount,
                pendingSubscriptionsCount, failedSubscriptionsCount, productsCount, publishedProductsCount,
                normalOrdersCount, trialOrdersCount, renewalOrdersCount, upsellOrdersCount, mostSoldProductVersions,
                mostProfitableCustomers
        );
    }
}
