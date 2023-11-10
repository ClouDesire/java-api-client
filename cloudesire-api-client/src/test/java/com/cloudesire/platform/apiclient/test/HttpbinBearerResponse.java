package com.cloudesire.platform.apiclient.test;

import java.util.Map;

public class HttpbinBearerResponse
{
    private boolean authenticated;

    private String token;

    public boolean isAuthenticated()
    {
        return authenticated;
    }

    public void setAuthenticated( boolean authenticated )
    {
        this.authenticated = authenticated;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken( String token )
    {
        this.token = token;
    }
}
