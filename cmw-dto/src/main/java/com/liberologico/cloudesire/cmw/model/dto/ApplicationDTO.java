package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationDTO
{
    private Integer id;

    @Deprecated
    private List<EndpointDTO> endpoint;
    @Valid
    private UrlEntityDTO applicationFile;
    @Valid
    private List<UrlEntityDTO> availableVersions;
    private String name;
    private List<MetricEndpointDTO> metricEndpoints;
    private Map<String, String> environment = new HashMap<>();

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public UrlEntityDTO getApplicationFile()
    {
        return applicationFile;
    }

    public void setApplicationFile( UrlEntityDTO applicationFile )
    {
        this.applicationFile = applicationFile;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    @Deprecated
    public List<EndpointDTO> getEndpoint()
    {
        return endpoint;
    }

    @Deprecated
    public void setEndpoint( List<EndpointDTO> endpoint )
    {
        this.endpoint = endpoint;
    }

    public List<UrlEntityDTO> getAvailableVersions()
    {
        return availableVersions;
    }

    public void setAvailableVersions( List<UrlEntityDTO> availableVersions )
    {
        this.availableVersions = availableVersions;
    }

    public List<MetricEndpointDTO> getMetricEndpoints()
    {
        return metricEndpoints;
    }

    public void setMetricEndpoints( List<MetricEndpointDTO> metricEndpoints )
    {
        this.metricEndpoints = metricEndpoints;
    }

    public Map<String, String> getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( Map<String, String> environment )
    {
        this.environment = environment;
    }

    @Override
    public String toString()
    {
        return "ApplicationDTO{" +
                "id=" + id +
                ", endpoint=" + endpoint +
                ", applicationFile=" + applicationFile +
                ", availableVersions=" + availableVersions +
                ", name='" + name + '\'' +
                ", metricEndpoints=" + metricEndpoints +
                ", environment=" + environment +
                '}';
    }
}
