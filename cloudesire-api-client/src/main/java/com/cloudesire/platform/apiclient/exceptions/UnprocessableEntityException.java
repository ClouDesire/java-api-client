package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class UnprocessableEntityException extends BackendException
{
    public UnprocessableEntityException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
