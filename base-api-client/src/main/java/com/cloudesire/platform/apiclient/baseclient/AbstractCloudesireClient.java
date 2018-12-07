package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.interceptors.UserAgentHeaderInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class AbstractCloudesireClient
{
    protected String baseUrl;
    protected String userAgent;
    protected ObjectMapper mapper;
    protected Retrofit retrofit;
    protected OkHttpClient okHttpClient;

    protected AbstractCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent )
    {
        this.baseUrl = baseUrl;
        this.mapper = mapper;
        this.userAgent = userAgent;

        OkHttpClient.Builder okhttpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout( 30, TimeUnit.SECONDS )     // connect timeout
                .readTimeout( 60, TimeUnit.SECONDS );        // socket timeout

        replaceInterceptor( okhttpClientBuilder, new UserAgentHeaderInterceptor( this.userAgent ) );
        generateClients( okhttpClientBuilder );
    }

    protected void generateClients( OkHttpClient.Builder okhttpClientBuilder )
    {
        okHttpClient = okhttpClientBuilder.build();
        retrofit = buildRetrofit( okHttpClient );
    }

    protected void replaceInterceptor( OkHttpClient.Builder okhttpClientBuilder, Interceptor newInterceptor )
    {
        List<Interceptor> interceptors = okhttpClientBuilder.interceptors();
        for ( Interceptor interceptor : interceptors )
        {
            if ( interceptor.getClass().equals( newInterceptor.getClass() ) )
            {
                interceptors.remove( interceptor );
                break;
            }
        }
        interceptors.add( newInterceptor );
    }

    public <T> T getApi( Class<T> api )
    {
        return retrofit.create( api );
    }

    private Retrofit buildRetrofit( OkHttpClient okHttpClient )
    {
        return new Retrofit.Builder()
                .addConverterFactory( JacksonConverterFactory.create( mapper ) )
                .baseUrl( baseUrl )
                .client( okHttpClient )
                .validateEagerly( true )
                .build();
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        AbstractCloudesireClient that = (AbstractCloudesireClient) o;
        return Objects.equals( baseUrl, that.baseUrl ) && Objects.equals( userAgent, that.userAgent );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( baseUrl, userAgent );
    }
}
