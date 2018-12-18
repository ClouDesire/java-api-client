package com.cloudesire.platform.apiclient;

import com.cloudesire.platform.apiclient.interceptors.HeaderInterceptor;

public class CmwAuthTokenInterceptor extends HeaderInterceptor
{
    public CmwAuthTokenInterceptor( String token )
    {
        super("CMW-Auth-Token", token);
    }
}
