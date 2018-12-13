package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class UnprocessableEntityException extends BackendException
{
    public UnprocessableEntityException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
