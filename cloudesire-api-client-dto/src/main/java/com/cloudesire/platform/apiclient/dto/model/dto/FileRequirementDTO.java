package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class FileRequirementDTO extends BaseEntityDTO
{
    private boolean directory;

    @NotNull
    private String regex;

    @NotNull
    private String description;

    @NotNull
    @Valid
    private UrlEntityDTO nodeRole;

    public boolean isDirectory()
    {
        return directory;
    }

    public void setDirectory( boolean directory )
    {
        this.directory = directory;
    }

    public String getRegex()
    {
        return regex;
    }

    public void setRegex( String regex )
    {
        this.regex = regex;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public UrlEntityDTO getNodeRole()
    {
        return nodeRole;
    }

    public void setNodeRole( UrlEntityDTO nodeRole )
    {
        this.nodeRole = nodeRole;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        FileRequirementDTO that = (FileRequirementDTO) o;
        return directory == that.directory && regex.equals( that.regex ) && description.equals( that.description )
                && nodeRole.equals( that.nodeRole );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), directory, regex, description, nodeRole );
    }
}
