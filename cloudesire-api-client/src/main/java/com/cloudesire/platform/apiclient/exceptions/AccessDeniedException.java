package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class AccessDeniedException extends BackendException
{
    public AccessDeniedException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
