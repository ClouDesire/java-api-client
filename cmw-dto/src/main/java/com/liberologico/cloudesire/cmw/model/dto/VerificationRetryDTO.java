package com.liberologico.cloudesire.cmw.model.dto;

public final class VerificationRetryDTO
{
    private String username;

    private String email;

    public static VerificationRetryDTO forUsername( String username )
    {
        return new VerificationRetryDTO( username, null );
    }

    public static VerificationRetryDTO forEmail( String email )
    {
        return new VerificationRetryDTO( null, email );
    }

    private VerificationRetryDTO( String username, String email )
    {
        this.username = username;
        this.email = email;
    }

    private VerificationRetryDTO()
    {
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }
}
