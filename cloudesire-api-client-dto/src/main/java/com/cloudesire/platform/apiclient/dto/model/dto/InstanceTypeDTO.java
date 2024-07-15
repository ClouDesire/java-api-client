package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Schema( description = "VM instance sizing" )
public class InstanceTypeDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Schema( description = "CPU cores")
    @NotNull
    private Integer cpu;

    @Schema( description = "RAM quantity")
    @NotNull
    private Integer ram;

    @Schema( description = "Root disk space")
    @NotNull
    private Integer rootDiskSpace;

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public Integer getCpu()
    {
        return cpu;
    }

    public void setCpu( Integer cpu )
    {
        this.cpu = cpu;
    }

    public Integer getRam()
    {
        return ram;
    }

    public void setRam( Integer ram )
    {
        this.ram = ram;
    }

    public Integer getRootDiskSpace()
    {
        return rootDiskSpace;
    }

    public void setRootDiskSpace( Integer rootDiskSpace )
    {
        this.rootDiskSpace = rootDiskSpace;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        InstanceTypeDTO that = (InstanceTypeDTO) o;
        return Objects.equals( cloudProvider, that.cloudProvider ) && Objects.equals( cpu, that.cpu ) && Objects
                .equals( ram, that.ram ) && Objects.equals( rootDiskSpace, that.rootDiskSpace );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider, cpu, ram, rootDiskSpace );
    }
}
