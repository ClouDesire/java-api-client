package com.cloudesire.platform.apiclient.exceptions;
import com.cloudesire.platform.apiclient.response.error.ErrorResponse;

public class ConflictException extends BackendException
{
    public ConflictException( String message, ErrorResponse error )
    {
        super( message, error );
    }
}
