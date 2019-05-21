package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.interceptors.BasicAuthInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public abstract class BasicAuthCloudesireClient extends AbstractCloudesireClient
{
    protected final String username;
    protected final String password;

    public BasicAuthCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent, String username, String password )
    {
        super( mapper, baseUrl, userAgent );

        this.username = username;
        this.password = password;

        if ( username != null && password != null )
        {
            addInterceptor( new BasicAuthInterceptor( username, password ) );
        }
        initialize();
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        BasicAuthCloudesireClient that = (BasicAuthCloudesireClient) o;
        return Objects.equals( username, that.username ) && Objects.equals( password, that.password );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), username, password );
    }
}
