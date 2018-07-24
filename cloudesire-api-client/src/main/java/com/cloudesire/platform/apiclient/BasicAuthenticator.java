package com.cloudesire.platform.apiclient;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/**
 * @see https://github.com/square/okhttp/wiki/Recipes#handling-authentication
 */
public class BasicAuthenticator implements Authenticator
{
    private static final String HEADER_NAME = "Authorization";
    private String credentials;

    public BasicAuthenticator( String user, String password )
    {
        this.credentials = Credentials.basic( user, password );
    }

    @Override
    public Request authenticate( Route route, Response response )
    {
        if ( response.request().header( HEADER_NAME ) != null )
        {
            return null;
        }
        return response.request().newBuilder().header( HEADER_NAME, credentials ).build();
    }
}
