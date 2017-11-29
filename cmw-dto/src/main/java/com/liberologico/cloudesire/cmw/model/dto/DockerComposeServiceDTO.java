package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.liberologico.cloudesire.cmw.model.serializer.PortsDeserializer;
import com.liberologico.cloudesire.cmw.model.serializer.VolumeDeserializer;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@JsonIgnoreProperties( ignoreUnknown = true )
public class DockerComposeServiceDTO
{
    @JsonProperty( "container_name" )
    private String containerName;

    private String image;
    private String build;

    private String dockerfile;
    private String command;

    private List<String> links;
    private List<Ports> ports;
    private List<String> expose;
    private List<Volume> volumes;
    private Object environment;

    @JsonIgnore
    public List<String> getCommonDirectories()
    {
        if ( volumes == null ) return Collections.emptyList();

        List<String> output = new LinkedList<>();
        for ( Volume volume : volumes )
        {
            output.add( volume.toString() );
        }

        return output;
    }

    @JsonIgnore
    public Collection<String> getOpenPorts()
    {
        if ( ports == null ) return Collections.emptyList();

        Set<String> output = new HashSet<>();
        for ( Ports port : ports )
        {
            if ( Objects.equals( port.toString(), getWebPort() ) ) continue;
            output.add( port.toString() );
        }

        return output;
    }

    @JsonIgnore
    public String getWebPort()
    {
        if ( ports == null ) return null;

        for ( Ports port : ports )
        {
            if ( port.webLike ) return port.toString();
        }
        return null;
    }

    public String getContainerName()
    {
        return containerName;
    }

    public DockerComposeServiceDTO setContainerName( String containerName )
    {
        this.containerName = containerName;
        return this;
    }

    public String getImage()
    {
        return image;
    }

    public DockerComposeServiceDTO setImage( String image )
    {
        this.image = image;
        return this;
    }

    public String getBuild()
    {
        return build;
    }

    public DockerComposeServiceDTO setBuild( String build )
    {
        this.build = build;
        return this;
    }

    public String getDockerfile()
    {
        return dockerfile;
    }

    public DockerComposeServiceDTO setDockerfile( String dockerfile )
    {
        this.dockerfile = dockerfile;
        return this;
    }

    public String getCommand()
    {
        return command;
    }

    public DockerComposeServiceDTO setCommand( String command )
    {
        this.command = command;
        return this;
    }

    public List<String> getLinks()
    {
        return links;
    }

    public DockerComposeServiceDTO setLinks( List<String> links )
    {
        this.links = links;
        return this;
    }

    public List<Ports> getPorts()
    {
        return ports;
    }

    public DockerComposeServiceDTO setPorts( List<Ports> ports )
    {
        this.ports = ports;
        return this;
    }

    public List<String> getExpose()
    {
        return expose;
    }

    public DockerComposeServiceDTO setExpose( List<String> expose )
    {
        this.expose = expose;
        return this;
    }

    public List<Volume> getVolumes()
    {
        return volumes;
    }

    public DockerComposeServiceDTO setVolumes( List<Volume> volumes )
    {
        this.volumes = volumes;
        return this;
    }

    public Map<String, String> getEnvironment()
    {
        if ( environment instanceof Map) return (Map) environment;
        if ( environment instanceof List)
        {
            Map<String, String> map = new HashMap<>();
            List listEnv = (List) environment;
            for ( Object o : listEnv )
            {
                if ( o instanceof String )
                {
                    String value = (String) o;
                    String[] values = value.split( "=" );
                    if ( values.length == 1 ) map.put( values[0], "" );
                    else map.put( values[0], values[1] );
                }
            }
            return map;
        }
        return new HashMap<>();
    }

    public void setEnvironment( Object environment )
    {
        this.environment = environment;
    }

    @JsonDeserialize( using = PortsDeserializer.class )
    public static class Ports
    {
        static final int[] WEB_PORTS = new int[] { 80, 443, 8080 };

        private int host;
        private int container;
        private boolean webLike;
        private String protocol;

        private static boolean isWebLike( int port, String protocol )
        {
            for ( int webPort : WEB_PORTS )
            {
                if ( port == webPort && ( protocol == null || protocol.equals( "tcp" ) ) ) return true;
            }
            return false;
        }

        public Ports( String[] portsPair )
        {
            if ( portsPair.length < 1 ) throw new IllegalArgumentException( "Ports pair can't be empty" );

            this.host = Integer.parseInt( portsPair[0] );

            try
            {
                this.container = Integer.parseInt( portsPair.length > 1 ? portsPair[1] : portsPair[0] );
            }
            catch ( NumberFormatException e )
            {
                String[] pp = portsPair[1].split( "/" );
                this.container = Integer.parseInt( pp[0] );
                this.protocol = pp[1];
            }

            this.webLike = isWebLike( container, protocol );
        }

        public Ports( int port )
        {
            this( new String[] { String.valueOf( port ) } );
        }

        public Ports( int port, String protocol )
        {
            this( port );
            this.protocol = protocol;
        }

        @Override
        public String toString()
        {
            return String.valueOf( container );
        }

        @Override
        public boolean equals( Object o )
        {
            if ( this == o ) return true;
            if ( o == null || getClass() != o.getClass() ) return false;

            Ports ports = (Ports) o;

            return host == ports.host && container == ports.container;

        }

        @Override
        public int hashCode()
        {
            int result = host;
            result = 31 * result + container;
            return result;
        }
    }

    @JsonDeserialize( using = VolumeDeserializer.class )
    public static class Volume
    {
        private String host;
        private String container;
        private String accessMode;

        public Volume( String[] pieces )
        {
            switch ( pieces.length )
            {
                case 3:
                    this.host = pieces[0];
                    this.container = pieces[1];
                    this.accessMode = pieces[2];
                    break;
                case 2:
                    this.host = pieces[0];
                    this.container = pieces[1];
                    break;
                case 1:
                    this.container = pieces[0];
                    break;
                default:
                    throw new IllegalArgumentException( "Volume string can't be empty" );
            }
        }

        @Override
        public String toString()
        {
            return container;
        }
    }
}
