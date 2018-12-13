package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class BadRequestException extends BackendException
{
    public BadRequestException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
