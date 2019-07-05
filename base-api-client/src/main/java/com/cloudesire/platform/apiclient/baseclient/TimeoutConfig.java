package com.cloudesire.platform.apiclient.baseclient;

import java.util.concurrent.TimeUnit;

public class TimeoutConfig
{
    private long connectTimeout;
    private long readTimeout;
    private TimeUnit defaultTimeUnit = TimeUnit.MILLISECONDS;

    public long getConnectTimeout()
    {
        return connectTimeout;
    }

    public long getReadTimeout()
    {
        return readTimeout;
    }

    public TimeUnit getDefaultTimeUnit()
    {
        return defaultTimeUnit;
    }

    private TimeoutConfig( Builder builder )
    {
        this.readTimeout = builder.readTimeout;
        this.connectTimeout = builder.connectTimeout;
    }

    public static class Builder
    {
        private long connectTimeout;
        private long readTimeout;

        public Builder setConnectTimeout( int timeout, TimeUnit unit )
        {
            this.connectTimeout = unit.toMillis( timeout );
            return this;
        }

        public Builder setReadTimeout( int timeout, TimeUnit unit )
        {
            this.readTimeout = unit.toMillis( timeout );
            return this;
        }

        public TimeoutConfig build()
        {
            return new TimeoutConfig( this );
        }
    }
}
