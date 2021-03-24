package com.cloudesire.platform.apiclient.dto.model.enums;

import java.util.EnumSet;
import java.util.Set;

public enum OrderOperationType
{
    APPROVE, REJECT, DELETE;

    public static Set<OrderOperationType> approvalOperations()
    {
        return EnumSet.of( APPROVE, REJECT );
    }
}
