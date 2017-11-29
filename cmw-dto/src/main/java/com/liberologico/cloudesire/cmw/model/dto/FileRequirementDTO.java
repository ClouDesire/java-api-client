package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
}
