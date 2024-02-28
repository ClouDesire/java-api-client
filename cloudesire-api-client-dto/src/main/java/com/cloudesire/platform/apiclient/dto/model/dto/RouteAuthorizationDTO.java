package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.UserGroup;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;
import java.util.Set;

@ApiModel( description = "RBAC for frontend routes" )
public class RouteAuthorizationDTO implements DTO
{
    @NotEmpty
    private String route;

    private Set<UserRole> roles;

    private Set<UserGroup> userGroups;

    private RouteAuthorizationDTO( String route, Set<UserRole> roles, Set<UserGroup> userGroups )
    {
        this.route = route;
        this.roles = roles;
        this.userGroups = userGroups;
    }

    public RouteAuthorizationDTO()
    {
    }

    public static Builder builder( String route )
    {
        return new Builder( route );
    }

    public String getRoute()
    {
        return route;
    }

    public void setRoute( String route )
    {
        this.route = route;
    }

    public Set<UserRole> getRoles()
    {
        return roles;
    }

    public void setRoles( Set<UserRole> roles )
    {
        this.roles = roles;
    }

    public Set<UserGroup> getUserGroups()
    {
        return userGroups;
    }

    public void setUserGroups( Set<UserGroup> userGroups )
    {
        this.userGroups = userGroups;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        RouteAuthorizationDTO that = (RouteAuthorizationDTO) o;
        return Objects.equals( route, that.route ) && Objects.equals( roles, that.roles )
                && Objects.equals( userGroups, that.userGroups );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( route, roles, userGroups );
    }

    @Override
    public String toString()
    {
        return String.format( "RouteAuthorizationDTO{route='%s', roles=%s, userGroups=%s}", route, roles, userGroups );
    }

    public static final class Builder
    {
        private final String route;
        private Set<UserRole> roles;
        private Set<UserGroup> userGroups;

        private Builder( String route )
        {
            this.route = route;
        }

        public Builder withRoles( Set<UserRole> roles )
        {
            this.roles = roles;
            return this;
        }

        public Builder withUserGroups( Set<UserGroup> userGroups )
        {
            this.userGroups = userGroups;
            return this;
        }

        public RouteAuthorizationDTO build()
        {
            return new RouteAuthorizationDTO( route, roles, userGroups );
        }
    }
}
