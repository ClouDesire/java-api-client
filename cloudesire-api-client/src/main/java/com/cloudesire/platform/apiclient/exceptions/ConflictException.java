package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class ConflictException extends BackendException
{
    public ConflictException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
