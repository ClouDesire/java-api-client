package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class BackendException extends RuntimeException
{
    private final transient ErrorResponseDTO error;

    public BackendException( String message, ErrorResponseDTO error )
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

    public ErrorResponseDTO getError()
    {
        return error;
    }
}
