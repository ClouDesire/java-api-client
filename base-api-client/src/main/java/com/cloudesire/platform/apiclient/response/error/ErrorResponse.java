package com.cloudesire.platform.apiclient.response.error;

import com.liberologico.cloudesire.common.Slugger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorResponse
{
    private List<String> errors = new ArrayList<>();
    private List<ErrorResponseEntry> errorHolders = new ArrayList<>();

    public ErrorResponse()
    {
    }

    public ErrorResponse( List<ErrorResponseEntry> errorHolder )
    {
        this.setErrorHolders( errorHolder );
    }

    public ErrorResponse( Throwable throwable )
    {
        this( throwable, throwable.getMessage() );
    }

    public ErrorResponse( Throwable throwable, String message )
    {
        this( ErrorResponseEntry.errorHolderDefault( Slugger.slugify( throwable.getClass().getSimpleName() ), message ) );
    }

    public ErrorResponse( ErrorResponseEntry errorHolder )
    {
        this.setErrorHolders( Collections.singletonList( errorHolder ) );
    }

    /**
     * @deprecated see {@link com.liberologico.cloudesire.cmw.model.utils.ErrorResponseFactory}
     */
    @Deprecated
    public ErrorResponse( String error )
    {
        this( ErrorResponseEntry.errorHolderDefault( error ) );
    }

    /**
     * @deprecated use {@link #getErrorHolders()}
     */
    @Deprecated
    public List<String> getErrors()
    {
        List<String> errors = new ArrayList<>();
        for ( ErrorResponseEntry errorHolder : errorHolders )
        {
            errors.add( errorHolder.toString() );
        }
        return errors;
    }

    /**
     * @deprecated use {@link #setErrorHolders(List)} ()}
     */
    @Deprecated
    public void setErrors( List<String> errors )
    {
        this.errors = errors;
    }

    /**
     * @deprecated use {@link #addErrorHolder(ErrorResponseEntry)} ()}
     */
    @Deprecated
    public void addError( String error )
    {
        this.errors.add( error );
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
