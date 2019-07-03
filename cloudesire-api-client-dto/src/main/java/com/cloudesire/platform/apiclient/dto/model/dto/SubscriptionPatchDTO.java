package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@ApiModel( description = "Perform an operation on a subscription" )
public class SubscriptionPatchDTO extends DTO
{
    public static final String FIELD_ENDPOINTS = "syndicatedEndpoints";

    @ApiModelProperty( hidden = true )
    @Deprecated
    private String endUserInstructions;

    @ApiModelProperty( "Configuration parameter values for the subscription" )
    private Map<UrlEntityDTO, String> configurationParameters;

    @ApiModelProperty( "Deployment status of the subscription" )
    private DeploymentStatusEnum deploymentStatus;

    @ApiModelProperty( hidden = true )
    @Deprecated
    private String syndicatedEndpoints;

    @ApiModelProperty( "Update operation" )
    private SubscriptionPatchAction action;

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

    @ApiModelProperty( "A descriptive name for the subscription" )
    @NotEmpty
    @Size( max = 255 )
    private String name;

    public SubscriptionPatchDTO( SubscriptionPatchAction action )
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

    public DeploymentStatusEnum getDeploymentStatus()
    {
        return deploymentStatus;
    }

    public SubscriptionPatchDTO setDeploymentStatus( DeploymentStatusEnum deploymentStatus )
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

    public String getName()
    {
        return name;
    }

    public SubscriptionPatchDTO setName( String name )
    {
        this.name = name;
        return this;
    }

    public enum SubscriptionPatchAction
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

        @ApiModelProperty( "Approve a subscription" )
        APPROVE,

        @ApiModelProperty( "Provision a subscription" )
        DEPLOY,

        @ApiModelProperty( "Set a descriptive name for a subscription" )
        SET_NAME
    }
}
