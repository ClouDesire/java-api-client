package com.liberologico.cloudesire.common.enums.dto;

import com.liberologico.cloudesire.common.enums.HttpMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

@Schema( description = "How to execute an API call" )
public class ActionUrlDTO implements Serializable
{
    private static final long serialVersionUID = 5518923410438917060L;

    @Schema( description = "The HTTP URL to execute the action", readOnly = true )
    private String url;

    @Schema( description = "The HTTP method to execute the action", readOnly = true )
    private HttpMethod method;

    @Schema( description = "The name of the resource", example = "Subscription", readOnly = true )
    private String resourceType;

    // region Auto-generated code
    public ActionUrlDTO( String url, HttpMethod method, String resourceType )
    {
        this.url = url;
        this.method = method;
        this.resourceType = resourceType;
    }

    public ActionUrlDTO()
    {
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public HttpMethod getMethod()
    {
        return method;
    }

    public void setMethod( HttpMethod method )
    {
        this.method = method;
    }

    public String getResourceType()
    {
        return resourceType;
    }

    public void setResourceType( String resourceType )
    {
        this.resourceType = resourceType;
    }

    @Override
    public String toString()
    {
        return "ActionUrlDTO [url=" + url + ", method=" + method + ", resourceType=" + resourceType + "]";
    }
    // endregion

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        ActionUrlDTO that = (ActionUrlDTO) o;

        if ( url != null ? !url.equals( that.url ) : that.url != null ) return false;
        if ( method != that.method ) return false;
        return !( resourceType != null ? !resourceType.equals( that.resourceType ) : that.resourceType != null );

    }

    @Override
    public int hashCode()
    {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + ( method != null ? method.hashCode() : 0 );
        result = 31 * result + ( resourceType != null ? resourceType.hashCode() : 0 );
        return result;
    }
}
