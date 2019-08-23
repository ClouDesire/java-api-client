package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ApiModel( description = "Application package" )
public class ApplicationFileDTO extends FileDTO implements INamedEntityDTO
{
    @ApiModelProperty( "Package version" )
    @NotEmpty
    private String version;

    @ApiModelProperty( "Package name" )
    @NotEmpty
    private String name;

    @ApiModelProperty( "Endpoint patterns for the application" )
    @Valid
    private Set<EndpointPatternDTO> endpointPatterns = new HashSet<>();

    @ApiModelProperty( "Application metrics linked to the application" )
    @Valid
    private List<UrlEntityDTO> applicationMetrics = new ArrayList<>();

    @ApiModelProperty( "Application stack requirements" )
    @Valid
    private List<DependencyDTO> dependencies = new ArrayList<>();

    @ApiModelProperty( "Whether the application is deployable" )
    @NotNull
    private Boolean installable = false;

    @ApiModelProperty( "Product versions linked to the application" )
    @Valid
    private Set<UrlEntityDTO> configurations;

    @ApiModelProperty( "Environment variables for the application" )
    @Valid
    private Set<ApplicationFileEnvironmentDTO> environment = new HashSet<>();

    @JsonIgnore
    public Map<String, String> getEnvironmentMap()
    {
        Map<String, String> output = new HashMap<>();
        for ( ApplicationFileEnvironmentDTO dto : environment )
        {
            output.put( dto.getVariable(), dto.getValue() );
        }
        return output;
    }

    @JsonIgnore
    public void setEnvironmentMap( Map<String, String> environment )
    {
        this.environment.clear();
        String url = this.getSelf();
        for ( Map.Entry<String, String> entry : environment.entrySet() )
        {
            this.environment.add( new ApplicationFileEnvironmentDTO( url, entry.getKey(), entry.getValue()) );
        }
    }

    // region Auto-generated code
    public String getVersion()
    {
        return version;
    }

    public void setVersion( String version )
    {
        this.version = version;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Boolean getInstallable()
    {
        return installable;
    }

    public void setInstallable( Boolean installable )
    {
        this.installable = installable;
    }

    public List<DependencyDTO> getDependencies()
    {
        return dependencies;
    }

    public void setDependencies( List<DependencyDTO> dependencies )
    {
        this.dependencies = dependencies;
    }

    public Set<EndpointPatternDTO> getEndpointPatterns()
    {
        return endpointPatterns;
    }

    public void setEndpointPatterns( Set<EndpointPatternDTO> endpointPatterns )
    {
        this.endpointPatterns = endpointPatterns;
    }

    public Set<ApplicationFileEnvironmentDTO> getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( Set<ApplicationFileEnvironmentDTO> environment )
    {
        this.environment = environment;
    }

    public Set<UrlEntityDTO> getConfigurations()
    {
        return configurations;
    }

    public void setConfigurations( Set<UrlEntityDTO> configurations )
    {
        this.configurations = configurations;
    }

    public List<UrlEntityDTO> getApplicationMetrics()
    {
        return applicationMetrics;
    }

    public void setApplicationMetrics( List<UrlEntityDTO> applicationMetrics )
    {
        this.applicationMetrics = applicationMetrics;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof ApplicationFileDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        ApplicationFileDTO that = (ApplicationFileDTO) o;
        return Objects.equals( version, that.version ) &&
                Objects.equals( name, that.name ) &&
                Objects.equals( endpointPatterns, that.endpointPatterns ) &&
                Objects.equals( dependencies, that.dependencies ) &&
                Objects.equals( installable, that.installable ) &&
                Objects.equals( environment, that.environment );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), version, name, endpointPatterns, dependencies, installable,
                environment );
    }
    // endregion
}
