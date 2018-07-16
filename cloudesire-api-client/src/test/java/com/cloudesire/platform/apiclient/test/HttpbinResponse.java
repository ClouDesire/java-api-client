package com.cloudesire.platform.apiclient.test;

import java.util.Map;

public class HttpbinResponse
{
    private Map<String, String> headers;
    private String origin;

    public Map<String, String> getHeaders()
    {
        return headers;
    }

    public void setHeaders( Map<String, String> headers )
    {
        this.headers = headers;
    }

    public String getOrigin()
    {
        return origin;
    }

    public void setOrigin( String origin )
    {
        this.origin = origin;
    }
}
