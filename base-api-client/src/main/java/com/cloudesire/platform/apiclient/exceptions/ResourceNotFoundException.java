package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class ResourceNotFoundException extends BackendException
{
    public ResourceNotFoundException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
