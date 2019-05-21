package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        LatencyRequestGroupDTO that = (LatencyRequestGroupDTO) o;
        return Objects.equals( url, that.url ) && Objects.equals( method, that.method );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), url, method );
    }
}
