package com.cloudesire.platform.apiclient.baseclient;

import com.cloudesire.platform.apiclient.baseclient.Timeout.TimeoutBuilder;
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

    private Retrofit retrofit;
    private OkHttpClient okHttpClient;
    protected String baseUrl;
    protected ObjectMapper mapper;

    protected AbstractCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent )
    {
        this(
                mapper,
                baseUrl,
                userAgent,
                new TimeoutBuilder()
                        .setConnectTimeout( 30, TimeUnit.SECONDS )
                        .setReadTimeout( 60, TimeUnit.SECONDS )
                        .build()
        );
    }

    protected AbstractCloudesireClient( ObjectMapper mapper, String baseUrl, String userAgent, Timeout timeout )
    {
        this.baseUrl = baseUrl;
        this.mapper = mapper;

        okhttpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout( timeout.getConnectTimeout(), TimeUnit.MILLISECONDS )     // connect timeout
                .readTimeout( timeout.getReadTimeout(), TimeUnit.MILLISECONDS );          // socket timeout

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

    /**
     * Set logging level at runtime
     *
     * @param level verbosity of logging
     */
    public void setLoggingLevel( HttpLoggingInterceptor.Level level )
    {
        httpLoggingInterceptor.setLevel( level );
    }

    public <T> T getApi( Class<T> api )
    {
        return retrofit.create( api );
    }

    public OkHttpClient getOkHttpClient()
    {
        return okhttpClientBuilder.build();
    }

    protected abstract Logger getLogger();

    protected void addInterceptor( Interceptor interceptor )
    {
        okhttpClientBuilder.addInterceptor( interceptor );
    }

    /**
     * When implementing a new class, invoke this method at the end of the constructor
     * to correctly initialize the client
     */
    protected void initialize()
    {
        okHttpClient = okhttpClientBuilder.build();
        retrofit = buildRetrofit();
    }

    private Retrofit buildRetrofit()
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
