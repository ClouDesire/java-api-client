package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class DockerComposeV1DTO extends DockerComposeDTO
{
    @JsonAnySetter
    public void addService( String name, DockerComposeServiceDTO service )
    {
        services.put( name, service );
    }
}
