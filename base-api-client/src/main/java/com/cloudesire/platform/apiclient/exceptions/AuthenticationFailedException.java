package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class AuthenticationFailedException extends BackendException
{
    public AuthenticationFailedException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
