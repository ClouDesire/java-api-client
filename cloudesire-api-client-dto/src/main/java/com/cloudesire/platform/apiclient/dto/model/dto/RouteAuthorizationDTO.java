package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.Permission;
import com.cloudesire.platform.apiclient.dto.model.enums.UserGroup;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@ApiModel( description = "RBAC for frontend routes" )
public class RouteAuthorizationDTO implements DTO
{
    @ApiModelProperty( required = true )
    @NotEmpty
    private String route;

    @NotEmpty
    @Valid
    private Set<AccessControlDTO> acl;

    private Set<UserGroup> userGroups;

    private RouteAuthorizationDTO( String route, Set<AccessControlDTO> acl, Set<UserGroup> userGroups )
    {
        this.route = route;
        this.acl = acl;
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

    public Set<AccessControlDTO> getAcl()
    {
        return acl;
    }

    public void setAcl( Set<AccessControlDTO> acl )
    {
        this.acl = acl;
    }

    @ApiModelProperty( readOnly = true )
    public Set<UserRole> getRoles()
    {
        return acl.stream().map( AccessControlDTO::getRole ).collect( Collectors.toSet() );
    }

    public Set<UserGroup> getUserGroups()
    {
        return userGroups;
    }

    public void setUserGroups( Set<UserGroup> userGroups )
    {
        this.userGroups = userGroups;
    }

    @ApiModelProperty( hidden = true )
    @AssertTrue
    @JsonIgnore
    public boolean isAclUniquePerRole()
    {
        var uniqueRoles = acl.stream()
                .map( AccessControlDTO::getRole )
                .collect( Collectors.toSet() );
        return acl.size() == uniqueRoles.size();
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        RouteAuthorizationDTO that = (RouteAuthorizationDTO) o;
        return Objects.equals( route, that.route ) && Objects.equals( acl, that.acl )
                && Objects.equals( userGroups, that.userGroups );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( route, acl, userGroups );
    }

    @Override
    public String toString()
    {
        return String.format( "RouteAuthorizationDTO{route='%s', acl=%s, userGroups=%s}", route, acl, userGroups );
    }

    public static final class Builder
    {
        private final String route;
        private Set<AccessControlDTO> acl;
        private Set<UserGroup> userGroups;

        private Builder( String route )
        {
            this.route = route;
        }

        public Builder withRoles( Map<UserRole, List<Permission>> roles )
        {
            this.acl = roles.entrySet()
                    .stream()
                    .map( e -> new AccessControlDTO( e.getKey(), e.getValue() ) )
                    .collect( Collectors.toSet() );
            return this;
        }

        public Builder withUserGroups( Set<UserGroup> userGroups )
        {
            this.userGroups = userGroups;
            return this;
        }

        public RouteAuthorizationDTO build()
        {
            return new RouteAuthorizationDTO( route, acl, userGroups );
        }
    }
}
