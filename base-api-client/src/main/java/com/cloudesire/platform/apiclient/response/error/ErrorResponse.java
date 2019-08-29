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

    /**
     * @deprecated better use {@link #singleErrorHolder()} to inadvertently losing multiple error messages
     */
    @Deprecated
    public ErrorResponseEntry firstErrorHolder()
    {
        if ( this.errorHolders == null || this.errorHolders.isEmpty() ) return null;
        return this.errorHolders.get( 0 );
    }

    public ErrorResponseEntry singleErrorHolder()
    {
        if ( this.errorHolders == null )
        {
            throw new IllegalStateException( "No errors to fetch" );
        }
        else if ( this.errorHolders.size() != 1 )
        {
            throw new IllegalStateException( "More than one error to fetch" );
        }
        return this.errorHolders.get( 0 );
    }
}
