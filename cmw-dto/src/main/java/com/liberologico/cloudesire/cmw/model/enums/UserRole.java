package com.liberologico.cloudesire.cmw.model.enums;

import java.util.Arrays;
import java.util.Set;

/**
 * Defines user roles across the applications.
 *
 * Roles are sorted by increasing level of authorization.
 */
public enum UserRole
{
    ROLE_ANONYMOUS
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return userRole.equals( ROLE_USER ) || userRole.equals( ROLE_VENDOR );
        }
    },
    ROLE_USER,
    ROLE_VENDOR
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return userRole.equals( ROLE_VENDOR );
        }
    },
    ROLE_RESELLER
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return userRole.equals( ROLE_USER );
        }
    },
    ROLE_DISTRIBUTOR
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return userRole.equals( ROLE_RESELLER );
        }
    },
    ROLE_SUPERVISOR
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return this.compareTo( userRole ) >= 0;
        }
    },
    ROLE_ADMIN
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return ! userRole.equals( ROLE_SUPERADMIN );
        }
    },
    ROLE_SUPERADMIN
    {
        @Override
        public boolean canCreate( UserRole userRole )
        {
            return true;
        }
    };

    public String prettyPrint()
    {
        return this.toString().replace( "ROLE_", "" ).toLowerCase();
    }

    @SuppressWarnings( "squid:S1172" )
    public boolean canCreate( UserRole userRole )
    {
        return false;
    }

    public boolean canImpersonate()
    {
        return this.compareTo( ROLE_SUPERVISOR ) >= 0;
    }

    public boolean isAdmin()
    {
        return this.compareTo( ROLE_ADMIN ) >= 0;
    }

    public boolean isSuperior( Set<UserRole> roles )
    {
        for ( UserRole role : roles )
        {
            if ( this.compareTo( role ) < 0 ) return false;
        }

        return true;
    }

    public UserRole[] lesserRoles()
    {
        return Arrays.copyOfRange( UserRole.values(), 0, this.ordinal() );
    }
}
