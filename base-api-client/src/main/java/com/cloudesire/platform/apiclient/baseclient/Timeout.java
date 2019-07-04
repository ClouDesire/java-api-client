package com.cloudesire.platform.apiclient.baseclient;

import java.util.concurrent.TimeUnit;

public class Timeout
{
    private long connectTimeout;
    private long readTimeout;

    public long getConnectTimeout()
    {
        return connectTimeout;
    }

    public long getReadTimeout()
    {
        return readTimeout;
    }

    private Timeout( TimeoutBuilder builder )
    {
        this.readTimeout = builder.readTimeout;
        this.connectTimeout = builder.connectTimeout;
    }

    public static class TimeoutBuilder
    {
        private long connectTimeout;
        private long readTimeout;

        public TimeoutBuilder setConnectTimeout( int timeout, TimeUnit unit )
        {
            this.connectTimeout = unit.toMillis( timeout );
            return this;
        }

        public TimeoutBuilder setReadTimeout( int timeout, TimeUnit unit )
        {
            this.readTimeout = unit.toMillis( timeout );
            return this;
        }

        public Timeout build()
        {
            return new Timeout( this );
        }
    }
}
