package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.PropertyFilter;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

@Schema( description = "Budget estimate request" )
public class BudgetInputDTO
{
    @NotNull
    private OrderType type = OrderType.NORMAL;

    @Schema( description = "The ID of the chosen product version")
    private Integer productVersionId;

    @Schema( description = "The ID of the chosen cloud provider")
    private Integer providerId;

    @Schema( description = "The ID of the custom cloud credentials")
    private Integer credentialId;

    @Schema( description = "The ID of the chosen bandwidth pricing")
    private Integer bandwidthPricingId;

    @Schema( description = "For how many hours to request an estimate")
    @Min( 1 )
    @Max( 720 )
    private Integer hours;

    @Schema( description = "Show current or projected pay-per-use costs")
    private PayPerUseCosts payPerUseCosts;

    @Schema( description = "The ID of an existing subscription")
    private Integer subscriptionId;

    @Schema( description = "The coupon code")
    private String hashCoupon;

    @Schema( description = "The chosen values for the billing items", example = "{\"billingItem/123\":10}")
    private Map<UrlEntityDTO, Integer> billingItems;

    @Schema( description = "Subscription configuration parameters - used in external validation only")
    private Map<UrlEntityDTO, String> configurationParameters;

    @Schema( description = "The slug of a reseller company")
    private String reseller;

    private Integer catalogId;

    private OSType operatingSystem;

    private PropertyFilter iaas;

    @Schema( description = "Apply date for upgrades")
    private Date from;

    public OrderType getType()
    {
        return type;
    }

    public BudgetInputDTO setType( OrderType type )
    {
        this.type = type;
        return this;
    }

    public Integer getProductVersionId()
    {
        return productVersionId;
    }

    public BudgetInputDTO setProductVersionId( Integer productVersionId )
    {
        this.productVersionId = productVersionId;
        return this;
    }

    public Integer getProviderId()
    {
        return providerId;
    }

    public BudgetInputDTO setProviderId( Integer providerId )
    {
        this.providerId = providerId;
        return this;
    }

    public Integer getCredentialId()
    {
        return credentialId;
    }

    public BudgetInputDTO setCredentialId( Integer credentialId )
    {
        this.credentialId = credentialId;
        return this;
    }

    public Integer getBandwidthPricingId()
    {
        return bandwidthPricingId;
    }

    public BudgetInputDTO setBandwidthPricingId( Integer bandwidthPricingId )
    {
        this.bandwidthPricingId = bandwidthPricingId;
        return this;
    }

    public Integer getHours()
    {
        return hours;
    }

    public BudgetInputDTO setHours( Integer hours )
    {
        this.hours = hours;
        return this;
    }

    public PayPerUseCosts getPayPerUseCosts()
    {
        return payPerUseCosts;
    }

    public BudgetInputDTO setPayPerUseCosts( PayPerUseCosts payPerUseCosts )
    {
        this.payPerUseCosts = payPerUseCosts;
        return this;
    }

    public Integer getSubscriptionId()
    {
        return subscriptionId;
    }

    public BudgetInputDTO setSubscriptionId( Integer subscriptionId )
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getHashCoupon()
    {
        return hashCoupon;
    }

    public BudgetInputDTO setHashCoupon( String hashCoupon )
    {
        this.hashCoupon = hashCoupon;
        return this;
    }

    public Map<UrlEntityDTO, Integer> getBillingItems()
    {
        return billingItems;
    }

    public BudgetInputDTO setBillingItems( Map<UrlEntityDTO, Integer> billingItems )
    {
        this.billingItems = billingItems;
        return this;
    }

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public BudgetInputDTO setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public String getReseller()
    {
        return reseller;
    }

    public BudgetInputDTO setReseller( String reseller )
    {
        this.reseller = reseller;
        return this;
    }

    public Integer getCatalogId()
    {
        return catalogId;
    }

    public BudgetInputDTO setCatalogId( Integer catalogId )
    {
        this.catalogId = catalogId;
        return this;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public BudgetInputDTO setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public PropertyFilter getIaas()
    {
        return iaas;
    }

    public BudgetInputDTO setIaas( PropertyFilter iaas )
    {
        this.iaas = iaas;
        return this;
    }

    public Date getFrom()
    {
        return from;
    }

    public BudgetInputDTO setFrom( Date from )
    {
        this.from = from;
        return this;
    }

    public enum PayPerUseCosts
    {
        NONE, CURRENT, PROJECTED
    }
}
