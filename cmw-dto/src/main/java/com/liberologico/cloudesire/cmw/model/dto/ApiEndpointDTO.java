package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.enums.HttpMethod;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class ApiEndpointDTO
{
    @NotNull
    private HttpMethod method;

    @Size( min = 1, max = 2000 )
    private String url;

    public ApiEndpointDTO( HttpMethod method, String url )
    {
        this.method = method;
        this.url = url;
    }

    public ApiEndpointDTO()
    {
    }

    public HttpMethod getMethod()
    {
        return method;
    }

    public void setMethod( HttpMethod method )
    {
        this.method = method;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ApiEndpointDTO that = (ApiEndpointDTO) o;
        return method == that.method && Objects.equals( url, that.url );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( method, url );
    }
}
