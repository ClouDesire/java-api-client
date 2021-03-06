package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.utils.ErrorHolder;
import com.liberologico.cloudesire.common.Slugger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @deprecated use ErrorResponseDTO in base api client package
 */
@Deprecated
public class ErrorResponseDTO
{
    private List<String> errors = new ArrayList<>();
    private List<ErrorHolder> errorHolders = new ArrayList<>();

    public ErrorResponseDTO()
    {
    }

    public ErrorResponseDTO( List<ErrorHolder> errorHolder )
    {
        this.setErrorHolders( errorHolder );
    }

    public ErrorResponseDTO( Throwable throwable )
    {
        this( throwable, throwable.getMessage() );
    }

    public ErrorResponseDTO( Throwable throwable, String message )
    {
        this( ErrorHolder.errorHolderDefault( Slugger.slugify( throwable.getClass().getSimpleName() ), message ) );
    }

    public ErrorResponseDTO( ErrorHolder errorHolder )
    {
        this.setErrorHolders( Collections.singletonList( errorHolder ) );
    }

    @Deprecated
    public ErrorResponseDTO( String error )
    {
        this( ErrorHolder.errorHolderDefault( error ) );
    }

    /**
     * @deprecated use {@link #getErrorHolders()}
     */
    @Deprecated
    public List<String> getErrors()
    {
        List<String> errorsList = new ArrayList<>();
        for ( ErrorHolder errorHolder : errorHolders )
        {
            errorsList.add( errorHolder.toString() );
        }
        return errorsList;
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
     * @deprecated use {@link #addErrorHolder(ErrorHolder)} ()}
     */
    @Deprecated
    public void addError( String error )
    {
        this.errors.add( error );
    }

    public List<ErrorHolder> getErrorHolders()
    {
        return errorHolders;
    }

    public ErrorResponseDTO setErrorHolders( List<ErrorHolder> errorHolders )
    {
        this.errorHolders = errorHolders;
        return this;
    }

    public void addErrorHolder( ErrorHolder errorHolder )
    {
        errorHolders.add( errorHolder );
    }

    public ErrorHolder firstErrorHolder()
    {
        if ( this.errorHolders == null || this.errorHolders.isEmpty() ) return null;
        return this.errorHolders.get( 0 );
    }
}
