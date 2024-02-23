package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class LockedException extends BackendException
{
    public LockedException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
