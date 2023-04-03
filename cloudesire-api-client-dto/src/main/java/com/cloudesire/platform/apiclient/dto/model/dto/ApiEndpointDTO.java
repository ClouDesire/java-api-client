package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.HttpMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel( description = "A billed HTTP endpoint" )
public class ApiEndpointDTO implements DTO
{
    @ApiModelProperty( "The HTTP method" )
    @NotNull
    private HttpMethod method;

    @ApiModelProperty( value = "The endpoint path", example = "/path" )
    @Size( min = 1, max = 2000 )
    private String path;

    public ApiEndpointDTO( HttpMethod method, String path )
    {
        this.method = method;
        this.path = path;
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

    public String getPath()
    {
        return path;
    }

    public void setPath( String path )
    {
        this.path = path;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ApiEndpointDTO that = (ApiEndpointDTO) o;
        return method == that.method && Objects.equals( path, that.path );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( method, path );
    }

    @Override
    public String toString()
    {
        return method + " " + path;
    }
}
