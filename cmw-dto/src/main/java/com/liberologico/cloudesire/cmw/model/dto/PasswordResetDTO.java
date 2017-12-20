package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class PasswordResetDTO
{
    @NotEmpty
    private String identifier;

    private String tag;

    private String password;

    public PasswordResetDTO( String identifier, String tag, String password )
    {
        this( identifier );
        this.tag = tag;
        this.password = password;
    }

    public PasswordResetDTO( String identifier )
    {
        this.identifier = identifier;
    }

    public PasswordResetDTO()
    {
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }
}
