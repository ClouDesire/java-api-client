package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class AccessDeniedException extends BackendException
{
    public AccessDeniedException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
