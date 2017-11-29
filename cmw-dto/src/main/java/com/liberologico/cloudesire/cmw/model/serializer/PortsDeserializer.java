package com.liberologico.cloudesire.cmw.model.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.liberologico.cloudesire.cmw.model.dto.DockerComposeServiceDTO;

import java.io.IOException;

public class PortsDeserializer extends JsonDeserializer<DockerComposeServiceDTO.Ports>
{
    @Override
    public DockerComposeServiceDTO.Ports deserialize( JsonParser jp, DeserializationContext ctxt ) throws IOException
    {
        String[] portsPair = jp.getValueAsString().split( ":" );
        return new DockerComposeServiceDTO.Ports( portsPair );
    }
}
