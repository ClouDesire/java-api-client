package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.cmw.model.enums.DeploymentStatusEnum;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionPatchDTO extends DTO
{
    @Deprecated
    public static final String FIELD_ENDPOINTS = "syndicatedEndpoints";

    @Deprecated
    private String endUserInstructions;

    private Map<UrlEntityDTO, String> configurationParameters;

    private String deploymentStatus;

    @Deprecated
    private String syndicatedEndpoints;

    private Action action;

    @Deprecated
    private Integer months;

    @Deprecated
    private Integer hours;
    private Boolean autoRenew;
    private Map<UrlEntityDTO, Integer> billingItems;

    private UrlEntityDTO productVersion;

    @Deprecated
    private UrlEntityDTO billingItem;

    @Deprecated
    private Integer value;

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
        RENEW, START, STOP, KILL, BACKUP, AUTORENEW, @Deprecated UPGRADE, BILLING_ITEM_UPGRADE, SYNDICATED_UPGRADE
    }
}
