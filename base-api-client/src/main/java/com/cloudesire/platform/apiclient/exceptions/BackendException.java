package com.cloudesire.platform.apiclient.exceptions;

import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class BackendException extends RuntimeException
{
    private final transient ErrorResponse error;

    public BackendException( String message, ErrorResponse error )
    {
        super( message );
        this.error = error;
    }

    public BackendException( String message )
    {
        super( message );
        this.error = null;
    }

    public BackendException( Throwable cause )
    {
        super( cause );
        this.error = null;
    }

    public ErrorResponse getError()
    {
        return error;
    }
}
