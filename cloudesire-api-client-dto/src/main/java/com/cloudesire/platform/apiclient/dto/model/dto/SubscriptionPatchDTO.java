package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatus;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Schema( description = "Perform an operation on a subscription" )
public class SubscriptionPatchDTO implements DTO
{
    public static final String FIELD_ENDPOINTS = "syndicatedEndpoints";

    @Schema( hidden = true )
    @Deprecated
    private String endUserInstructions;

    @Schema( description = "Configuration parameter values for the subscription")
    private Map<UrlEntityDTO, String> configurationParameters;

    @Schema( description = "Deployment status of the subscription")
    private DeploymentStatus deploymentStatus;

    @Schema( hidden = true )
    @Deprecated
    private String syndicatedEndpoints;

    @Schema( description = "Update operation")
    private SubscriptionPatchAction action;

    @Schema( description = "For how many hours to renew a sandbox subscription")
    private Integer hours;

    @Schema( description = "Whether the subscription automatically renews at the end of the last billing period")
    private Boolean autoRenew;

    @Schema( description = "Billing item values for the subscription")
    private Map<UrlEntityDTO, Integer> billingItems;

    private UrlEntityDTO productVersion;

    @Schema( hidden = true )
    @Deprecated
    private UrlEntityDTO billingItem;

    @Schema( hidden = true )
    @Deprecated
    private Integer value;

    @Schema( description = "Update the subscription paid status")
    private Boolean paid;

    @Schema( description = "A descriptive name for the subscription")
    @Size( max = 255 )
    private String name;

    @Schema( description = "Refresh billing configuration for a particular invoice")
    private Integer invoiceId;

    @Schema( description = "Postpone upgrade to a later date")
    @Future
    private Date from;

    @Schema( hidden = true )
    @Valid
    private BillingDatesDTO billingDates;

    public SubscriptionPatchDTO( SubscriptionPatchAction action )
    {
        this.action = action;
    }

    public SubscriptionPatchDTO()
    {
    }

    @Deprecated
    public String getEndUserInstructions()
    {
        return endUserInstructions;
    }

    @Deprecated
    public SubscriptionPatchDTO setEndUserInstructions( String endUserInstructions )
    {
        this.endUserInstructions = endUserInstructions;
        return this;
    }

    public Map<Integer, String> getConfigurationParameters()
    {
        if ( this.configurationParameters == null ) return null;

        Map<Integer, String> parameters = new HashMap<>();

        for ( Map.Entry<UrlEntityDTO, String> entry : this.configurationParameters.entrySet() )
        {
            parameters.put( entry.getKey().getId(), entry.getValue() );
        }

        return parameters;
    }

    public SubscriptionPatchDTO setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public DeploymentStatus getDeploymentStatus()
    {
        return deploymentStatus;
    }

    public SubscriptionPatchDTO setDeploymentStatus( DeploymentStatus deploymentStatus )
    {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    @Deprecated
    public String getSyndicatedEndpoints()
    {
        return syndicatedEndpoints;
    }

    @Deprecated
    public void setSyndicatedEndpoints( String syndicatedEndpoints )
    {
        this.syndicatedEndpoints = syndicatedEndpoints;
    }

    public SubscriptionPatchAction getAction()
    {
        return action;
    }

    public SubscriptionPatchDTO setAction( String action )
    {
        this.action = SubscriptionPatchAction.valueOf( action.toUpperCase() );
        return this;
    }

    public Integer getHours()
    {
        return hours;
    }

    public SubscriptionPatchDTO setHours( Integer hours )
    {
        this.hours = hours;
        return this;
    }

    public Boolean getAutoRenew()
    {
        return autoRenew;
    }

    public SubscriptionPatchDTO setAutoRenew( Boolean autoRenew )
    {
        this.autoRenew = autoRenew;
        return this;
    }

    public Map<UrlEntityDTO, Integer> getBillingItems()
    {
        return billingItems;
    }

    public SubscriptionPatchDTO setBillingItems( Map<UrlEntityDTO, Integer> billingItems )
    {
        this.billingItems = billingItems;
        return this;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public SubscriptionPatchDTO setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
        return this;
    }

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public SubscriptionPatchDTO setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
        return this;
    }

    public Integer getValue()
    {
        return value;
    }

    public SubscriptionPatchDTO setValue( Integer value )
    {
        this.value = value;
        return this;
    }

    public Boolean getPaid()
    {
        return paid;
    }

    public SubscriptionPatchDTO setPaid( Boolean paid )
    {
        this.paid = paid;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public SubscriptionPatchDTO setName( String name )
    {
        this.name = name;
        return this;
    }

    public Integer getInvoiceId()
    {
        return invoiceId;
    }

    public SubscriptionPatchDTO setInvoiceId( Integer invoiceId )
    {
        this.invoiceId = invoiceId;
        return this;
    }

    public Date getFrom()
    {
        return from;
    }

    public SubscriptionPatchDTO setFrom( Date from )
    {
        this.from = from;
        return this;
    }

    public BillingDatesDTO getBillingDates()
    {
        return billingDates;
    }

    public SubscriptionPatchDTO setBillingDates( BillingDatesDTO billingDates )
    {
        this.billingDates = billingDates;
        return this;
    }

    public enum SubscriptionPatchAction
    {
        @Schema( description = "Renew a subscription")
        RENEW,

        @Schema( description = "Start a subscription's VM")
        START,

        @Schema( description = "Stop a subscription's VM")
        STOP,

        @Schema( description = "Kill a subscription")
        KILL,

        @Schema( description = "Update subscription auto-renewal status")
        AUTORENEW,

        @Schema( hidden = true )
        @Deprecated UPGRADE,

        @Schema( description = "Request an extra resource upgrade")
        BILLING_ITEM_UPGRADE,

        @Schema( description = "Request a product plan update for a syndicated subscription")
        SYNDICATED_UPGRADE,

        @Schema( description = "Update reselling prices and extra resources ranges with current plan values")
        REFRESH_BILLING_CONFIGURATION,

        @Schema( hidden = true )
        @Deprecated
        REFRESH_BILLING_ITEM_VALUES,

        @Schema( description = "Approve a subscription")
        @Deprecated
        APPROVE,

        @Schema( description = "Provision a subscription")
        DEPLOY,

        @Schema( description = "Set a descriptive name for a subscription")
        SET_NAME,

        @Schema( hidden = true )
        ALTER_DATES
    }

    public static class BillingDatesDTO implements Serializable
    {
        @Past
        private Date billingPeriodStart;

        @Past
        private Date startDate;

        @Future
        private Date billingPeriodEnd;

        @Future
        private Date endDate;

        public Date getBillingPeriodStart()
        {
            return billingPeriodStart;
        }

        public void setBillingPeriodStart( Date billingPeriodStart )
        {
            this.billingPeriodStart = billingPeriodStart;
        }

        public Date getStartDate()
        {
            return startDate;
        }

        public void setStartDate( Date startDate )
        {
            this.startDate = startDate;
        }

        public Date getBillingPeriodEnd()
        {
            return billingPeriodEnd;
        }

        public void setBillingPeriodEnd( Date billingPeriodEnd )
        {
            this.billingPeriodEnd = billingPeriodEnd;
        }

        public Date getEndDate()
        {
            return endDate;
        }

        public void setEndDate( Date endDate )
        {
            this.endDate = endDate;
        }
    }
}
