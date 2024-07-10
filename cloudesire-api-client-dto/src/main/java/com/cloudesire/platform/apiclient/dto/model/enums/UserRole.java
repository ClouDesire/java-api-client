package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Roles are sorted by increasing level of authorization.
 */
@Schema( description = "Defines user roles across the platform" )
public enum UserRole
{
    ROLE_ANONYMOUS,
    ROLE_USER,
    ROLE_VENDOR,
    ROLE_RESELLER,
    ROLE_DISTRIBUTOR,
    ROLE_SUPERVISOR,
    ROLE_ADMIN,
    ROLE_SUPERADMIN;

    public String prettyPrint()
    {
        return this.toString().replace( "ROLE_", "" ).toLowerCase();
    }
}
