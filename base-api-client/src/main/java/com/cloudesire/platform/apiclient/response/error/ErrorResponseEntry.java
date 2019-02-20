package com.cloudesire.platform.apiclient.response.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.common.Slugger;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ErrorResponseEntry implements Serializable
{
    private static final long serialVersionUID = -123658322098739224L;

    private String key;
    @NotNull
    private String error;
    private Map<String, String> extraFields = new HashMap<>();

    @JsonInclude( JsonInclude.Include.NON_EMPTY )
    private String requestId;

    // for jackson
    private ErrorResponseEntry()
    {
        this.error = "";
    }

    public ErrorResponseEntry( String key, String message )
    {
        this( key, message, null, null );
    }


    public ErrorResponseEntry( String key, String message, Map<String, String> extraFields )
    {
        this( key, message, extraFields, null );
    }

    /**
     * @param message can contains placeholders in the form of {placeholder} that will be substituted with extraFields contents.
     */
    public ErrorResponseEntry( String key, String message, Map<String, String> extraFields, String requestId )
    {
        if ( extraFields != null )
        {
            String replacedError = message;
            for ( Map.Entry<String, String> entry : extraFields.entrySet() )
            {
                replacedError = replacedError.replace( String.format( "{%s}", entry.getKey() ), entry.getValue() );
            }
            this.error = replacedError;
            this.extraFields.putAll( extraFields );
        }
        else this.error = message;
        this.requestId = requestId;
        this.key = generateKey( key );
    }

    private String generateKey( String key )
    {
        if ( key != null ) return key;
        return Slugger.slugify( error.trim() );
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

    @Override
    public String toString()
    {
        StringBuilder support = new StringBuilder();

        if ( requestId != null && requestId.length() > 0 )
        {
            support.append( "reqId: " ).append( requestId ).append( " " );
        }
        if ( error != null && error.length() > 0 ) support.append( error ).append( " " );

        return support.toString().trim();
    }
}
