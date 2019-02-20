package com.cloudesire.platform.apiclient.response.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorResponse
{
    private List<ErrorResponseEntry> errorHolders = new ArrayList<>();

    public ErrorResponse()
    {
    }

    public ErrorResponse( List<ErrorResponseEntry> errorHolder )
    {
        this.setErrorHolders( errorHolder );
    }


    public ErrorResponse( ErrorResponseEntry errorHolder )
    {
        this.setErrorHolders( Collections.singletonList( errorHolder ) );
    }

    public List<ErrorResponseEntry> getErrorHolders()
    {
        return errorHolders;
    }

    public ErrorResponse setErrorHolders( List<ErrorResponseEntry> errorHolders )
    {
        this.errorHolders = errorHolders;
        return this;
    }

    public void addErrorHolder( ErrorResponseEntry errorHolder )
    {
        errorHolders.add( errorHolder );
    }

    public ErrorResponseEntry firstErrorHolder()
    {
        if ( this.errorHolders == null || this.errorHolders.isEmpty() ) return null;
        return this.errorHolders.get( 0 );
    }
}
