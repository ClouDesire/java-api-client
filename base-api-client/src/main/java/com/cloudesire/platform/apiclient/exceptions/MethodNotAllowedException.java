package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class MethodNotAllowedException extends BackendException
{
    public MethodNotAllowedException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
