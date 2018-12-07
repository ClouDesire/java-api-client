package com.cloudesire.platform.apiclient.interceptors;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ParameterInterceptor implements Interceptor
{
    private final String parameterName;
    private final String parameterValue;

    public ParameterInterceptor( String parameterName, String parameterValue )
    {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    @Override
    public Response intercept( Interceptor.Chain chain ) throws IOException
    {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter( parameterName, parameterValue )
                .build();

        Request.Builder requestBuilder = original.newBuilder().url( url );
        Request request = requestBuilder.build();
        return chain.proceed( request );
    }
}
