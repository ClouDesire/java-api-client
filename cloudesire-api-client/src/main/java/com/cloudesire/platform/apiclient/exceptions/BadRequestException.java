package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class BadRequestException extends BackendException
{
    public BadRequestException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
