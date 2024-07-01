package com.cloudesire.platform.apiclient.dto.model.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.common.Slugger;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorHolder implements Serializable
{
    private static final long serialVersionUID = -123658322098739224L;

    private String key;
    @NotNull
    private String error;
    private Map<String, String> extraFields = new HashMap<>();

    @JsonInclude( JsonInclude.Include.NON_EMPTY )
    private String requestId;

    @JsonInclude( JsonInclude.Include.NON_EMPTY )
    private List<Serializable> contexts = new ArrayList<>();

    // for jackson
    private ErrorHolder()
    {
        this.error = "";
    }

    /**
     * @param error can contains placeholders in the form of {placeholder} that will be substituted with extraFields contents.
     */
    private ErrorHolder( String key, String error, Map<String, String> extraFields, String requestId,
            List<Serializable> contexts )
    {
        if ( extraFields != null )
        {
            String replacedError = error;
            for ( Map.Entry<String, String> entry : extraFields.entrySet() )
            {
                replacedError = replacedError.replace( String.format( "{%s}", entry.getKey() ), entry.getValue() );
            }
            this.error = replacedError;
            this.extraFields.putAll( extraFields );
        }
        else this.error = error;
        this.requestId = requestId;
        this.contexts = contexts;
        this.key = generateKey( key );
    }

    private String generateKey( String key )
    {
        if ( key != null ) return key;
        return Slugger.slugify( error.trim() );
    }

    public static ErrorHolder errorHolderDefault( String error )
    {
        return new ErrorHolder( null, error, null, null, null );
    }

    public static ErrorHolder errorHolderDefault( String key, String error )
    {
        return new ErrorHolder( key, error, null, null, null );
    }

    public static ErrorHolder errorHolderWithExtraFields( String error, Map<String, String> extraFields )
    {
        return new ErrorHolder( null, error, extraFields, null, null );
    }

    public static ErrorHolder errorHolderWithExtraFields( String key, String error, Map<String, String> extraFields )
    {
        return new ErrorHolder( key, error, extraFields, null, null );
    }

    public static ErrorHolder errorHolderWithRequestID( String error, String requestId )
    {
        return new ErrorHolder( null, error, null, requestId, null );
    }

    public static ErrorHolder errorHolderWithRequestID( String key, String error, String requestId )
    {
        return new ErrorHolder( key, error, null, requestId, null );
    }

    public static ErrorHolder errorHolderWithContexts( String error, List<Serializable> contexts )
    {
        return new ErrorHolder( null, error, null, null, contexts );
    }

    public static ErrorHolder errorHolderWithContexts( String key, String error, List<Serializable> contexts )
    {
        return new ErrorHolder( key, error, null, null, contexts );
    }

    public String getKey()
    {
        return key;
    }

    public void setKey( String key )
    {
        this.key = key;
    }

    public String getError()
    {
        return error;
    }

    public void setError( String error )
    {
        this.error = error;
    }

    public Map<String, String> getExtraFields()
    {
        return extraFields;
    }

    public void setExtraFields( Map<String, String> extraFields )
    {
        this.extraFields = extraFields;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId( String requestId )
    {
        this.requestId = requestId;
    }

    public List<Serializable> getContexts()
    {
        return contexts;
    }

    public void setContexts( List<Serializable> contexts )
    {
        this.contexts = contexts;
    }

    @Override
    public String toString()
    {
        StringBuilder support = new StringBuilder();

        if ( requestId != null && requestId.length() > 0 ) support.append( "reqId: " ).append( requestId ).append( " " );
        if ( error != null && error.length() > 0 ) support.append( error ).append( " " );
        if ( contexts != null && !contexts.isEmpty() ) support.append( "contexts: " ).append( contexts );

        return support.toString().trim();
    }
}
