package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@ApiModel( description = "Perform an operation on a subscription" )
public class SubscriptionPatchDTO extends DTO
{
    @ApiModelProperty( hidden = true )
    @Deprecated
    public static final String FIELD_ENDPOINTS = "syndicatedEndpoints";

    @ApiModelProperty( hidden = true )
    @Deprecated
    private String endUserInstructions;

    @ApiModelProperty( "Configuration parameter values for the subscription" )
    private Map<UrlEntityDTO, String> configurationParameters;

    @ApiModelProperty( value = "Deployment status of the subscription", allowableValues = "PENDING, DEPLOYED, UNDEPLOYED, STOPPED, FAILED, PRE_APPROVAL, UNDEPLOY_SENT, POST_CONFIGURATION, PENDING, WAITING_PAYMENT, PAYMENT_EXPIRED" )
    private String deploymentStatus;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private String syndicatedEndpoints;

    @ApiModelProperty( value = "Update operation", allowableValues = "RENEW, START, STOP, KILL, BACKUP, AUTORENEW, BILLING_ITEM_UPGRADE, SYNDICATED_UPGRADE, REFRESH_BILLING_ITEM_VALUES" )
    private Action action;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private Integer months;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private Integer hours;

    @ApiModelProperty( "Whether the subscription automatically renews at the end of the last billing period" )
    private Boolean autoRenew;

    @ApiModelProperty( "Billing item values for the subscription" )
    private Map<UrlEntityDTO, Integer> billingItems;

    private UrlEntityDTO productVersion;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private UrlEntityDTO billingItem;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private Integer value;

    @ApiModelProperty( "Update the subscription paid status" )
    private Boolean paid;

    public SubscriptionPatchDTO( Action action )
    {
        this.action = action;
    }

    public SubscriptionPatchDTO()
    {
    }

    @JsonIgnore
    public Integer getTime()
    {
        Integer time = null;
        if ( months != null ) time = months;
        else if ( hours != null ) time = hours;
        return time;
    }

    @JsonIgnore
    public int getUnit()
    {
        return months != null ? Calendar.MONTH : Calendar.HOUR;
    }

    public boolean hasValidUpgradeData()
    {
        return billingItem != null && value != null || ! billingItems.isEmpty();
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

        Map<Integer, String> configurationParameters = new HashMap<>();

        for ( Map.Entry<UrlEntityDTO, String> entry : this.configurationParameters.entrySet() )
        {
            configurationParameters.put( entry.getKey().getId(), entry.getValue() );
        }

        return configurationParameters;
    }

    public SubscriptionPatchDTO setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public DeploymentStatusEnum getDeploymentStatus()
    {
        if ( deploymentStatus == null ) return null;

        try
        {
            return DeploymentStatusEnum.valueOf( deploymentStatus );
        }
        catch ( ClassCastException e )
        {
            throw new IllegalArgumentException( e );
        }
    }

    /**
     * @deprecated by {@link #setDeploymentStatus(DeploymentStatusEnum)}
     */
    @Deprecated
    public SubscriptionPatchDTO setDeploymentStatus( String deploymentStatus )
    {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    public SubscriptionPatchDTO setDeploymentStatus( DeploymentStatusEnum deploymentStatus )
    {
        if ( deploymentStatus != null ) this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    @ApiModelProperty( hidden = true )
    @Deprecated
    public void setStatus( String status )
    {
        this.deploymentStatus = status;
    }

    public String getSyndicatedEndpoints()
    {
        return syndicatedEndpoints;
    }

    public void setSyndicatedEndpoints( String syndicatedEndpoints )
    {
        this.syndicatedEndpoints = syndicatedEndpoints;
    }

    public Action getAction()
    {
        return action;
    }

    public SubscriptionPatchDTO setAction( String action )
    {
        this.action = Action.valueOf( action.toUpperCase() );
        return this;
    }

    public Integer getMonths()
    {
        return months;
    }

    public SubscriptionPatchDTO setMonths( Integer months )
    {
        this.months = months;
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

    public enum Action
    {
        @ApiModelProperty( "Renew a subscription" )
        RENEW,

        @ApiModelProperty( "Start a subscription" )
        START,

        @ApiModelProperty( "Stop a subscription" )
        STOP,

        @ApiModelProperty( "Kill a subscription" )
        KILL,

        @ApiModelProperty( "Backup a managed subscription VM data" )
        BACKUP,

        @ApiModelProperty( "Update subscription auto-renewal status" )
        AUTORENEW,

        @ApiModelProperty( hidden = true )
        @Deprecated UPGRADE,

        @ApiModelProperty( "Request an extra resource upgrade" )
        BILLING_ITEM_UPGRADE,

        @ApiModelProperty( "Request a product plan update for a syndicated subscription" )
        SYNDICATED_UPGRADE,

        @ApiModelProperty( "Update extra resources ranges with current plan values" )
        REFRESH_BILLING_ITEM_VALUES,
    }
}
