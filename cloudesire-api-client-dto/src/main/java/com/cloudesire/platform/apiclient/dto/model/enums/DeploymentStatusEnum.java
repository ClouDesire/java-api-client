package com.cloudesire.platform.apiclient.dto.model.enums;

import java.util.Collection;
import java.util.EnumSet;

public enum DeploymentStatusEnum
{
    /** waiting for deploy */
    PENDING,
    DEPLOYED,
    UNDEPLOYED,
    STOPPED,
    FAILED,
    /** requires approval by admin */
    PRE_APPROVAL,
    UNDEPLOY_SENT,
    /** app that requires post-configuration */
    POST_CONFIGURATION,
    /** only for normal orders, when invoice get paid become PENDING */
    WAITING_PAYMENT,
    /** invoice payment time expired */
    PAYMENT_EXPIRED;

    /**
     * The statuses in which the subscription is active
     */
    public static Collection<DeploymentStatusEnum> active()
    {
        return EnumSet.of( DEPLOYED, FAILED, POST_CONFIGURATION );
    }

    /**
     * The statuses for a subscription to be renewed automatically
     */
    public static Collection<DeploymentStatusEnum> autoRenewable()
    {
        return EnumSet.of( DEPLOYED );
    }

    public static Collection<DeploymentStatusEnum> deployable()
    {
        return EnumSet.of( PENDING, POST_CONFIGURATION );
    }

    /**
     * The statuses in which the subscription are no longer active
     */
    public static Collection<DeploymentStatusEnum> terminated()
    {
        return EnumSet.of( PAYMENT_EXPIRED, UNDEPLOYED );
    }

    /**
     * The statuses in which the subscription has been/will be undeployed
     */
    public static Collection<DeploymentStatusEnum> undeployed()
    {
        return EnumSet.of( PAYMENT_EXPIRED, UNDEPLOY_SENT, UNDEPLOYED );
    }
}
