package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.response.CallResponse;
import com.cloudesire.platform.apiclient.exceptions.AccessDeniedException;
import com.cloudesire.platform.apiclient.exceptions.BackendException;
import com.cloudesire.platform.apiclient.exceptions.BadRequestException;
import com.cloudesire.platform.apiclient.exceptions.ConflictException;
import com.cloudesire.platform.apiclient.exceptions.InternalServerErrorException;
import com.cloudesire.platform.apiclient.exceptions.MethodNotAllowedException;
import com.cloudesire.platform.apiclient.exceptions.NetworkException;
import com.cloudesire.platform.apiclient.exceptions.ResourceNotFoundException;
import com.cloudesire.platform.apiclient.exceptions.UnprocessableEntityException;
import com.cloudesire.platform.apiclient.response.error.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        return executeFullResponse( call ).getBody();
    }

    public <T> CallResponse<T> executeFullResponse( Call<T> call )
    {
        try
        {
            debugRequest( call );
            retrofit2.Response<T> response = call.execute();
            debugResponse( response );
            if ( response.isSuccessful() ) return new CallResponse<>( response.body(), response.headers().toMultimap() );
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
        ErrorResponse error;
        try
        {
            error = mapper.readValue( response.errorBody().byteStream(), ErrorResponse.class );
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
            case 405: return new MethodNotAllowedException( errorMessage, error );
            case 409: return new ConflictException( errorMessage, error );
            case 422: return new UnprocessableEntityException( errorMessage, error );
            case 500: return new InternalServerErrorException( errorMessage, error );
            default: return new BackendException( String.valueOf( response.code() ), error );
        }
    }
}
