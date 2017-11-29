package com.liberologico.cloudesire.cmw.model.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.liberologico.cloudesire.cmw.model.dto.DockerComposeServiceDTO;

import java.io.IOException;

public class VolumeDeserializer extends JsonDeserializer<DockerComposeServiceDTO.Volume>
{
    @Override
    public DockerComposeServiceDTO.Volume deserialize( JsonParser jp, DeserializationContext ctxt ) throws IOException
    {
        String[] pieces = jp.getValueAsString().split( ":" );
        return new DockerComposeServiceDTO.Volume( pieces );
    }
}
