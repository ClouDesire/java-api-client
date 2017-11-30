package com.liberologico.cloudesire.cmw.model.enums;

/**
 * Defines user roles across the applications.
 *
 * Roles are sorted by increasing level of authorization.
 */
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
}
