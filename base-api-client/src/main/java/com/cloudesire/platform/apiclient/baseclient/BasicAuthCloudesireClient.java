package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.interceptors.BasicAuthInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;

public abstract class BasicAuthCloudesireClient extends AbstractCloudesireClient
{
    protected final String username;
    protected final String password;

    public BasicAuthCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent, String username, String password )
    {
        super( mapper, baseUrl, userAgent );
        this.username = username;
        this.password = password;

        OkHttpClient.Builder okhttpClientBuilder = okHttpClient.newBuilder();

        if ( username != null && password != null )
        {
            okhttpClientBuilder.addInterceptor( new BasicAuthInterceptor( username, password ) );
        }

        generateClients( okhttpClientBuilder );
    }
}
