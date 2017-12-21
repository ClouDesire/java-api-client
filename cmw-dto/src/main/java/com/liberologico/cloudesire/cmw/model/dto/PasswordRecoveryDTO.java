package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class PasswordRecoveryDTO
{
    @NotEmpty
    private String identifier;

    public PasswordRecoveryDTO( String identifier )
    {
        this.identifier = identifier;
    }

    public PasswordRecoveryDTO()
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
}
