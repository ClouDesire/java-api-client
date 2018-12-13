package com.cloudesire.platform.apiclient.interceptors;

public class UserAgentHeaderInterceptor extends HeaderInterceptor
{
    public UserAgentHeaderInterceptor( String userAgent )
    {
        super( "User-Agent", userAgent );
    }
}
