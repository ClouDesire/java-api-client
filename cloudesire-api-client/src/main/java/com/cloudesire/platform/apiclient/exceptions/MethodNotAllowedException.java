package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class MethodNotAllowedException extends BackendException
{
    public MethodNotAllowedException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
