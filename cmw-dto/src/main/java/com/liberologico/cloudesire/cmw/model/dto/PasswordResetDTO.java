package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class PasswordResetDTO
{
    @NotEmpty
    private String tag;

    @NotEmpty
    private String password;

    public PasswordResetDTO( String tag, String password )
    {
        this.tag = tag;
        this.password = password;
    }

    public PasswordResetDTO()
    {
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
