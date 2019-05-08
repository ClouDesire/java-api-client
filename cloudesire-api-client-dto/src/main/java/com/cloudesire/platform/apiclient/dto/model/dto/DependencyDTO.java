package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel( description = "Define stack requirements for a vendor ApplicationFile" )
public class DependencyDTO extends BaseEntityDTO
{
    @NotNull
    @ApiModelProperty( "Ordering used when returning a list of dependencies" )
    private Integer priority = 1;

    @Valid
    private UrlEntityDTO nodeRole;

    @Deprecated
    @ApiModelProperty( hidden = true )
    private NodeRoleDTO role;

    @NotNull
    @Valid
    private UrlEntityDTO file;

    public DependencyDTO( ApplicationFileDTO applicationFile, NodeRoleDTO nodeRole )
    {
        this.file = applicationFile.urlEntity();
        this.nodeRole = nodeRole.urlEntity();
    }

    public DependencyDTO()
    {
    }

    public Integer getPriority()
    {
        return priority;
    }

    public void setPriority( Integer priority )
    {
        this.priority = priority;
    }

    public UrlEntityDTO getNodeRole()
    {
        return nodeRole;
    }

    public void setNodeRole( UrlEntityDTO nodeRole )
    {
        this.nodeRole = nodeRole;
    }

    @Deprecated
    public NodeRoleDTO getRole()
    {
        return role;
    }

    @Deprecated
    public void setRole( NodeRoleDTO role )
    {
        this.role = role;
    }

    public UrlEntityDTO getFile()
    {
        return file;
    }

    public void setFile( UrlEntityDTO file )
    {
        this.file = file;
    }

    @Override
    public String toString()
    {
        return "DependencyDTO [priority=" + priority + ", role=" + role + ", file=" + file + "]";
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        DependencyDTO that = (DependencyDTO) o;
        return Objects.equals( role, that.role ) && Objects.equals( file, that.file );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( role, file );
    }
}
