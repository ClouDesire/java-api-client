package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.interceptors.UserAgentHeaderInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class AbstractCloudesireClient
{
    private final OkHttpClient.Builder okhttpClientBuilder;
    private final HttpLoggingInterceptor httpLoggingInterceptor;

    protected String baseUrl;
    protected ObjectMapper mapper;
    protected Retrofit retrofit;
    protected OkHttpClient okHttpClient;

    protected AbstractCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent )
    {
        this.baseUrl = baseUrl;
        this.mapper = mapper;

        okhttpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout( 30, TimeUnit.SECONDS )     // connect timeout
                .readTimeout( 60, TimeUnit.SECONDS );        // socket timeout

        addInterceptor( new UserAgentHeaderInterceptor( userAgent ) );

        httpLoggingInterceptor = new HttpLoggingInterceptor( new HttpLoggingInterceptor.Logger()
        {
            @Override
            public void log( String message )
            {
                getLogger().debug( message );
            }
        } );
        setLoggingLevel( HttpLoggingInterceptor.Level.BASIC );
        addInterceptor( httpLoggingInterceptor );

        initialize();
    }

    protected void addInterceptor( Interceptor interceptor )
    {
        okhttpClientBuilder.addInterceptor( interceptor );
    }

    protected abstract Logger getLogger();

    /**
     * Set logging level at runtime
     *
     * @param level verbosity of logging
     */
    public void setLoggingLevel( HttpLoggingInterceptor.Level level )
    {
        httpLoggingInterceptor.setLevel( level );
    }

    /**
     * When implementing a new class, invoke this method at the end of the constructor
     * to correctly initialize the client
     */
    protected void initialize()
    {
        okHttpClient = okhttpClientBuilder.build();
        retrofit = buildRetrofit( okHttpClient );
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
        return Objects.equals( baseUrl, that.baseUrl );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( baseUrl );
    }
}
