package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.exceptions.AccessDeniedException;
import com.cloudesire.platform.apiclient.exceptions.BackendException;
import com.cloudesire.platform.apiclient.exceptions.BadRequestException;
import com.cloudesire.platform.apiclient.exceptions.InternalServerErrorException;
import com.cloudesire.platform.apiclient.exceptions.NetworkException;
import com.cloudesire.platform.apiclient.exceptions.ResourceNotFoundException;
import com.cloudesire.platform.apiclient.exceptions.UnprocessableEntityException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liberologico.cloudesire.cmw.model.dto.ErrorResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;

import java.io.IOException;

/**
 * Execute retrofit2 Call instances and convert errors to exceptions
 */
public class CloudesireClientCallExecutor
{
    private static final Logger log = LoggerFactory.getLogger( CloudesireClientCallExecutor.class );
    private final ObjectMapper mapper;

    public CloudesireClientCallExecutor( ObjectMapper mapper )
    {
        this.mapper = mapper;
    }

    public <T> T execute( Call<T> call )
    {
        try
        {
            debugRequest( call );
            retrofit2.Response<T> response = call.execute();
            debugResponse( response );
            if ( response.isSuccessful() ) return response.body();
            else throw exceptionHandling( response );
        }
        catch ( IOException e )
        {
            throw new NetworkException( e );
        }
    }

    private <T> void debugResponse( retrofit2.Response<T> response )
    {
        String responseMessage = response.message();
        log.debug( "<<<< {} {}", response.code(), responseMessage );
    }

    private <T> void debugRequest( Call<T> call )
    {
        String method = call.request().method();
        String url = call.request().url().toString();
        log.debug( ">>>> {} {}", method, url );
    }

    private <T> RuntimeException exceptionHandling( retrofit2.Response<T> response )
    {
        String errorMessage = String.valueOf( response.code() );
        ErrorResponseDTO error;
        try
        {
            error = mapper.readValue( response.errorBody().byteStream(), ErrorResponseDTO.class );
            String errors = error.getErrorHolders().toString();
            log.trace( "Parsed error: {}", errors );
            errorMessage = errorMessage + " " + errors;
        }
        catch ( IOException e )
        {
            error = null;
        }

        switch ( response.code() )
        {
            case 400: return new BadRequestException( errorMessage, error );
            case 401: return new AccessDeniedException( errorMessage, error );
            case 403: return new AccessDeniedException( errorMessage, error );
            case 404: return new ResourceNotFoundException( errorMessage, error );
            case 422: return new UnprocessableEntityException( errorMessage, error );
            case 500: return new InternalServerErrorException( errorMessage, error );
            default: return new BackendException( String.valueOf( response.code() ), error );
        }
    }
}
