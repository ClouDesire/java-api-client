package com.liberologico.cloudesire.cmw.model.dto;

import java.util.LinkedHashMap;
import java.util.Map;

public class DockerComposeDTO extends DTO
{
    protected Map<String, DockerComposeServiceDTO> services = new LinkedHashMap<>();

    private String version;

    public Map<String, DockerComposeServiceDTO> getServices()
    {
        return services;
    }

    public DockerComposeDTO setServices( Map<String, DockerComposeServiceDTO> services )
    {
        this.services = services;
        return this;
    }

    public String getVersion()
    {
        return version;
    }

    public DockerComposeDTO setVersion( String version )
    {
        this.version = version;
        return this;
    }
}
