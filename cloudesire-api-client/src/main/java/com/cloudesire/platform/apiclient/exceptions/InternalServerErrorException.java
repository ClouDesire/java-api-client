package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class InternalServerErrorException extends BackendException
{
    public InternalServerErrorException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
