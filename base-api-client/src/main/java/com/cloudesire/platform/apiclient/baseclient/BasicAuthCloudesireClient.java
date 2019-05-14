package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.interceptors.BasicAuthInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;

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
}
