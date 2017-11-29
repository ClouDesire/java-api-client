package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class MetricEndpointDTO
{
    @NotEmpty
    private String completeUrl;

    @NotNull
    @Valid
    private UrlEntityDTO metric;

    public String getCompleteUrl()
    {
        return completeUrl;
    }

    public void setCompleteUrl( String completeUrl )
    {
        this.completeUrl = completeUrl;
    }

    public UrlEntityDTO getMetric()
    {
        return metric;
    }

    public void setMetric( UrlEntityDTO metric )
    {
        this.metric = metric;
    }

    @Override
    public String toString()
    {
        return "MetricEndpointDTO [completeUrl=" + completeUrl + ", metric=" + metric + "]";
    }
}
