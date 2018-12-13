package com.cloudesire.platform.apiclient.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HeaderInterceptor implements Interceptor
{
    private final String headerName;
    private final String headerValue;

    public HeaderInterceptor( String headerName, String headerValue )
    {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    @Override
    public Response intercept( Chain chain ) throws IOException
    {
        Request request = chain.request().newBuilder()
                .addHeader( headerName, headerValue ).build();
        return chain.proceed( request );
    }
}
