package com.liberologico.cloudesire.cmw.model.enums;

import com.liberologico.cloudesire.cmw.model.dto.SubscriptionPatchDTO;
import com.liberologico.cloudesire.common.enums.HttpMethod;
import com.liberologico.cloudesire.common.enums.dto.ActionDTO;

import javax.validation.constraints.NotNull;

public enum InstanceOperationType
{
    START( HttpMethod.PATCH, "subscription", "start" ),
    STOP( HttpMethod.PATCH, "subscription", "stop" ),
    MINOR_UPGRADE( HttpMethod.PATCH, "virtualMachineInstance", "bugfixUpgrade" ),
    KILL( HttpMethod.PATCH, "subscription", "kill" ),
    DELETE( HttpMethod.DELETE, "subscription" ),
    RENEW( HttpMethod.PATCH, "subscription", "renew" ),
    SYNDICATED_UPGRADE( HttpMethod.PATCH, "subscription", SubscriptionPatchDTO.Action.SYNDICATED_UPGRADE.toString() ),
    BILLING_ITEM_UPGRADE( HttpMethod.PATCH, "subscription", SubscriptionPatchDTO.Action.BILLING_ITEM_UPGRADE.toString() ),
    BACKUP( HttpMethod.PATCH, "subscription", "backup" ),
    AUTO_RENEW( HttpMethod.PATCH, "subscription", "autoRenew" ),
    UNSUBSCRIBE( HttpMethod.PATCH, "subscription", "autoRenew" ),
    ADD_REVIEW( HttpMethod.POST, "comment" ),
    EDIT_ENVIRONMENT( HttpMethod.PATCH, "virtualMachineInstance", "setEnvironment" ),
    APPLICATIONS_UPDATE( HttpMethod.PATCH, "virtualMachineInstance", "applicationsUpdate" ),
    SEND_CUSTOM_EVENT( HttpMethod.PATCH, "subscription" ),
    UPGRADE_TO_NORMAL( RENEW );

    @NotNull
    private final String label;

    @NotNull
    private final HttpMethod method;

    @NotNull
    private final String resourceType;

    private final String[] actions;

    InstanceOperationType( HttpMethod method, String resourceType, String... actions )
    {
        this.label = this.name();
        this.method = method;
        this.resourceType = resourceType;
        this.actions = actions;
    }

    InstanceOperationType( HttpMethod method, String resourceType )
    {
        this( method, resourceType, (String[]) null );
    }

    InstanceOperationType( InstanceOperationType type )
    {
        this( type.method, type.resourceType, type.actions );
    }

    public ActionDTO toAction()
    {
        return new ActionDTO( label, null, method, resourceType, actions );
    }
}
