package com.liberologico.cloudesire.cmw.model.utils;

import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;

public class ErrorResponseFactory
{
    private ErrorResponseFactory()
    {
    }

    public static ErrorResponseDTO build( String key, String error )
    {
        return new ErrorResponseDTO( ErrorHolder.errorHolderDefault( key, error ) );
    }
}
