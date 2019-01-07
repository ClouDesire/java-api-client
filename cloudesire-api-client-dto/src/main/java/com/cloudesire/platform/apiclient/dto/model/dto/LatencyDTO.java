package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Date;

public class LatencyDTO extends BaseEntityDTO
{
    private String url;
    private String parameters;
    private String method;
    private long latencyInMs;
    private int version;
    private Date date;

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public String getParameters()
    {
        return parameters;
    }

    public void setParameters( String parameters )
    {
        this.parameters = parameters;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod( String method )
    {
        this.method = method;
    }

    public long getLatencyInMs()
    {
        return latencyInMs;
    }

    public void setLatencyInMs( long latencyInMs )
    {
        this.latencyInMs = latencyInMs;
    }

    public int getVersion()
    {
        return version;
    }

    public void setVersion( int version )
    {
        this.version = version;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }
}
