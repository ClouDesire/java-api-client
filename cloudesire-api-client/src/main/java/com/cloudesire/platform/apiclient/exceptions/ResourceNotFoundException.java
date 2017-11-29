package com.cloudesire.platform.apiclient.exceptions;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class ResourceNotFoundException extends BackendException
{
    public ResourceNotFoundException( String message, ErrorResponseDTO error )
    {
        super( message, error );
    }
}
