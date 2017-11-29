package com.liberologico.cloudesire.cmw.model.dto;

import java.math.BigDecimal;

public class LatencyRequestGroupDTO extends BaseEntityDTO
{
    private BigDecimal avgLatencyInMS;
    private String url;
    private String method;

    public BigDecimal getAvgLatencyInMS()
    {
        return avgLatencyInMS;
    }

    public void setAvgLatencyInMS( BigDecimal avgLatencyInMS )
    {
        this.avgLatencyInMS = avgLatencyInMS;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod( String method )
    {
        this.method = method;
    }
}
