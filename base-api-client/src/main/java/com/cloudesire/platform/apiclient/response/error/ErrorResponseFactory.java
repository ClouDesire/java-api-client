package com.cloudesire.platform.apiclient.response.error;


public class ErrorResponseFactory
{
    private ErrorResponseFactory()
    {
    }

    public static ErrorResponse build( String key, String error )
    {
        return new ErrorResponse( ErrorResponseEntry.errorHolderDefault( key, error ) );
    }
}
