package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

@Schema( description = "Define stack requirements for a vendor ApplicationFile" )
public class DependencyDTO extends BaseEntityDTO
{
    @NotNull
    @Schema( description = "Ordering used when returning a list of dependencies")
    private Integer priority = 1;

    @NotNull
    @Valid
    private UrlEntityDTO nodeRole;

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

    public UrlEntityDTO getFile()
    {
        return file;
    }

    public void setFile( UrlEntityDTO file )
    {
        this.file = file;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        DependencyDTO that = (DependencyDTO) o;
        return Objects.equals( nodeRole, that.nodeRole ) && Objects.equals( file, that.file );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( nodeRole, file );
    }
}
