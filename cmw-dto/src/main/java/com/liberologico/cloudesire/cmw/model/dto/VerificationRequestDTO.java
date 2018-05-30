package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.AssertTrue;

public final class VerificationRequestDTO
{
    private String username;

    private String email;

    public static VerificationRequestDTO forUsername( String username )
    {
        return new VerificationRequestDTO( username, null );
    }

    public static VerificationRequestDTO forEmail( String email )
    {
        return new VerificationRequestDTO( null, email );
    }

    private VerificationRequestDTO( String username, String email )
    {
        this.username = username;
        this.email = email;
    }

    private VerificationRequestDTO()
    {
    }

    @JsonIgnore
    public String getIdentifier()
    {
        return username != null ? "username" : "email";
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    @AssertTrue( message = "A verification request must have either username or email" )
    @JsonIgnore
    public boolean isValid()
    {
        return username != null || email != null;
    }
}
