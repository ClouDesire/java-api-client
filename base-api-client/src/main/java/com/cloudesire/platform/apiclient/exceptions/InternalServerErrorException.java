package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class InternalServerErrorException extends BackendException
{
    public InternalServerErrorException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
