package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.AssertTrue;

public class PasswordResetDTO
{
    private String email;

    private String username;

    private String tag;

    private String password;

    public PasswordResetDTO( String username, String tag, String password )
    {
        this( username );
        this.tag = tag;
        this.password = password;
    }

    public PasswordResetDTO( String username )
    {
        this.username = username;
    }

    public String getIdentifier()
    {
        return email != null ? email : username;
    }

    @AssertTrue( message = "{validator.password.reset.email.xor.username}" )
    public boolean isSingleIdentifierPresent()
    {
        return ( email == null ) != ( username == null );
    }

    public PasswordResetDTO()
    {
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
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
