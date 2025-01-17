package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.Permission;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class AccessControlDTO implements DTO
{
    @NotNull
    private UserRole role;

    private List<Permission> permissions;

    AccessControlDTO( UserRole role, List<Permission> permissions )
    {
        this.role = role;
        this.permissions = permissions;
    }

    public AccessControlDTO()
    {
    }

    public UserRole getRole()
    {
        return role;
    }

    public void setRole( UserRole role )
    {
        this.role = role;
    }

    public List<Permission> getPermissions()
    {
        return permissions;
    }

    public void setPermissions( List<Permission> permissions )
    {
        this.permissions = permissions;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        AccessControlDTO that = (AccessControlDTO) o;
        return role == that.role && Objects.equals( permissions, that.permissions );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( role, permissions );
    }

    @Override
    public String toString()
    {
        return role + " => " + permissions;
    }

}
